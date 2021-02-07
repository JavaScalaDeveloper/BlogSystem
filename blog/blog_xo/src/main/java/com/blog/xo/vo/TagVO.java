package com.mogu.blog.xo.vo;

import com.blog.base.validator.annotion.NotBlank;
import com.blog.base.validator.group.Insert;
import com.blog.base.validator.group.Update;
import com.blog.base.vo.BaseVO;
import lombok.Data;

/**
 * BlogVO
 *
 * @author:
 * @create: 2019年12月4日12:26:36
 */
@Data
public class TagVO extends BaseVO<TagVO> {

    /**
     * 标签内容
     */
    @NotBlank(groups = {Insert.class, Update.class})
    private String content;

    /**
     * 排序字段
     */
    private Integer sort;

    /**
     * 无参构造方法，初始化默认值
     */
    TagVO() {

    }

}
