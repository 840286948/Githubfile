package com.xjk.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.xjk.entity.UserLog;
import com.xjk.util.PageBean;

public interface UserLogService {
	/**
	 * 添加登录日志
	 * @param ul
	 * @return
	 */
	int insert_log(UserLog ul);
	/**
	 * 查询总记录数
	 * @return
	 */
	long sel_count(Map<String,Integer> map);
	/**
	 * 查询该用户登录记录
	 * @param uid
	 * @return
	 */
	List<UserLog> sel_queryAll(int uid);
	/**
	 * 分页查询
	 * @param current
	 * @param length
	 * @return
	 */
	PageBean sel_limit(Map<String,Integer> map);
	/**
	 * 删除登录日志
	 * @param uid
	 * @return
	 */
	int delete_UserLog(int lid,int uid);
	/**
	 * 修改状态为以看
	 * @return
	 */
	int update_Log(int uid);
	/**
	 * 查询最新登录时间
	 * @param uid
	 * @param createTime
	 * @return
	 */
	UserLog sel_lastLog(int uid,String createTime);
}
