package com.xjk.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xjk.entity.Role;
import com.xjk.entity.User;
import com.xjk.service.RoleService;
import com.xjk.service.UserService;
/**
 * 角色
 * @author Administrator
 *
 */
@Controller
@RequestMapping("role")
public class RoleController {
	@Resource
	RoleService roleService;
	@Resource
	UserService userService;
	
	@ResponseBody
	@RequestMapping("assignRole")
	public List<User> Rolefenpei(int roleid,String assign){//查询未分配用户和以分配用户
		List<User> list = new ArrayList<>();
		List<Integer> listRole = roleService.sel_UserRole(roleid);//查询角色拥有用户
		for (User u : userService.sel_All()) {
			if(!listRole.contains(u.getId()) && assign.equals("no")){//查询未分配用户
				list.add(u);
			}
			if(listRole.contains(u.getId()) && assign.equals("yes")){//查询已分配用户
				list.add(u);
			}
		}
		return list;
	}
	
	@RequestMapping("list")
	public String list(HttpServletRequest request){//查询所有角色
		try {
			request.setAttribute("roleList", roleService.sel_All());
		} catch (Exception e) {
			System.out.println("查询失败");
			e.printStackTrace();
			return "error";
		}
		return "houtaiblog/manage-role";
	}
	
	@RequestMapping("deladdUserRole")
	public String addUserRole(int roleid,int[] assignuserid,HttpServletRequest req){//添加用户角色关系
		String deladd = req.getParameter("deladd");
		System.out.println(deladd+"**********************");
		try {
			if(assignuserid != null){
				Map<String,Object> map = new HashMap<>();
				map.put("roleid", roleid);
				map.put("userids", assignuserid);
				if(deladd.equals("del")){
					System.out.println("---------------------");
					roleService.delete_UserRole(map);
				}else{
					roleService.insert_UserRole(map);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
		return "redirect:list.do";
	}
	@RequestMapping("insertRole")
	public String addRole(Role r){//添加角色
		try {
			roleService.insert_Role(r);
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
		return "redirect:list.do";
	}

}
