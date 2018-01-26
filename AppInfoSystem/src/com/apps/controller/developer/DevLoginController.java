package com.apps.controller.developer;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.apps.pojo.DevUser;
import com.apps.service.DevUserService;
import com.apps.tools.MyConstants;

/**
 * @note 开发者登陆处理
 * @author  long
 * */
@Controller
@RequestMapping("/dev")
public class DevLoginController {

	@Autowired
	DevUserService devService;
	/**
	 * @note 开发者登陆页面
	 * @author  
	 * */
	@RequestMapping("/loginV")
	public String devLoginView() {
		return "devlogin";
	}
	
	/**
	 * @note 登陆处理
	 * @author
	 * */
	@RequestMapping("/doLogin")
	public String doLogin(DevUser dev,HttpSession session,Model model) {
		DevUser devU= devService.loginValidate(dev.getDevCode(), dev.getDevPassword());
		if(null==devU) {
			//登陆失败
			model.addAttribute("error", "登陆失败!");
		}else {
			//登陆成功
			session.setAttribute(MyConstants.DEV_USER_SESSION, devU);
			return "redirect:/dev/main";

		}
		return "devlogin";
	}
	
	/**
	 * @note 开发者主页
	 * @author  
	 * */
	@RequestMapping("main")
	public String main(HttpSession session) {
		if(session.getAttribute(MyConstants.DEV_USER_SESSION) == null){
			return "redirect:/dev/login";
		}
		return "developer/main";
	}
	
	/**
	 * @note 退出登陆
	 * @author  
	 * */
	@RequestMapping("logout")
	public String logout(HttpSession session) {
		session.removeAttribute(MyConstants.DEV_USER_SESSION);
		return "devlogin";
	}
}
