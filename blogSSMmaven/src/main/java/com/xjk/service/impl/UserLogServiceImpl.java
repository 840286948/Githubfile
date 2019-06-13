package com.xjk.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xjk.dao.UserLogDao;
import com.xjk.entity.UserLog;
import com.xjk.service.UserLogService;
import com.xjk.util.PageBean;
@Service("userLogService")
public class UserLogServiceImpl implements UserLogService{
	
	@Resource
	UserLogDao userLogDao;
	
	@Override
	public int insert_log(UserLog ul) {
		try {
			return userLogDao.insert_log(ul);
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public long sel_count(Map<String,Integer> map) {
		try {
			return userLogDao.sel_count(map);
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public List<UserLog> sel_queryAll(int uid) {
		try {
			return userLogDao.sel_queryAll(uid);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public PageBean sel_limit(Map<String,Integer> map) {
		try {
			int size = (int) userLogDao.sel_count(map);
			System.out.println(map.get("length")+"-----------");
			return new PageBean(userLogDao.sel_limit(map), map.get("currentPage"), size, map.get("length"));
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public int delete_UserLog(int lid,int uid) {
		try {
			return userLogDao.delete_UserLog(lid,uid);
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int update_Log(int uid) {
		try {
			return userLogDao.update_Log(uid);
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public UserLog sel_lastLog(int uid, String createTime) {
		try {
			return userLogDao.sel_lastLog(uid, createTime);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
