function comments(current,articleId){
	$.ajax({
		type:"post",
		url: "page/AjaxComment.do",
		data:"current="+current+"&articleId="+articleId,
		success:function(data){
			var comments = "";
			$.each(data.records,function(index,comment){
				comments += "<li class='comment-content'><span class='comment-f'></span>";
				comments += "<div class='comment-avatar'><img class='avatar' src='qiantaiblog/images/icon/icon.png' alt='' /></div>";
				comments += "<div class='comment-main'><p>来自<span class='address'>"+comment.ipaddress+"</span>的用户";
				var date=new Date(comment.createTime);
				var month=date.getMonth()+1;
            	var day=date.getDay()+23;
				comments += "<span class='time'>("+date.getFullYear()+"-"+month+"-"+day+")</span><br />"+comment.comment_content+"</p></div></li>";
			});
			var z = data.totalPage+"条评论";
			$("#tota").html(z);
			$("#commentlist").html(comments);
			if(data.records.length > 0){
				var page = "";
				page += "<span><a onclick='comments(1,"+articleId+")'>首页</a>";
				page += "</span><span><a onclick='comments("+data.pre+","+articleId+")'>上一页</a></span>";
				for(var begin = data.beginPage;begin <= data.endPage;begin++){
					page += "<a  onclick='comments("+begin+","+articleId+")'>"+begin+"</a>";
				}
				page += "<span><a  onclick='comments("+data.next+","+articleId+")'>下一页</a></span>";
				page += "<span><a onclick='comments("+data.lastPage+","+articleId+")'>尾页</a></span>";
				$("#quotes").html(page);
			}
		}
	});
}
function insertComment(articleId,commentStatus){
	if(commentStatus == 1){
		alert("该文章禁止评论");
	}else{
		var ip = "";
		try {
			ip = returnCitySN["cip"];
		} catch(err) {
			alert("请您连接网络");
		}
		$("#ip").val(ip);
		if($("#ip").val() != ""){
			$.ajax({
				type:"post",
				url: "page/insertComment.do",
				data:"article.id="+articleId+"&comment_content="+$("#comment-textarea").val()+"&ip="+$("#ip").val(),
				success:function(data){
					if(data == "true"){
						$("#comment-textarea").val("");
						comments(1,articleId);
					}else{
						alert("请您连接网络");
					}
				}
			});
		}
	}
}
