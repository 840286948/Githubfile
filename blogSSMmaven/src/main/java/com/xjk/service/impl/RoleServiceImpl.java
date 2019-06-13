package com.xjk.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xjk.dao.RoleDao;
import com.xjk.entity.Role;
import com.xjk.service.RoleService;
@Service("RoleService")
public class RoleServiceImpl implements RoleService {

	@Resource
	RoleDao roleDao;
	
	@Override
	public List<Integer> sel_UserRole(int roleid) {
		try {
			return roleDao.sel_UserRole(roleid);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Role> sel_All() {
		try {
			return roleDao.sel_All();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int delete_UserRole(Map<String, Object> map) {
		try {
			return roleDao.delete_UserRole(map);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int insert_UserRole(Map<String, Object> map) {
		try {
			return roleDao.insert_UserRole(map);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int insert_Role(Role r) {
		try {
			return roleDao.insert_Role(r);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int delete_Role(int id) {
		try {
			return roleDao.delete_Role(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public long sel_userRoleCount() {
		try {
			return roleDao.sel_userRoleCount();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

}
