package com.xjk.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xjk.dao.UserDao;
import com.xjk.entity.User;
import com.xjk.service.UserService;
@Service("useService")
public class UserServiceImpl implements UserService {
	@Resource
	UserDao userDao;
	
	@Override
	public User sel_login(User u) {
		try {
			User user = userDao.sel_Name(u.getUsername());
			if(user != null && user.getPassword().equals(u.getPassword())){
				return user;
			}
		} catch (Exception e) {
			System.out.println("登录失败");
			return null;
		}
		return null;
	}

	@Override
	public int insert_User(User u) {
		try {
			return userDao.insert_User(u);
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public List<User> sel_User() {
		try {
			List<User> u = userDao.sel_User();
			return u;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public User queryById(int id) {
		try {
			return userDao.queryById(id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public User sel_Name(String username) {
		try {
			return userDao.sel_Name(username);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public int update_User(User u) {
		try {
			return userDao.update_User(u);
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int delete_User(int id) {
		try {
			return userDao.delete_User(id);
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public List<User> sel_All() {
		try {
			return userDao.sel_All();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}


}
