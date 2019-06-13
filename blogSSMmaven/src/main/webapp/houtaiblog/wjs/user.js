	function insertUser(){
		if($("#realnamez").val() == ""){
			alert("姓名不能为空");
			return false;
		}
		if($("#usernamez").val() == ""){
			alert("用户名不能为空");
			return false;
		}
		if($("#namets").html() == "该用户已存在"){
			alert("该用户已存在");
			return false;
		}
		if(!/^1\d{10}$/.test($("#telephonez").val())){
			alert("手机号码格式不正确");
			return false;
		}
		if($("#telephonez").val() == ""){
			alert("电话不能为空");
			return false;
		}
		if($("#passwordz").val() == ""){
			alert("密码不能为空");
			return false;
		}
		if($("#passwordz").val() != $("#new_passwordz").val()){
			alert("两次密码不一致");
			return false;
		}
		return true;
	}
	function nameTest(){
		$.ajax({
			type:"post",
			url: "user/AjaxselNamePwd.do",
			data:"username="+$("#usernamez").val(),
			success:function(data){
				if(data == "false"){
					$("#namets").html("该用户已存在");
				}else{
					$("#namets").html("可以使用");
				}
			}
		});
	}
	function update(id,zhi){
		$.ajax({
			type:"post",
			data:"id="+id,
			url:"user/AjaxselId.do",
			dataType: "JSON",
			success:function(data){
				$("#realname"+zhi).val(data.realname);
				$("#username"+zhi).val(data.username);
				$("#telephone"+zhi).val(data.telephone);
				$("#password"+zhi).val("");
				$("#old_password"+zhi).val("");
				$("#new_password"+zhi).val("");
				$("#userid"+zhi).val(data.id);
				$("#old_pwd"+zhi).html("");
			}
		});
	}
	function updateUsers(zhi){
		if($("#realname"+zhi).val() == ""){
			alert("姓名不能为空");
			return false;
		}
		if($("#telephone"+zhi).val() == ""){
			alert("电话不能为空");
			return false;
		}
		if(!/^1\d{10}$/.test($("#telephone"+zhi).val())){
			alert("手机号码格式不正确");
			return false;
		}
		if($("#password"+zhi).val() == "" && $("#old_password"+zhi).val() != ""){
			alert("密码不能为空");
			return false;
		}
		if($("#password"+zhi).val() != $("#new_password"+zhi).val()){
			alert("两次密码不一致");
			return false;
		}
		if($("#old_pwd"+zhi).html() == "密码错误"){
			alert("密码错误");
			return false;
		}
		if($("#old_pwd"+zhi).html() == "" && $("#password"+zhi).val() != ""){
			alert("旧密码不能为空");
			return false;
		}
		return true;
	}
	function passwordTest(zhi){
		if($("#old_password"+zhi).val() == ""){
			$("#old_pwd"+zhi).html("");
		}else{
			$.ajax({
				type:"post",
				url: "user/AjaxselNamePwd.do",
				data:"username="+$("#username"+zhi).val()+"&password="+$("#old_password"+zhi).val(),
				success:function(data){
					if(data == "false"){
						$("#old_pwd"+zhi).html("密码错误");
						return false;
					}else{
						$("#old_pwd"+zhi).html("密码正确");
						return true;
					}
				}
			});
		}
	}
	
	function quanxian(){
		alert("你没有该权限");
	}