package com.xjk.controller;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.xjk.entity.Article;
import com.xjk.entity.Column;
import com.xjk.service.ArticleService;
import com.xjk.service.ColumnService;
/**
 * 文章
 * @author Administrator
 *
 */
@Controller
@RequestMapping("article")
public class ArticleController {
	@Resource
	ArticleService articleService;
	
	@Resource
	ColumnService columnService;
	
	@RequestMapping("list")
	public String list(HttpServletRequest request){//分页查询所有文章
		try {
			String current = request.getParameter("current");
			String keywords = request.getParameter("keywords");
			if(current == null || "".equals(current)){
				current = "1";
			}
			if(keywords == null || "".equals(keywords)){//搜索文章查询
				keywords = "";
			}else{
				request.setAttribute("kw", keywords);
			}
			Map<String,Object> map = new HashMap<>();
			map.put("current", (Integer.parseInt(current)-1)*5);//第几条显示的数据
			map.put("currentPage",current);//当前页
			map.put("length", 5);//每页显示数据
			map.put("kw", keywords);//搜索关键字
			request.setAttribute("articleList", articleService.sel_Limit(map));
			request.setAttribute("count", articleService.sel_count(map));
		} catch (Exception e) {
			System.out.println("查询失败");
			e.printStackTrace();
			return "error";
		}
		return "houtaiblog/article";
	}
	//添加修改文章
	@RequestMapping("insertUpd")
	public String insertUpd(Article a,@RequestParam(value="file",required=false)MultipartFile file,HttpServletRequest request) throws IllegalStateException, IOException{
		//获取项目物理路径
		String pathRoot = request.getServletContext().getRealPath("")+"/";
		System.out.println("pathRoot="+pathRoot);
		if(!file.isEmpty()){
			String uuid=UUID.randomUUID().toString();//随机生成UUID，用作文件名
			System.out.println("UUID="+uuid);
			String contentType=file.getContentType();//获取上传文件类型（可以判断如果不是图片，禁止上传）
			System.out.println("文件类型"+contentType);
			//file.getOriginalFilename()；//获取文件名
			String imageName=contentType.substring(contentType.indexOf("/")+1);
			System.out.println("文件后缀"+imageName);
			String path="upload/image/"+uuid+"."+imageName;
			file.transferTo(new File(pathRoot+path));
			System.out.println(path);
			a.setTitle_image(path);
		}
		if(a.getId() != null && a.getId() != 0){
			articleService.update_Article(a);
		}else{
			articleService.insert_Article(a);
		}
		return "redirect:list.do";
	}
	
	@RequestMapping("updZhiding")
	public String updZhiding(Article a){//栏目置顶
		try {
			articleService.update_Article(a);
		} catch (Exception e) {
			System.out.println("删除失败");
			e.printStackTrace();
			return "error";
		}
		return "redirect:list.do";
	}
	
	@RequestMapping("deleteArticle")
	public String deleteArticle(int[] aid){//删除文章
		if(aid != null){
			articleService.delete_Article(aid);
			System.out.println("删除成功");
		}
		return "redirect:list.do";
	}
	
	@RequestMapping("idArticle")
	public String idArticle(HttpServletRequest req){
		try {
			String id = req.getParameter("id");
			if(id != null && !"".equals(id)){
				req.setAttribute("article", articleService.query_Id(Integer.parseInt(id)));
			}
			req.setAttribute("column", columnService.query_All());
		} catch (Exception e) {
			System.out.println("查询失败");
			e.printStackTrace();
			return "error";
		}
		return "houtaiblog/addupd-article";
	}
}
