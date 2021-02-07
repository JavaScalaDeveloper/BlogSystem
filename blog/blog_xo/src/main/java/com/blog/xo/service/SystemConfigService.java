package com.mogu.blog.xo.service;

import com.mogu.blog.commons.entity.SystemConfig;
import com.mogu.blog.xo.vo.SystemConfigVO;
import com.blog.base.service.SuperService;

import java.util.List;

/**
 * 系统配置表 服务类
 *
 * @author
 * @datge 2020年1月21日09:05:53
 */
public interface SystemConfigService extends SuperService<SystemConfig> {

    /**
     * 获取系统配置
     *
     * @return
     */
    public SystemConfig getConfig();

    /**
     * 通过Key前缀清空Redis缓存
     *
     * @param key
     * @return
     */
    public String cleanRedisByKey(List<String> key);

    /**
     * 修改系统配置
     *
     * @param systemConfigVO
     * @return
     */
    public String editSystemConfig(SystemConfigVO systemConfigVO);
}
