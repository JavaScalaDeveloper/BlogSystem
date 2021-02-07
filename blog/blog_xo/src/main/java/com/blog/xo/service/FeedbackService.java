package com.mogu.blog.xo.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.mogu.blog.commons.entity.Feedback;
import com.mogu.blog.xo.vo.FeedbackVO;
import com.blog.base.service.SuperService;

import java.util.List;

/**
 * 反馈表 服务类
 *
 * @author
 * @date 2018-09-08
 */
public interface FeedbackService extends SuperService<Feedback> {

    /**
     * 获取反馈列表
     *
     * @param feedbackVO
     * @return
     */
    public IPage<Feedback> getPageList(FeedbackVO feedbackVO);

    /**
     * 新增反馈
     *
     * @param feedbackVO
     */
    public String addFeedback(FeedbackVO feedbackVO);

    /**
     * 编辑反馈
     *
     * @param feedbackVO
     */
    public String editFeedback(FeedbackVO feedbackVO);

    /**
     * 批量删除反馈
     *
     * @param feedbackVOList
     */
    public String deleteBatchFeedback(List<FeedbackVO> feedbackVOList);
}
