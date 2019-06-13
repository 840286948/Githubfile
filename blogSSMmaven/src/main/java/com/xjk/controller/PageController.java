package com.xjk.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xjk.entity.Article;
import com.xjk.entity.Column;
import com.xjk.entity.Comment;
import com.xjk.service.AnnouncementService;
import com.xjk.service.ArticleService;
import com.xjk.service.ColumnService;
import com.xjk.service.CommentService;
import com.xjk.service.LinkService;
import com.xjk.util.NetworkIP;
import com.xjk.util.PageBean;

/**
 * 前台控制
 * @author Administrator
 *
 */
@Controller
@RequestMapping("page")
public class PageController {
	
	@Resource
	ArticleService articleService;
	
	@Resource
	AnnouncementService announcementService;
	
	@Resource
	CommentService commentService;
	
	@Resource
	LinkService linkService;
	
	@Resource
	ColumnService columnService;
	
	@RequestMapping("indexListcolumn")
	public String indexList(HttpServletRequest req){//主页查询  和 栏目查询
		String url = "qiantaiblog/index";//返回页面
		try {
			String current = req.getParameter("current");
			String label = req.getParameter("label");
			String keywords = req.getParameter("keywords");
			String columnid = req.getParameter("columnid");
			Map<String,Object> map = new HashMap<>();
			map.put("status", 0);//查询公布的文章或公告
			if(columnid != null && !"".equals(columnid)){//栏目文章查询
				map.put("column_id", columnid);//栏目id
				map.put("zding", "zding");//置顶文章
				req.setAttribute("columnid", columnid);
				url = "qiantaiblog/category";
			}else if(keywords == null || "".equals(keywords)){
				req.setAttribute("ann", announcementService.sel_All(map));//最新公告
				req.setAttribute("list", articleService.sel_Article(map));//查询所有文章
			}
			if(current == null || "".equals(current)){
				current = "1";
			}
			if(label != null && !"".equals(label)){//根据标签查询
				req.setAttribute("labels", label);
				map.put("label", label);//标签
			}
			if(keywords != null && !"".equals(keywords)){//搜索文章查询
				map.put("kw", keywords);//搜索
				req.setAttribute("kw", keywords);
				url = "qiantaiblog/category";
			}
			map.put("current", (Integer.parseInt(current)-1)*5);//第几条显示的数据
			map.put("currentPage",current);//当前页
			map.put("length", 5);//每页显示数据
			req.setAttribute("articleList", articleService.sel_Limit(map));//分页查询文章
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
		return url;
	}
	
	@RequestMapping("articleDetails")
	public String articleDetails(Article a,HttpServletRequest req){//文章详情
		try {
			if(a.getId() != null && a.getId() != 0){
				if (a.getArticle_clicks() != null) {
					a.setArticle_clicks(a.getArticle_clicks()+1);
					articleService.update_Article(a);
				}
				Article ar = articleService.query_Id(a.getId());
				req.setAttribute("articles", ar);
				Map<String,Object> map = new HashMap<>();
				map.put("status", 0);//查询公布的文章
				map.put("current", 0);
				map.put("length", 5);
				map.put("label", ar.getArticle_label());//标签
				req.setAttribute("articleList", articleService.sel_Article(map));
			}
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
		return "qiantaiblog/article";
	}
	
	@RequestMapping("links")
	public String links(HttpServletRequest req){//查询所有友情链接
		try {
			req.setAttribute("Qlinks", linkService.sel_All(null));
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
		return "qiantaiblog/links";
	}
	
	@ResponseBody
	@RequestMapping("insertComment")
	public String insertComment(Comment c,HttpServletRequest req){//添加评论
		try {
			if(c.getIp() != null && !"".equals(c.getIp())){
				System.out.println(NetworkIP.getAddresses("ip="+c.getIp(), "utf-8"));
				String address = NetworkIP.getAddresses("ip="+c.getIp(), "utf-8");
				if(address == null){
					address = "未知";
				}
				c.setIpaddress(address);//获取所在地址
				commentService.insert_Comment(c);
				return "true";
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return "false";
	}
	
	@ResponseBody
	@RequestMapping("AjaxCoulmn")
	public List<Column> ajaxColumn(){//头部栏目
		List<Column> columnList = null;
		try {
			columnList = columnService.query_All();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return columnList;
	}
	
	@ResponseBody
	@RequestMapping("AjaxComment")
	public PageBean ajaxComment(HttpServletRequest req){//评论
		PageBean PageBean = null;
		String current = req.getParameter("current");
		String articleId = req.getParameter("articleId");
		try {
			Map<String,Integer> map = new HashMap<>();
			if(current == null || "".equals(current)){
				current = "1";
			}
			if(articleId != null && !"".equals(articleId)){
				map.put("articleId",Integer.parseInt(articleId));//文章id
				map.put("currentPage", (Integer.parseInt(current)-1)*5);//第几条显示的数据
				map.put("length", 5);//每页显示数据
				int totalPage = (int)commentService.sel_count(Integer.parseInt(articleId));
				PageBean = new PageBean(commentService.sel_All(map), Integer.parseInt(current),totalPage, 5);
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return PageBean;
	}
	
	@ResponseBody
	@RequestMapping("AjaxArticle")
	public List<Article> AjaxArticle(){//热门文章
		List<Article> articleList = null;
		try {
			Map<String,Object> map = new HashMap<>();
			map.put("status", 0);//查询公布的文章
			map.put("current", 0);//第几条显示的数据
			map.put("length", 5);//每页显示数据
			map.put("clicks", "clicks");//查询热门文章
			articleList = articleService.sel_Article(map);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return articleList;
	}
}
