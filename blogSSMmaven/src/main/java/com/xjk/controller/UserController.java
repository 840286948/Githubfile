package com.xjk.controller;

import java.net.SocketException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.xjk.entity.User;
import com.xjk.entity.UserLog;
import com.xjk.service.PermissionService;
import com.xjk.service.UserLogService;
import com.xjk.service.UserService;
import com.xjk.util.Encryption;
import com.xjk.util.UserIp;
/**
 * 用户
 * @author Administrator
 *
 */
@Controller
@SessionAttributes("currentUser")
@RequestMapping("user")
public class UserController {
	@Resource
	UserService userService;
	@Resource
	PermissionService permissioinService;
	@Resource
	UserLogService userLogService;
	
	@RequestMapping("login")
	public String login(User u,Model model,HttpServletRequest request){//登录
		model.addAttribute("user", u);
		
		String password = Encryption.MD5Encode(u.getPassword());
		u.setPassword(password);
		
		User user = userService.sel_login(u);
		if(user != null && user.getStatus() == 0){
			//每次登录添加记录
			UserLog ul = new UserLog();
			ul.setIp(UserIp.addIp(request));//获取ip
			ul.setUser_id(user.getId());
			userLogService.insert_log(ul);
			//用户application计算登录次数     不想用
			/*Map<String,Integer> map = null;
			if(request.getSession().getServletContext().getAttribute("number") == null){
				map =new HashMap<>();
				map.put(user.getUsername(), 1);
			}else{
				map = (Map<String, Integer>) request.getSession().getServletContext().getAttribute("number");
				if(map.get(user.getUsername()) == null){
					map.put(user.getUsername(), 1);
				}else{
					map.put(user.getUsername(), map.get(user.getUsername())+1);
				}
			}*/
			//登录次数
			//request.getSession().getServletContext().setAttribute("number", map);
			//该用户据有的权限
			request.getSession().setAttribute("permission", permissioinService.sel_Permission(user.getId()));
			model.addAttribute("currentUser",user);
			return "redirect:/report/indexList.do";
		}
		if(user != null && user.getStatus() == 1){
			model.addAttribute("alt", "该用户已被禁用");
		}
		return "houtaiblog/login";
	}
	@RequestMapping("addupdatedel")
	public String addUser(User u,HttpServletRequest request) {//增加修改删除用户
		if(u.getId() != null && u.getId() != 0){
			String jin = request.getParameter("jin");
			if(u.getPassword() != null && !"".equals(u.getPassword())){
				u.setPassword(Encryption.MD5Encode(u.getPassword()));//加密
			}
			userService.update_User(u);
			User user = (User) request.getSession().getAttribute("currentUser");
			System.out.println(user.getId()+"------------");
			//修改密码后查询登录
			if(user.getId() == u.getId() && u.getPassword() != null && !"".equals(u.getPassword())){
				request.getSession().removeAttribute("currentUser");
				request.getSession().removeAttribute("permission");
				return "redirect:/houtaiblog/login.jsp";
			}
			if(jin != null && jin.equals("index")){
				return "redirect:/report/indexList.do";
			}
		}else{
			String password = Encryption.MD5Encode(u.getPassword());//加密
			u.setStatus(0);
			u.setPassword(password);
			userService.insert_User(u);
		}
		return "redirect:list.do";
	}
	@RequestMapping("list.do")
	public String list(HttpServletRequest request){//查询所有用户
		try {
			request.setAttribute("list", userService.sel_User());
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
		return "houtaiblog/manage-user";
	}
	@ResponseBody
	@RequestMapping("AjaxselId")
	public User selId(int id){//修改时查询个人信息
		return userService.queryById(id);
	}
	@ResponseBody
	@RequestMapping("AjaxselNamePwd")
	public String selUsername(String username,HttpServletRequest req){//根据名字查询判断用户名是否存在
		String password = req.getParameter("password");
		User u = userService.sel_Name(username);//根据用户名查询
		if(password != null && !"".equals(password)){
			if(u.getPassword().equals(Encryption.MD5Encode(password))){//修改密码时判断密码是否正确
				return "pwdtrue";
			}
		}
		if(u == null){
			return "nametrue";
		}
		return "false";
	}
	
	@RequestMapping("tuilogin")
	public String tuilogin(HttpServletRequest request){
		request.getSession().removeAttribute("currentUser");
		request.getSession().removeAttribute("permission");
		return "redirect:/houtaiblog/login.jsp";
	}
	
}
