package com.xjk.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xjk.entity.Link;
import com.xjk.service.LinkService;
/**
 * 友情链接
 * @author Administrator
 *
 */
@Controller
@RequestMapping("other")
public class LinkController {
	
	@Resource
	LinkService linkService;
	
	@RequestMapping("link")
	public String list(HttpServletRequest request){//分页查询友链
		try {
			String current = request.getParameter("current");
			if(current == null || "".equals(current)){
				current = "1";
			}
			Map<String,Integer> map = new HashMap<>();
			map.put("current", (Integer.parseInt(current)-1)*5);//第几条显示的数据
			map.put("currentPage",Integer.parseInt(current));//当前页
			map.put("length", 5);//每页显示数据
			request.setAttribute("linkList", linkService.sel_Limit(map));
			request.setAttribute("count", linkService.sel_count());
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
		return "houtaiblog/link";
	}
	
	@RequestMapping("addupdLink")
	public String addupd(Link link){//修改添加友链
		try {
			if(link.getId() != null && link.getId() != 0){
				linkService.update_Link(link);
			}else{
				linkService.insert_Link(link);
			}
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
		return "redirect:link.do";
	}
	
	@RequestMapping("queryId")
	public String queryId(HttpServletRequest req){//
		try {
			String id = req.getParameter("id");
			if(id != null){
				req.setAttribute("links", linkService.query_Id(Integer.parseInt(id)));
				return "houtaiblog/addupd-link";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "error";
	}
	
	@RequestMapping("deleteLink")
	public String deleteLink(int[] lid){//删除友链
		if(lid != null){
			linkService.delete_Link(lid);
		}
		return "redirect:link.do";
	}
	
}
