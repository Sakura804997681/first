package com.apps.controller.backend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @note 管理员登陆处理
 * @author l
 * */
@Controller
@RequestMapping("/manager")
public class ManageLoginController {

	/**
	 * @note 管理员登陆页面
	 * @author l
	 * */
	@RequestMapping("/loginV")
	public String devLoginView() {
		return "backendlogin";
	}
}
