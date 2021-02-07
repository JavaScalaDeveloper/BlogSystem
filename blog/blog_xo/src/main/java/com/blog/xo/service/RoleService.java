package com.mogu.blog.xo.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.mogu.blog.commons.entity.Role;
import com.mogu.blog.xo.vo.RoleVO;
import com.blog.base.service.SuperService;

/**
 * 角色表 服务类
 *
 * @author 
 * @date 2018-09-04
 */
public interface RoleService extends SuperService<Role> {

    /**
     * 获取角色列表
     *
     * @param roleVO
     * @return
     */
    public IPage<Role> getPageList(RoleVO roleVO);

    /**
     * 新增角色
     *
     * @param roleVO
     */
    public String addRole(RoleVO roleVO);

    /**
     * 编辑角色
     *
     * @param roleVO
     */
    public String editRole(RoleVO roleVO);

    /**
     * 删除角色
     *
     * @param roleVO
     */
    public String deleteRole(RoleVO roleVO);

}
