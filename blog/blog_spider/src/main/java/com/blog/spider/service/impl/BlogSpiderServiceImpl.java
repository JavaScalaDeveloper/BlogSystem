package com.mogu.blog.spider.service.impl;


import com.mogu.blog.spider.entity.BlogSpider;
import com.mogu.blog.spider.mapper.BlogSpiderMapper;
import com.mogu.blog.spider.service.BlogSpiderService;
import com.blog.base.serviceImpl.SuperServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 博客爬取服务实现类
 * </p>
 *
 * @author
 * @since 2020年2月7日21:29:42
 */
@Slf4j
@Service
public class BlogSpiderServiceImpl extends SuperServiceImpl<BlogSpiderMapper, BlogSpider> implements BlogSpiderService {

}
