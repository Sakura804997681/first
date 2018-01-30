package com.apps.controller.developer;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang.math.RandomUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.apps.pojo.AppCategory;
import com.apps.pojo.AppInfo;
import com.apps.pojo.DataDictionary;
import com.apps.pojo.DevUser;
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
	public List<AppCategory> appCateJson(Long pid) {
		List<AppCategory> cate=appCateService.getAppCateByCateId(pid);
		return cate;
	}
	/**
	 * 字典查询
	 * @param code
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/datadictionarylist")
	public List<DataDictionary> dic(@RequestParam("tcode")String code){
		return dictionaryService.getDictionaryByType(code);
	}
	/**
	 * 存在验证
	 * @param APKName
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/apkexist")
	public Map<String,String> Apkname(@RequestParam("APKName")String APKName){
		Map<String,String> m=new HashMap<String, String>();
		if(APKName==null||APKName.trim().equals("")){
			m.put("APKName", "empty");
		}else{
			int i=infoService.exist(APKName);
			if(i>0){
				m.put("APKName", "exist");
			}else if(i==0){
				m.put("APKName", "noexist");
			}else{
				m.put("APKName", "error");
			}
		}
		return m;
	}
	/**
	 * app add
	 * @return
	 */
	@RequestMapping(value="/appinfoadd",method=RequestMethod.GET)
	public String add(AppInfo appInfo,Model model){
		List<DataDictionary> flatForm=dictionaryService.getDictionaryByType("APP_FLATFORM");
		List<AppCategory> cate1=appCateService.getAppCateByCateId(0L);
		List<AppCategory> cate2=appCateService.getAppCateByCateId(appInfo.getCategoryLevel1());
		List<AppCategory> cate3=appCateService.getAppCateByCateId(appInfo.getCategoryLevel2());
		model.addAttribute("flatFormList", flatForm);
		model.addAttribute("categoryLevel1List",cate1);
		model.addAttribute("categoryLevel2List", cate2);
		model.addAttribute("categoryLevel3List",cate3);
		//
		model.addAttribute("appInfo",appInfo);
		return "developer/appinfoadd";
	}
	@RequestMapping(value="/appinfoadd",method=RequestMethod.POST)
	public String addp(AppInfo appInfo,@RequestParam("logo")MultipartFile a,HttpSession session,Model m){
		String path=session.getServletContext().getRealPath("statics"+File.separator+"uploadfiles");
		String PicPath=null;
		if(!a.isEmpty()){
			boolean error=false;
			String e="error";
			String oldname=a.getOriginalFilename();
			String suffix=FilenameUtils.getExtension(oldname);
			int filesize=500000;
			if(a.getSize()>filesize){
				m.addAttribute(e, "*上传大小不得超过500KB");
				error=true;
			}else if(suffix.equalsIgnoreCase("jpg")||suffix.equalsIgnoreCase("png")||suffix.equalsIgnoreCase("jpeg")||suffix.equalsIgnoreCase("pneg")){
				String filename=System.currentTimeMillis()+RandomUtils.nextInt(1000000)+"_Personal.jpg";
				File f=new File(path,filename);
				if(!f.exists()){
					f.mkdirs();
				}
				try {
					a.transferTo(f);
					String allpath=session.getServletContext().getContextPath()+File.separator+"statics"+File.separator+"uploadfiles"
							+File.separator+filename;
					PicPath=allpath;
					System.out.println("filepath====>"+allpath);
				} catch (IllegalStateException | IOException e1) {
					error=true;
					m.addAttribute(e, "*上传失败！");
					e1.printStackTrace();
				}
			}else{
				m.addAttribute(e, "*上传图片格式必须是jpg、png、jpeg、pneg");
				error=true;
			}
			if(!error){
				appInfo.setLogoPicPath(PicPath);
				DevUser u=(DevUser)session.getAttribute(MyConstants.DEV_USER_SESSION);
				appInfo.setCreatedBy(u.getId());
				appInfo.setCreationDate(new Date());
				infoService.addappInfo(appInfo);
				return "redirect:/dev/app/appList";
			}
		}
		return "developer/appinfoadd";
	}
	
}
