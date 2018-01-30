$("#categoryLevel1").change(function(){
	var categoryLevel1 = $("#categoryLevel1").val();
	if(categoryLevel1 != '' && categoryLevel1 != null){
		$.ajax({
			type:"GET",//请求类型
			url:$("#path").val()+"/dev/app/appCate",//请求的url
			data:{pid:categoryLevel1},//请求参数
			dataType:"json",//ajax接口（请求url）返回的数据类型
			success:function(data){//data：返回数据（json对象）
				$("#categoryLevel2").html("");
				var options = "<option value=\"\">--请选择--</option>";
				for(var i = 0; i < data.length; i++){
					options += "<option value=\""+data[i].id+"\">"+data[i].categoryName+"</option>";
				}
				$("#categoryLevel2").html(options);
			},
			error:function(data){//当访问时候，404，500 等非200的错误状态码
				alert($("#path").val()+"dev/app/appCate");
			}
		});
	}else{
		$("#categoryLevel2").html("");
		var options = "<option value=\"\">--请选择--</option>";
		$("#categoryLevel2").html(options);
	}
	$("#categoryLevel3").html("");
	var options = "<option value=\"\">--请选择--</option>";
	$("#categoryLevel3").html(options);
});
//动态加载三级分类列表
$("#categoryLevel2").change(function(){
	var categoryLevel2 = $("#categoryLevel2").val();
	if(categoryLevel2 != '' && categoryLevel2 != null){
		$.ajax({
			type:"GET",//请求类型
			url:$("#path").val()+"/dev/app/appCate",//请求的url
			data:{pid:categoryLevel2},//请求参数
			dataType:"json",//ajax接口（请求url）返回的数据类型
			success:function(data){//data：返回数据（json对象）
				$("#categoryLevel3").html("");
				var options = "<option value=\"\">--请选择--</option>";
				for(var i = 0; i < data.length; i++){
					options += "<option value=\""+data[i].id+"\">"+data[i].categoryName+"</option>";
				}
				$("#categoryLevel3").html(options);
			},
			error:function(data){//当访问时候，404，500 等非200的错误状态码
				alert("加载三级分类失败！");
			}
		});
	}else{
		$("#categoryLevel3").html("");
		var options = "<option value=\"\">--请选择--</option>";
		$("#categoryLevel3").html(options);
	}
});

$("#back").on("click",function(){
	window.location.href = "list";
});
$("#submit").on("click",function(){
	if($("APKName").attr("ok")=="true"){
		$("#fo").submit();
	}
});
$("#APKName").bind("blur",function(){
	//ajax后台验证--APKName是否已存在
	$.ajax({
		type:"GET",//请求类型
		url:$("#path").val()+"/dev/app/apkexist",//请求的url
		data:{APKName:$("#APKName").val()},//请求参数
		dataType:"json",//ajax接口（请求url）返回的数据类型
		success:function(data){//data：返回数据（json对象）
			$("#APKName").next().css("color","red");
			if(data.APKName == "empty"){//参数APKName为空，错误提示
				$("#APKName").next().html("APKName为不能为空！");
				$("#APKName").attr("ok","false");
			}else if(data.APKName == "exist"){//账号不可用，错误提示
				$("#APKName").next().html("该APKName已存在，不能使用！");
				$("#APKName").attr("ok","false");
			}else if(data.APKName == "noexist"){//账号可用，正确提示
				$("#APKName").next().html("该APKName可以使用！");
				$("#APKName").next().css("color","green");
				$("#APKName").attr("ok","true");
			}else{alert(data.APKName);}
		},
		error:function(data){//当访问时候，404，500 等非200的错误状态码
			alert("请求错误！");
		}
	});
});