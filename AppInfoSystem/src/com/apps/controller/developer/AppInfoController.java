package com.apps.controller.developer;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.apps.pojo.AppCategory;
import com.apps.pojo.AppInfo;
import com.apps.pojo.DataDictionary;
import com.apps.service.AppCateService;
import com.apps.service.AppInfoService;
import com.apps.service.DataDictionaryService;
import com.apps.tools.MyConstants;
import com.apps.tools.PageSupport;

/**
 * @note appsinfo
 * @author l
 * */
@Controller
@RequestMapping("/dev/app")
public class AppInfoController {

	@Resource
	AppInfoService infoService;
	
	@Resource
	DataDictionaryService dictionaryService;
	
	@Resource
	AppCateService appCateService;
	
	/**
	 * @note appInfo list
	 * @author  
	 * */
	@RequestMapping("/appList")
	public String appInfo(AppInfo appInfo,@RequestParam(value="pageIndex",required=false)Integer currentPageNo,Model model) {
		currentPageNo=currentPageNo==null?1:currentPageNo;
		PageSupport page=infoService.getAppInfos(appInfo,currentPageNo,MyConstants.pageSize);
		List<DataDictionary> status=dictionaryService.getDictionaryByType("APP_STATUS");
		List<DataDictionary> flatForm=dictionaryService.getDictionaryByType("APP_FLATFORM");
		List<AppCategory> cate1=appCateService.getAppCateByCateId(0L);
		List<AppCategory> cate2=appCateService.getAppCateByCateId(appInfo.getCategoryLevel1());
		List<AppCategory> cate3=appCateService.getAppCateByCateId(appInfo.getCategoryLevel2());
		//
		model.addAttribute("appInfoList",page.getData());
		model.addAttribute("pages",page);
		model.addAttribute("statusList",status);
		model.addAttribute("flatFormList", flatForm);
		model.addAttribute("categoryLevel1List",cate1);
		model.addAttribute("categoryLevel2List", cate2);
		model.addAttribute("categoryLevel3List",cate3);
		//
		model.addAttribute("appInfo",appInfo);
		return "/developer/appinfolist";
	}
	
	/**
	 * @note app 分类 json
	 * @author  
	 * */
	@ResponseBody
	@RequestMapping("/appCate")
	public List<AppCategory> appCateJson(long pid) {
		List<AppCategory> cate=appCateService.getAppCateByCateId(pid);
		return cate;
	}
	
}
