package com.mogu.blog.xo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mogu.blog.commons.entity.ExceptionLog;
import com.mogu.blog.utils.DateUtils;
import com.mogu.blog.utils.StringUtils;
import com.mogu.blog.xo.global.SQLConf;
import com.mogu.blog.xo.global.SysConf;
import com.mogu.blog.xo.mapper.ExceptionLogMapper;
import com.mogu.blog.xo.service.ExceptionLogService;
import com.mogu.blog.xo.vo.ExceptionLogVO;
import com.blog.base.enums.EStatus;
import com.blog.base.global.Constants;
import com.blog.base.serviceImpl.SuperServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 操作日志 服务实现类
 *
 * @author limbo
 * @date 2018-09-30
 */
@Service
public class ExceptionLogServiceImpl extends SuperServiceImpl<ExceptionLogMapper, ExceptionLog> implements ExceptionLogService {

    @Autowired
    private ExceptionLogService exceptionLogService;

    @Override
    public IPage<ExceptionLog> getPageList(ExceptionLogVO exceptionLogVO) {
        QueryWrapper<ExceptionLog> queryWrapper = new QueryWrapper<>();
        if (!StringUtils.isEmpty(exceptionLogVO.getKeyword())) {
            queryWrapper.like(SQLConf.CONTENT, exceptionLogVO.getKeyword());
        }

        if (!StringUtils.isEmpty(exceptionLogVO.getOperation())) {
            queryWrapper.like(SQLConf.OPERATION, exceptionLogVO.getOperation());
        }

        if (!StringUtils.isEmpty(exceptionLogVO.getStartTime())) {
            String[] time = exceptionLogVO.getStartTime().split(SysConf.FILE_SEGMENTATION);
            if (time.length == Constants.NUM_TWO) {
                queryWrapper.between(SQLConf.CREATE_TIME, DateUtils.str2Date(time[0]), DateUtils.str2Date(time[1]));
            }
        }

        Page<ExceptionLog> page = new Page<>();
        page.setCurrent(exceptionLogVO.getCurrentPage());
        page.setSize(exceptionLogVO.getPageSize());
        queryWrapper.eq(SQLConf.STATUS, EStatus.ENABLE);
        queryWrapper.orderByDesc(SQLConf.CREATE_TIME);
//        queryWrapper.select(ExceptionLog.class, i -> !i.getProperty().equals(SQLConf.EXCEPTION_JSON));
        IPage<ExceptionLog> pageList = exceptionLogService.page(page, queryWrapper);
        return pageList;
    }
}
