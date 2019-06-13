package com.xjk.service.impl;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xjk.dao.PermissionDao;
import com.xjk.entity.Permission;
import com.xjk.entity.User;
import com.xjk.service.PermissionService;
@Service("permissionService")
public class PermissionServiceImpl implements PermissionService {
	
	@Resource
	PermissionDao permissionDao;
	
	@Override
	public Map<String,Permission> sel_Permission(int uid) {
		Map<String,Permission> parent = new LinkedHashMap<>();
		for (Permission p : permissionDao.sel_Permission(uid)) {
			parent.put(p.getUrl(), p);
		}
		return parent;
	}

	@Override
	public List<Permission> queryAll() {
		try {
			return permissionDao.queryAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Integer> sel_RolePermission(int roleid) {
		try {
			return permissionDao.sel_RolePermission(roleid);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int insert_RolePermission(Map<String, Object> map) {
		try {
			return permissionDao.insert_RolePermission(map);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int delete_RolePermission(Map<String, Object> map) {
		try {
			return permissionDao.delete_RolePermission(map);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

}
