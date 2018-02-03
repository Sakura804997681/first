package com.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.apps.tools.MyConstants;

public class Login implements HandlerInterceptor{

	@Override
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean preHandle(HttpServletRequest r, HttpServletResponse p,
			Object arg2) throws Exception {
		// TODO Auto-generated method stub
		if(r.getSession().getAttribute(MyConstants.DEV_USER_SESSION)!=null
				||r.getSession().getAttribute(MyConstants.USER_SESSION)!=null){
			return true;
		}
		p.sendRedirect(r.getContextPath());
		return false;
	}

}
