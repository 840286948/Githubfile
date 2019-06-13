function annTest(){
	if($("#ann_title").val() == ""){
		alert("标题不能为空");
		return false;
	}
	if($("textarea[name='announcement_content']").val() == ""){
		alert("内容不能为空");
		return false;
	}
	if($("#ann_keywords").val() == ""){
		alert("关键字不能为空");
		return false;
	}
	if($("#ann_describe").val() == ""){
		alert("描述不能为空");
		return false;
	}
	return true;
}