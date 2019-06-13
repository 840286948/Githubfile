package com.xjk.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xjk.entity.Column;
import com.xjk.service.ColumnService;
/**
 * 栏目
 * @author Administrator
 *
 */
@Controller
@RequestMapping("column")
public class ColumnController {
	@Resource
	ColumnService columnService;
	
	@RequestMapping("list")
	public String list(HttpServletRequest request){//查询栏目
		try {
			request.setAttribute("columnList", columnService.sel_ColumnAll());
		} catch (Exception e) {
			System.out.println("查询失败");
			e.printStackTrace();
			return "error";
		}
		return "houtaiblog/category";
	}
	
	@RequestMapping("insertUpd")
	public String insertUpd(Column c){//修改添加栏目
		try {
			if(c.getId() != null && c.getId() != 0){
				columnService.update_Column(c);
			}else{
				columnService.insert_Column(c);
			}
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
		return "redirect:list.do";
	}
	
	@RequestMapping("deleteColumn")
	public String deleteColumn(HttpServletRequest req){//删除栏目
		String id = req.getParameter("id");
		if(id != null){
			columnService.delete_Column(Integer.parseInt(id));
		}else{
			return "error";
		}
		return "redirect:list.do";
	}
	
	@RequestMapping("queryId")
	public String queryId(HttpServletRequest req){//修改时查询
		try {
			String id = req.getParameter("id");
			if(id != null){
				req.setAttribute("column", columnService.query_Id(Integer.parseInt(id)));
				return "houtaiblog/update-category";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "error";
	}
	@ResponseBody
	@RequestMapping("AjaxName")
	public String ajaxName(Column c){//判断栏目名称是否已经添加
		Column column = columnService.query_name(c);
		if(column == null){
			return "true";
		}
		return "false";
	}
	
}
