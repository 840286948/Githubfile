package com.xjk.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xjk.dao.CommentDao;
import com.xjk.entity.Comment;
import com.xjk.service.CommentService;
@Service("commentService")
public class CommentServiceImpl implements CommentService{
	
	@Resource
	CommentDao commentDao;
	
	@Override
	public List<Comment> sel_All(Map<String,Integer> map) {
		try {
			return commentDao.sel_All(map);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int delete_Comment(int[] cid) {
		try {
			return commentDao.delete_Comment(cid);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public Comment query_id(int cid) {
		try {
			return commentDao.query_id(cid);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int update_Comment(int cid) {
		try {
			return commentDao.update_Comment(cid);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public long sel_count(int status) {
		try {
			return commentDao.sel_count(status);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int insert_Comment(Comment c) {
		try {
			return commentDao.insert_Comment(c);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

}
