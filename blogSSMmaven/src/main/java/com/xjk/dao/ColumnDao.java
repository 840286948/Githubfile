package com.xjk.dao;

import java.util.List;

import com.xjk.entity.Column;

public interface ColumnDao {
	/**
	 * 根据id查询单条数据
	 * @param id
	 * @return
	 */
	Column query_Id(int id);
	/**
	 * 查询所有栏目
	 * @return
	 */
	List<Column> sel_ColumnAll();
	/**
	 * 添加栏目
	 * @param c
	 * @return
	 */
	int insert_Column(Column c);
	/**
	 * 修改栏目
	 * @param c
	 * @return
	 */
	int update_Column(Column c);
	/**
	 * 删除栏目
	 * @param id
	 * @return
	 */
	int delete_Column(int id);
	/**
	 * 查询栏目名称
	 * @param c
	 * @return
	 */
	Column query_name(Column c);
	/**
	 * 查询所有栏目没有关联查询
	 * @return
	 */
	List<Column> query_All();
}
