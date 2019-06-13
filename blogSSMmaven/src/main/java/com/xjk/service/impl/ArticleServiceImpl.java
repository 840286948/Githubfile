package com.xjk.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xjk.dao.ArticleDao;
import com.xjk.entity.Article;
import com.xjk.service.ArticleService;
import com.xjk.util.PageBean;
@Service("articleService")
public class ArticleServiceImpl implements ArticleService{

	@Resource
	ArticleDao articleDao;
	
	@Override
	public int insert_Article(Article a) {
		try {
			return articleDao.insert_Article(a);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int update_Article(Article a) {
		try {
			return articleDao.update_Article(a);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public PageBean sel_Limit(Map<String,Object> map) {
		try {
			int size = (int) articleDao.sel_count(map);
			return new PageBean(articleDao.sel_Limit(map), Integer.parseInt(map.get("currentPage")+""), size, Integer.parseInt(map.get("length")+""));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public long sel_count(Map<String,Object> map) {
		try {
			return articleDao.sel_count(map);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public Article query_Id(int id) {
		try {
			return articleDao.query_Id(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int delete_Article(int[] aid) {
		try {
			return articleDao.delete_Article(aid);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public List<Article> sel_Article(Map<String, Object> map) {
		try {
			return articleDao.sel_Limit(map);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
