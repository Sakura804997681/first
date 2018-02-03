<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="common/header.jsp"%>
<div class="clearfix"></div>
 <div class="x_content">
                    <br />
                    <form enctype="multipart/form-data" id="fo" method="post" action="${pageContext.request.contextPath }/dev/app/appinfomodify" data-parsley-validate class="form-horizontal form-label-left">

                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="softwareName">软件名称 <span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                          <input type="text" id="softwareName" name="softwareName" value="${appInfo.softwareName }" placeholder="请输入软件名称" required="required" class="form-control col-md-7 col-xs-12">
                        </div>
                      </div>
                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="APKName">APK名称 <span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                          <input type="text" id="APKName" readonly="readonly" name="APKName" value="${appInfo.APKName }" placeholder="请输入APK名称" required="required" class="form-control col-md-7 col-xs-12">
                          <span></span>
                        </div>
                      </div>
                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="supportROM">支持ROM <span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                          <input type="text" id="supportROM" name="supportROM" value="${appInfo.supportROM }" placeholder="请输入支持的ROM" required="required" class="form-control col-md-7 col-xs-12">
                        </div>
                      </div>
                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="interfaceLanguage">界面语言 <span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                          <input type="text" id="interfaceLanguage" name="interfaceLanguage" value="${appInfo.interfaceLanguage }" placeholder="请输入软件支持的界面语言" required="required" class="form-control col-md-7 col-xs-12">
                        </div>
                      </div>
                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="softwareSize">软件大小 <span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                          <input type="text" id="softwareSize" name="softwareSize" value="${appInfo.softwareSize }" placeholder="单位为MB" required="required" class="form-control col-md-7 col-xs-12">
                        </div>
                      </div>
                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="downloads">下载次数 <span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                          <input type="text" id="downloads" name="downloads" value="${appInfo.downloads }" required="required" class="form-control col-md-7 col-xs-12">
                        </div>
                      </div>
                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" >所属平台 <span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                          <select name="flatformId" class="form-control">
                           <c:if test="${flatFormList != null }">
									   <option value="">--请选择--</option>
									   <c:forEach var="dataDictionary" items="${flatFormList}">
									   		<option <c:if test="${dataDictionary.valueId == appInfo.flatformId }">selected="selected"</c:if>
									   		value="${dataDictionary.valueId}">${dataDictionary.valueName}</option>
									   </c:forEach>
									</c:if>
                          </select>
                        </div>
                      </div>
                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" >一级分类<span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                          <select id="categoryLevel1" name="categoryLevel1" class="form-control">
                           <c:if test="${categoryLevel1List != null }">
									   <option value="">--请选择--</option>
									   <c:forEach var="appCategory" items="${categoryLevel1List}">
									   		<option <c:if test="${appCategory.id == appInfo.categoryLevel1 }">selected="selected"</c:if>
									   		value="${appCategory.id}">${appCategory.categoryName}</option>
									   </c:forEach>
									</c:if>
                          </select>
                        </div>
                      </div>
                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" >二级分类<span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                          <select id="categoryLevel2" name="categoryLevel2" class="form-control">
                           <c:if test="${categoryLevel2List != null }">
									   <option value="">--请选择--</option>
									   <c:forEach var="appCategory" items="${categoryLevel2List}">
									   		<option <c:if test="${appCategory.id == appInfo.categoryLevel2 }">selected="selected"</c:if>
									   		value="${appCategory.id}">${appCategory.categoryName}</option>
									   </c:forEach>
									</c:if>
                          </select>
                        </div>
                      </div>
                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" >三级分类<span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                          <select id="categoryLevel3" name="categoryLevel3" class="form-control">
                           <c:if test="${categoryLevel3List != null }">
									   <option value="">--请选择--</option>
									   <c:forEach var="appCategory" items="${categoryLevel3List}">
									   		<option <c:if test="${appCategory.id == appInfo.categoryLevel3 }">selected="selected"</c:if>
									   		value="${appCategory.id}">${appCategory.categoryName}</option>
									   </c:forEach>
									</c:if>
                          </select>
                        </div>
                      </div>
                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12"  >APP状态 <span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                        <c:if test="${appInfo.status==1 }"><input type="hidden" name="status" value="1"><input type="text" readonly="readonly" class="form-control col-md-7 col-xs-12" value="待审核"></c:if>
                        <c:if test="${appInfo.status==3 }"><input type="hidden" name="status" value="3"><input type="text" readonly="readonly" class="form-control col-md-7 col-xs-12" value="审核未通过"></c:if>
                        </div>
                      </div>
                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12"  >应用简介 <span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                          <textarea required="required" class="form-control" name="appInfo"  data-parsley-trigger="keyup"
                          placeholder="请输入本软件的相关信息"
                            data-parsley-validation-threshold="10">${appInfo.appInfo }</textarea>
                        </div>
                      </div>
                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12"  >LOGO图片 <span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                          <input type="hidden" name="logo" class="form-control col-md-7 col-xs-12">
                          <span style="color:red">${error }</span>
                         <div id="logo"><img src="${appInfo.logoPicPath }"/><a id="dellogo">删除</a></div>
                        </div>
                      </div>
                      <div class="form-group">
                      <input type="hidden" name="id" value="${appInfo.id }"/>
                      <input type="hidden" name="logoLocPath" value="${appInfo.logoLocPath }">
                      <input type="hidden" name="save" value="0">
                        <div class="col-md-6 col-sm-6 col-xs-12 col-md-offset-3">
                        <c:if test="${appInfo.status==3 }">
                        <button id="add2" type="button" class="btn btn-success">保存并再次提交审核</button>
                        </c:if>
                          <button id="add" type="button" class="btn btn-success">保存</button>  
                          <button id="back" type="button" class="btn btn-primary">返回</button>
                        </div>
                      </div>
                      <div class="ln_solid"></div>
                    </form>
                  </div>
<%@include file="common/footer.jsp"%>
<script type="text/javascript" src="${pageContext.request.contextPath }/statics/localjs/appinfomodify.js"></script>