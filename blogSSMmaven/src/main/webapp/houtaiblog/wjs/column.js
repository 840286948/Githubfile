function columnTest(){
	if($("#category-name").val() == ""){
		alert("名称不能为空");
		return false;
	}
	if($("#category-alias").val() == ""){
		alert("别名不能为空");
		return false;
	}
	if($("#category-keywords").val() == ""){
		alert("关键字不能为空");
		return false;
	}
	if($("#category-describe").val() == ""){
		alert("描述不能为空");
		return false;
	}
	if($("#c_name").html() != ""){
		alert("该栏目已存在");
		return false;
	}
	return true;
}

function columnName(id){
	var can = "column_name="+$("#category-name").val();
	if(id != "0"){
		can += "&id="+id;
	}
	$.ajax({
		type:"post",
		url: "column/AjaxName.do",
		data:can,
		success:function(data){
			if(data == "false"){
				$("#c_name").html("该栏目已存在");
				return false;
			}else{
				$("#c_name").html("");
				return true;
			}
		}
	});
} 