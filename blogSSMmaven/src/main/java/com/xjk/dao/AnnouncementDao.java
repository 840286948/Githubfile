package com.xjk.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.xjk.entity.Announcement;

public interface AnnouncementDao {
	/**
	 * 分页查询公告
	 * @param map
	 * @return
	 */
	List<Announcement> sel_Announcement(Map<String,Object> map);
	/**
	 * 根据id查询
	 * @param id
	 * @return
	 */
	Announcement queryId(int id);
	/**
	 * 公告总条数
	 * @return
	 */
	long sel_count();
	/**
	 * 添加
	 * @param a
	 * @return
	 */
	int insert_Announcement(Announcement a);
	/**
	 * 修改
	 * @param a
	 * @return
	 */
	int update_Announcement(Announcement a);
	/**
	 * 删除
	 * @param id
	 * @return
	 */
	int delete_Announcement(@Param("aid")String[] aid);
}
