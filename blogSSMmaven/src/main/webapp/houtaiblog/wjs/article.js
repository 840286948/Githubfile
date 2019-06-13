function atest(){
	if($("#article_title").val() == ""){
		alert("标题不能为空");
		return false;
	}
	if($("textarea[name='article_content']").val() == ""){
		alert("内容不能为空");
		return false;
	}
	if($("#article_keywords").val() == ""){
		alert("关键字不能为空");
		return false;
	}
	if($("#article_describe").val() == ""){
		alert("描述不能为空");
		return false;
	}
	if($("#article_label").val() == ""){
		alert("标签不能为空");
		return false;
	}
	return true;
}
function quan(){
	var aid = document.getElementsByName("aid");
	for(var a = 0;a < aid.length;a++){
		aid[a].checked=true;
	}
}
function bu(){
	var aid = document.getElementsByName("aid");
	for(var a = 0;a < aid.length;a++){
		aid[a].checked=false;
	}
}