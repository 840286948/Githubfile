package com.xjk.dao;

import java.util.List;
import java.util.Map;

import com.xjk.entity.Permission;
import com.xjk.entity.User;

public interface PermissionDao {
	/**
	 * 查询该用户的所有权限
	 * @param uid
	 * @return
	 */
	List<Permission> sel_Permission(int uid);
	/**
	 * 查询所有权限
	 * @return
	 */
	List<Permission> queryAll();
	/**
	 * 查询该角色据有的权限
	 * @param roleid
	 * @return
	 */
	List<Integer> sel_RolePermission(int roleid);
	/**
	 * 添加角色权限
	 * @param map
	 * @return
	 */
	int insert_RolePermission(Map<String,Object> map);
	/**
	 * 删除角色权限
	 * @param map
	 * @return
	 */
	int delete_RolePermission(Map<String,Object> map);
}
