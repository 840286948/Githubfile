package com.xjk.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.xjk.entity.Comment;

public interface CommentService {
	/**
	 * 查询所有评论 或 查询该文章的所有评论
	 * @param articleId
	 * @return
	 */
	List<Comment> sel_All(Map<String,Integer> map);
	/**
	 * 删除评论  
	 * @param cid
	 * @return
	 */
	int delete_Comment(@Param("cid")int[] cid);
	/**
	 * 查询评论信息
	 * @param cid
	 * @return
	 */
	Comment query_id(int cid);
	/**
	 * 修改评论状态为已读
	 * @param cid
	 * @return
	 */
	int update_Comment(int cid);
	/**
	 * 查询所有评论总数  和未读的评论总数
	 * @param status
	 * @return
	 */
	long sel_count(int status);
	/**
	 * 添加评论
	 * @param c
	 * @return
	 */
	int insert_Comment(Comment c);
}
