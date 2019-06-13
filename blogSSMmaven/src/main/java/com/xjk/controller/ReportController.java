package com.xjk.controller;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xjk.entity.User;
import com.xjk.entity.UserLog;
import com.xjk.service.ArticleService;
import com.xjk.service.CommentService;
import com.xjk.service.LinkService;
import com.xjk.service.RoleService;
import com.xjk.service.UserLogService;

/**
 * 报告controller
 * @author Administrator
 *
 */
@Controller
@RequestMapping("report")
public class ReportController {
	@Resource
	ArticleService articleService;
	
	@Resource
	LinkService linkService;
	
	@Resource
	CommentService commentService;
	
	@Resource
	UserLogService userLogService;
	
	@Resource
	RoleService roleService;
	
	@RequestMapping("indexList")
	public String index(HttpServletRequest request){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		User user = (User) request.getSession().getAttribute("currentUser");
		UserLog ul = userLogService.sel_lastLog(user.getId(), "");//查询该用户的最新登录时间
		request.setAttribute("currentIp", ul.getIp());//当前登录者ip
		if(ul != null){//该账户是否有登录过
			ul = userLogService.sel_lastLog(user.getId(), sdf.format(ul.getCreateTime()));
			if(ul != null){//上一次登录时间
				request.setAttribute("lastLog", ul);
			}
		}
		request.setAttribute("articleTote", articleService.sel_count(null));//文章总条数
		request.setAttribute("linkTote", linkService.sel_count());//友情链接总体数
		request.setAttribute("commentTote", commentService.sel_count(-1));//评论总条数
		request.setAttribute("roleTote", roleService.sel_userRoleCount());//管理员总数
		request.setAttribute("userlog", userLogService.sel_count(null));//登录记录总数
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("uid", user.getId());
		request.setAttribute("longNumber", userLogService.sel_count(map));//登录次数
		return "forward:/houtaiblog/index.jsp";
	}
}
