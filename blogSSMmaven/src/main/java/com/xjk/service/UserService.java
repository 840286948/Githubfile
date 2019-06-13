package com.xjk.service;

import java.util.List;

import com.xjk.entity.User;

public interface UserService {
	/**
	 * 登录
	 * @param u 参数
	 * @return User单条数据
	 */
	User sel_login(User u);
	/**
	 * 根据名字查询   名字为唯一键
	 * @param u 参数
	 * @return User单条数据
	 */
	User sel_Name(String username);
	/**
	 * 添加用户
	 * @param u
	 * @return 1
	 */
	int insert_User(User u);
	/**
	 * 查询所有用户
	 * @return  List所有用户
	 */
	List<User> 	sel_User();
	/**
	 * id查询
	 * @param id
	 * @return User单条数据
	 */
	User queryById(int id);
	/**
	 * 修改用户资料
	 * @param u
	 * @return
	 */
	int update_User(User u);
	/**
	 * 删除用户
	 * @param id
	 * @return 
	 */
	int delete_User(int id);
	/**
	 * 查询所有用户
	 * @param fenpei
	 * @return
	 */
	List<User> sel_All();
}
