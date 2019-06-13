package com.xjk.dao;

import java.util.List;
import java.util.Map;

import com.xjk.entity.Role;

public interface RoleDao {
	/**
	 * 查询该角色具有的用户
	 * @param userid  用户id
	 * @return
	 */
	List<Integer> sel_UserRole(int roleid);
	/**
	 * 查询所有角色
	 * @return
	 */
	List<Role> sel_All();
	/**
	 * 查询用户和角色的关系
	 * @param map
	 * @return
	 */
	int delete_UserRole(Map<String,Object> map);
	/**
	 * 添加用户和角色的关系
	 * @param map
	 * @return
	 */
	int insert_UserRole(Map<String,Object> map);
	/**
	 * 添加角色
	 * @param r
	 * @return
	 */
	int insert_Role(Role r);
	/**
	 * 删除角色
	 * @param id
	 * @return
	 */
	int delete_Role(int id);
	/**
	 * 查询管理员总数
	 * @return
	 */
	long sel_userRoleCount();
}
