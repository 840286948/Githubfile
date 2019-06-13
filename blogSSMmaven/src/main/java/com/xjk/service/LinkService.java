package com.xjk.service;

import java.util.List;
import java.util.Map;

import com.xjk.entity.Link;
import com.xjk.util.PageBean;

public interface LinkService {
	/**
	 * 分页查询
	 * @param map
	 * @return
	 */
	PageBean sel_Limit(Map<String,Integer> map);
	/**
	 * 总条数
	 * @return
	 */
	long sel_count();
	/**
	 * id查询友链
	 * @param id
	 * @return
	 */
	Link query_Id(Integer id);
	/**
	 * 添加友链
	 * @param l
	 * @return
	 */
	int insert_Link(Link l);
	/**
	 * 修改有友链
	 * @param l
	 * @return
	 */
	int update_Link(Link l);
	/**
	 * 删除友链
	 * @param id
	 * @return
	 */
	int delete_Link(int[] lid);
	/**
	 * 分页查询
	 * @param map
	 * @return
	 */
	List<Link> sel_All(Map<String,Integer> map);
}
