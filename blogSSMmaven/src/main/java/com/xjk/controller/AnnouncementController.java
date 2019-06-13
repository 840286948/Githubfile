package com.xjk.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xjk.entity.Announcement;
import com.xjk.service.AnnouncementService;

/**
 * 公告
 * @author Administrator
 *
 */
@Controller
@RequestMapping("ann")
public class AnnouncementController {
	@Resource
	AnnouncementService announcementService;
	
	@RequestMapping("list")
	public String list(HttpServletRequest request){//分页查询所有公告
		try {
			String current = request.getParameter("current");
			if(current == null || "".equals(current)){
				current = "1";
			}
			Map<String,Object> map = new HashMap<>();
			map.put("current", (Integer.parseInt(current)-1)*10);//第几条显示的数据
			map.put("currentPage",current);//当前页
			map.put("length", 5);//每页显示数据
			request.setAttribute("annList", announcementService.sel_Announcement(map));
		} catch (Exception e) {
			System.out.println("查询失败");
			e.printStackTrace();
		}
		return "houtaiblog/notice";
	}
	
	@RequestMapping("addUpdAnn")
	public String addUpd(Announcement a){//添加修改公告
		if(a.getAnnouncement_content() != null && a.getAnnouncement_describe() != null &&
			a.getAnnouncement_keyword() != null && a.getAnnouncement_title() != null){
			if(a.getId() != null && a.getId() != 0){
				announcementService.update_Announcement(a);
			}else{
				announcementService.insert_Announcement(a);
			}
			return "redirect:list.do";
		}
		return "error";
	}
	
	@RequestMapping("queryId")
	public String queryId(HttpServletRequest req){
		try {
			String id = req.getParameter("id");
			if(id != null){
				req.setAttribute("ann", announcementService.queryId(Integer.parseInt(id)));
				return "houtaiblog/addupd-notice";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "error";
	}
	
	@RequestMapping("delAnn")
	public String delAnn(HttpServletRequest req){
		try {
			String[] id = req.getParameterValues("aid");
			if(id != null && id.length > 0){
				req.setAttribute("ann", announcementService.delete_Announcement(id));
				return "redirect:list.do";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "error";
	}
}
