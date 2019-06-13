package com.xjk.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xjk.dao.ColumnDao;
import com.xjk.entity.Column;
import com.xjk.service.ColumnService;
@Service("columnService")
public class ColumnServiceImpl implements ColumnService{
	
	@Resource
	ColumnDao columnDao;
	
	@Override
	public Column query_Id(int id) {
		try {
			return columnDao.query_Id(id);
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public List<Column> sel_ColumnAll() {
		try {
			return columnDao.sel_ColumnAll();
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public int insert_Column(Column c) {
		try {
			return columnDao.insert_Column(c);
		} catch (Exception e) {
			return 0;
		}
	}

	@Override
	public int update_Column(Column c) {
		try {
			return columnDao.update_Column(c);
		} catch (Exception e) {
			return 0;
		}
	}

	@Override
	public int delete_Column(int id) {
		try {
			return columnDao.delete_Column(id);
		} catch (Exception e) {
			return 0;
		}
	}

	@Override
	public Column query_name(Column c) {
		try {
			return columnDao.query_name(c);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Column> query_All() {
		try {
			return columnDao.query_All();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
