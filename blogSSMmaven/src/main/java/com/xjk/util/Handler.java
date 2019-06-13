package com.xjk.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class Handler  implements HandlerInterceptor{

	@Override
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("最后一步操作");
		
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("执行方法后");
	}

	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse resp,
			Object met) throws Exception {
		String uri=req.getRequestURI();
		String path=req.getSession().getServletContext().getContextPath();
		System.out.println(uri+"---"+path);
		if(req.getSession().getAttribute("currentUser")==null){
			resp.sendRedirect(path+"/houtaiblog/login.jsp");
			return false;
		}
		return true;
	}

}
