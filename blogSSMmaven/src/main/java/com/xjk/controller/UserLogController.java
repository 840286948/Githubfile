package com.xjk.controller;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xjk.entity.User;
import com.xjk.entity.UserLog;
import com.xjk.service.UserLogService;
/**
 * 登录日志
 * @author Administrator
 *
 */
@Controller
@RequestMapping("userlog")
public class UserLogController {
	@Resource
	UserLogService userLogService;
	
	@RequestMapping("list")
	public String list(HttpServletRequest request){//分页查询所有登录日志
		String current = request.getParameter("current");
		String uid = request.getParameter("uid");
		
		if(current == null || "".equals(current)){
			current = "1";
		}
		if(uid == null || "".equals(uid)){
			uid = "0";
		}else{
			request.setAttribute("uid", uid);
		}
		Map<String,Integer> map = new HashMap<>();
		map.put("current", (Integer.parseInt(current)-1)*10);//第几条显示的数据
		map.put("currentPage",Integer.parseInt(current));//当前页
		map.put("length", 10);//每页显示数据
		System.out.println(uid+"--------");
		map.put("uid", Integer.parseInt(uid));//个人记录判断
		map.put("status", 2);
		request.setAttribute("logList", userLogService.sel_limit(map));
		request.setAttribute("count", userLogService.sel_count(map));
		return "houtaiblog/loginlog";
	}
	
	@RequestMapping("deleteLog")
	public String deleteLog(HttpServletRequest request){//删除
		String lid = request.getParameter("lid");
		String uid = request.getParameter("uid");
		String id = request.getParameter("id");
		if(lid == null || "".equals(lid)){
			lid="0";
		}
		if(uid == null || "".equals(uid)){
			uid="0";
		}
		userLogService.delete_UserLog(Integer.parseInt(lid),Integer.parseInt(uid));
		if(id != null){
			System.out.println(uid);
			return "forward:list.do?uid="+id;
		}
		return "redirect:list.do";
	}
	
	@ResponseBody
	@RequestMapping("AjaxlistGR")
	public List<UserLog> list(int uid){//查询该用户登录记录
		return userLogService.sel_queryAll(uid);
	}
	
	@ResponseBody
	@RequestMapping("AjaxupdStatus")
	public String updStatus(int uid){//修改为已读
		userLogService.update_Log(uid);
		return "true";
	}
	

}
