package com.xjk.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.xjk.entity.Permission;
import com.xjk.entity.User;
import com.xjk.service.PermissionService;
import com.xjk.service.RoleService;
/**
 * 权限
 * @author Administrator
 *
 */
@Controller
@RequestMapping("permission")
public class PermissionController {
	@Resource
	PermissionService permissioinService;
	@Resource
	RoleService roleService;
	
	@ResponseBody
	@RequestMapping("permissionAll")
	public List<Permission> permissionAll(int roleid){
		List<Permission> permissions = new ArrayList<>();//存放树形的权限数据
		
		List<Permission> list = permissioinService.queryAll();//查询所有权限
		
		List<Integer> userPermission = permissioinService.sel_RolePermission(roleid);//查询该角色据有的权限
		
		Map<Integer,Permission> parentMap = new HashMap<>();//存放所有权限
		for(Permission p:list){//存放所有权限
			if(userPermission.contains(p.getId())){//该权限存在，复选框勾选
				p.setChecked(true);
			}
			parentMap.put(p.getId(), p);
		}
		for (Permission p : list) {
			if(p.getParent_id()==null){
				permissions.add(p);//添加父节点
			}else{
				Permission per = parentMap.get(p.getParent_id());//查询子节点的父节点
				per.getChildren().add(p);//添加子节点
			}
		}
		return permissions;		
	}
	
	@ResponseBody
	@RequestMapping("insertRolePermission")
	public String insertRolePermission(int roleid,int[] permissionId,HttpServletRequest request){
		System.out.println(permissionId.length+"----------"+roleid);
		List<Integer> addPermission = new ArrayList<Integer>();//需要添加的权限
		List<Integer> Permission = new ArrayList<Integer>();
		List<Integer> delPermission = new ArrayList<Integer>();//需要删除的权限
		
		List<Integer> userPermission = permissioinService.sel_RolePermission(roleid);//查询该角色据有的权限
		
		for (int i = 0; i < permissionId.length; i++) {
			if(!userPermission.contains(permissionId[i])){//判断没有的权限
				addPermission.add(permissionId[i]);//添加
			}else{
				Permission.add(permissionId[i]);
			}
		}
		for(int i = 0; i < userPermission.size(); i++){
			if(!Permission.contains(userPermission.get(i))){
				delPermission.add(userPermission.get(i));//获取到需要删除的数据
			}
		}
		Map<String,Object> map = new HashMap<>();
		map.put("roleid", roleid);
		if(addPermission.size() > 0){//添加
			map.put("permissionId", addPermission);
			permissioinService.insert_RolePermission(map);
		}
		if(delPermission.size() > 0){//删除
			map.put("permissionId", delPermission);
			permissioinService.delete_RolePermission(map);
		}
		//更新权限
		User u = (User) request.getSession().getAttribute("currentUser");
		List<Integer> listUser = roleService.sel_UserRole(roleid);
		if(listUser.contains(u.getId())){//判断如果修改的是登录用户具有的角色  则刷新权限
			request.getSession().setAttribute("permission", permissioinService.sel_Permission(u.getId()));
		}
		return "true";
	}
}
