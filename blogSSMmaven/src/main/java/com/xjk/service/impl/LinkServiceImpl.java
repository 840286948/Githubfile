package com.xjk.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xjk.dao.LinkDao;
import com.xjk.entity.Link;
import com.xjk.service.LinkService;
import com.xjk.util.PageBean;

@Service("linkService")
public class LinkServiceImpl implements LinkService{

	@Resource
	LinkDao linkDao;

	@Override
	public PageBean sel_Limit(Map<String, Integer> map) {
		try {
			int size = (int) linkDao.sel_count();
			return new PageBean(linkDao.sel_Limit(map), map.get("currentPage"), size, map.get("length"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public long sel_count() {
		try {
			return linkDao.sel_count();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public Link query_Id(Integer id) {
		try {
			return linkDao.query_Id(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int insert_Link(Link l) {
		try {
			return linkDao.insert_Link(l);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int update_Link(Link l) {
		try {
			return linkDao.update_Link(l);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int delete_Link(int[] lid) {
		try {
			return linkDao.delete_Link(lid);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public List<Link> sel_All(Map<String, Integer> map) {
		try {
			return linkDao.sel_Limit(map);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	
}
