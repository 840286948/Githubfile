function assginUser(assign,roleid){
	$.ajax({
		type:"post",
		url:"role/assignRole.do",
		data:"roleid="+roleid+"&assign="+assign,
		dataType: "JSON",
		success:function(data){
			var role = "";
			$.each(data,function(index,user){
				role += "<tr><td width='50%'><input type='checkbox' name='assignuserid' value='"+user.id+"'/></td>";
				role += "<td width='50%'>"+user.username+"</td>";
			});
			if(assign == "yes"){
				$("#title").html("取消分配");
				$("#deladd").val("del");
			}else{
				$("#title").html("分配用户");
				$("#deladd").val("add");
			}
			$("#roleid").val(roleid);
			$("#tbodyRole").html(role);
		}
	});
}
function roleTest(){
	if($("#role_name").val() == ""){
		alert("角色不能为空");
		return false;
	}
	if($("#role_describe").val() == ""){
		alert("描述不能为空");
		return false;
	}
	return true;
}
	var setting = {
		/* async: {//异步请求数据
			enable: true,
			url:"permission/permissionAll.do",
			autoParam:["id", "name=n", "level=lv"]，
			otherParam:{"otherParam":"zTreeAsyncTest"},
			dataFilter: filter 
		}, */
		check: {
				enable: true//开启复选框
			},
		data: {
			
			key: {
				url: ""//设置连接为空
			},
			simpleData: {
				enable: true
			}
		}
	};
	
	function permission(roleid){
		$.ajax({
			type:"post",
			url: "permission/permissionAll.do",
			data:"roleid="+roleid,
			success:function(data){
				$.fn.zTree.init($("#regionZTree"), setting,data);//初始化
			}
		});
		$("#roleid2").val(roleid);
	}
	 function doSave() {
       var zTree = $.fn.zTree.getZTreeObj("regionZTree");
       var nodes = zTree.getCheckedNodes();//获取选中的复选框值
        var tmpNode;
        var array = new Array();//获取选中复选框的id
        for(var i=0; i<nodes.length; i++){
            tmpNode = nodes[i];//nodes[i]  是permission对象值
            array.push(tmpNode.id);
        }
        $.ajax({
            type: "POST",
            url: 'permission/insertRolePermission.do',
            data: "roleid="+$("#roleid2").val()+"&permissionId="+array,
            dataType:'json',
            success: function(data){
                window.location.reload();
            }
        });
    }
