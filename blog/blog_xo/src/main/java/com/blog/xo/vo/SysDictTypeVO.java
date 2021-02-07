package com.mogu.blog.xo.vo;

import com.blog.base.validator.annotion.IntegerNotNull;
import com.blog.base.validator.annotion.NotBlank;
import com.blog.base.validator.group.Insert;
import com.blog.base.validator.group.Update;
import com.blog.base.vo.BaseVO;
import lombok.Data;

/**
 * <p>
 * SysDictTypeVO
 * </p>
 *
 * @author
 * @since 2020年2月15日21:20:03
 */
@Data
public class SysDictTypeVO extends BaseVO<SysDictTypeVO> {


    /**
     * 自增键 oid
     */
    private Long oid;

    /**
     * 字典名称
     */
    @NotBlank(groups = {Insert.class, Update.class})
    private String dictName;

    /**
     * 字典类型
     */
    @NotBlank(groups = {Insert.class, Update.class})
    private String dictType;

    /**
     * 是否发布  1：是，0:否，默认为0
     */
    @NotBlank(groups = {Insert.class, Update.class})
    private String isPublish;

    /**
     * 备注
     */
    private String remark;

    /**
     * 排序字段
     */
    @IntegerNotNull(groups = {Insert.class, Update.class})
    private Integer sort;

}
