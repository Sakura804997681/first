package com.apps.controller.backend;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.apps.pojo.AppCategory;
import com.apps.pojo.AppInfo;
import com.apps.pojo.AppVersion;
import com.apps.pojo.DataDictionary;
import com.apps.service.AppCateService;
import com.apps.service.AppInfoService;
import com.apps.service.DataDictionaryService;
import com.apps.tools.MyConstants;
import com.apps.tools.PageSupport;

@Controller
@RequestMapping("/backend/app")
public class BackendController {

	@Resource
	AppInfoService infoService;
	
	@Resource
	DataDictionaryService dictionaryService;
	
	@Resource
	AppCateService appCateService;
	
	@RequestMapping("/list")
	public String list(AppInfo a,Model m,@RequestParam(value="pageIndex",required=false)Integer currentPageNo){
		currentPageNo=currentPageNo==null?1:currentPageNo;
		a.setStatus(1L);
		System.out.println(a.getFlatformName()+a.getFlatformId());
		PageSupport page=infoService.getAppInfos(a,currentPageNo,MyConstants.pageSize);
		m.addAttribute("appInfoList",page.getData());
		m.addAttribute("pages",page);
		load(a, m);
		m.addAttribute("app",a);
		return "backend/applist";
	}
	@RequestMapping("/check")
	public String check(@RequestParam("aid")Integer aid,@RequestParam("vid")Integer vid,Model m){
		AppInfo a=new AppInfo();
		a.setId(Long.parseLong(aid.toString()));
		AppInfo appInfo=infoService.getAppInfo(a, 0, 1).get(0);
		AppVersion appVersion=infoService.getversion(Long.parseLong(vid.toString()));
		m.addAttribute(appInfo);
		m.addAttribute(appVersion);
		return "backend/appcheck";
	}
	@RequestMapping("/checksave")
	public String save(AppInfo appInfo){
		infoService.update(appInfo);
		return "redirect:/backend/app/list";
	}
	public void load(AppInfo a,Model m){
		List<DataDictionary> flatForm=dictionaryService.getDictionaryByType("APP_FLATFORM");
		List<AppCategory> cate1=appCateService.getAppCateByCateId(0L);
		List<AppCategory> cate2=appCateService.getAppCateByCateId(a.getCategoryLevel1());
		List<AppCategory> cate3=appCateService.getAppCateByCateId(a.getCategoryLevel2());
		m.addAttribute("flatFormList", flatForm);
		m.addAttribute("categoryLevel1List",cate1);
		m.addAttribute("categoryLevel2List", cate2);
		m.addAttribute("categoryLevel3List",cate3);
	}
}
