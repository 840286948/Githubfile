package com.xjk.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xjk.entity.Comment;
import com.xjk.service.CommentService;
import com.xjk.util.PageBean;
/**
 * 评论
 * @author Administrator
 *
 */
@Controller
@RequestMapping("comment")
public class CommentController {
	
	@Resource
	CommentService commentService;
	
	@RequestMapping("list")
	public String list(HttpServletRequest request){//查询所有评论
		String current = request.getParameter("current");
		try {
			if(current == null || "".equals(current)){
				current = "1";
			}
			Map<String,Integer> map = new HashMap<>();
			map.put("currentPage", (Integer.parseInt(current)-1)*5);//第几条显示的数据
			map.put("length", 5);//每页显示数据
			map.put("status", 0);//未读消息在前
			int totalPage = (int)commentService.sel_count(-1);
			request.setAttribute("commentList", new PageBean(commentService.sel_All(map), Integer.parseInt(current),totalPage, 5));
			request.setAttribute("count", commentService.sel_count(0));//未读评论
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
		return "houtaiblog/comment";
	}
	
	@RequestMapping("deleteComment")
	public String deleteComment(int[] cid){//查询评论
		try {
			if(cid != null){
				commentService.delete_Comment(cid);
			}
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
		return "redirect:list.do";
	}
	
	@RequestMapping("updateComment")
	public String updateComment(int cid){//修改为已读状态
		try {
			commentService.update_Comment(cid);
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
		return "redirect:list.do";
	}
	
	@ResponseBody
	@RequestMapping("AjaxqueryId")
	public Comment queryId(int cid){
		return commentService.query_id(cid);
	}
	
	@ResponseBody
	@RequestMapping("AjaxStatus")//未读消息
	public String AjaxStatus(){
		long tota = commentService.sel_count(0);
		return tota+"";
	}
}
