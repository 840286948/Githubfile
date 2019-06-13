package com.xjk.service;

import java.util.List;
import java.util.Map;

import com.xjk.entity.Article;
import com.xjk.util.PageBean;

public interface ArticleService {
	/**
	 * 添加文章
	 * @param a
	 * @return
	 */
	int insert_Article(Article a);
	/**
	 * 修改文章
	 * @param a
	 * @return
	 */
	int update_Article(Article a);
	/**
	 * 分页查询文章封装到PageBean里去
	 * @param map
	 * @return
	 */
	PageBean sel_Limit(Map<String,Object> map);
	/**
	 * 查询总条数
	 * @param keywords
	 * @return
	 */
	long sel_count(Map<String,Object> map);
	/**
	 * id查询
	 * @param id
	 * @return
	 */
	Article query_Id(int id);
	/**
	 * 批量删除
	 * @param aid
	 * @return
	 */
	int delete_Article(int[] aid);
	/**
	 * 查询文章
	 * @param map
	 * @return
	 */
	List<Article> sel_Article(Map<String,Object> map);
}
