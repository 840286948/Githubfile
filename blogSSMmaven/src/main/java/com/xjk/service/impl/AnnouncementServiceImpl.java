package com.xjk.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xjk.dao.AnnouncementDao;
import com.xjk.entity.Announcement;
import com.xjk.service.AnnouncementService;
import com.xjk.util.PageBean;
@Service("announcementService")
public class AnnouncementServiceImpl implements AnnouncementService{
	
	@Resource
	AnnouncementDao announcementDao;
	
	@Override
	public PageBean sel_Announcement(Map<String, Object> map) {
		try {
			int tota = (int)announcementDao.sel_count();
			return new PageBean(announcementDao.sel_Announcement(map),Integer.parseInt(map.get("currentPage")+""),tota,Integer.parseInt(map.get("length")+""));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Announcement queryId(int id) {
		try {
			return announcementDao.queryId(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public long sel_count() {
		try {
			return announcementDao.sel_count();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int insert_Announcement(Announcement a) {
		try {
			return announcementDao.insert_Announcement(a);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int update_Announcement(Announcement a) {
		try {
			return announcementDao.update_Announcement(a);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int delete_Announcement(String[] aid) {
		try {
			return announcementDao.delete_Announcement(aid);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public List<Announcement> sel_All(Map<String, Object> map) {
		try {
			return announcementDao.sel_Announcement(map);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
