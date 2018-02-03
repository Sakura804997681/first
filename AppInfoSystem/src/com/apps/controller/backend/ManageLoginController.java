package com.apps.controller.backend;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.apps.pojo.BackendUser;
import com.apps.service.ManagerService;
import com.apps.tools.MyConstants;

/**
 * @note 管理员登陆处理
 * @author l
 * */
@Controller
@RequestMapping("/manager")
public class ManageLoginController {

	@Resource
	private ManagerService man;
	/**
	 * @note 管理员登陆页面
	 * @author l
	 * */
	@RequestMapping("/loginV")
	public String devLoginView() {
		return "backendlogin";
	}
	@RequestMapping("/dologin")
	public String login(@RequestParam("userCode")String code,@RequestParam("userPassword")String pass,HttpSession session,Model m){
		BackendUser u=man.login(code, pass);
		if(u!=null){
			session.setAttribute(MyConstants.USER_SESSION, u);
			return "redirect:/manager/main";
		}
		m.addAttribute("error","用户名或密码错误");
		return "backendlogin";
	}
	@RequestMapping("/logout")
	public String logout(HttpSession session){
		session.removeAttribute(MyConstants.USER_SESSION);
		return "backendlogin";
	}
	@RequestMapping("/main")
	public String main(HttpSession session){
		if(session.getAttribute(MyConstants.USER_SESSION)!=null){
		return "backend/main";
		}
		return "redirect:/manager/loginV";
	}
}
