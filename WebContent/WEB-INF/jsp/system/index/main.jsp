<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html lang="en">
<head>
<base href="<%=basePath%>">

<!-- jsp文件头和头部 -->
<%@ include file="top.jsp"%>
<style type="text/css">
.commitopacity {
	position: absolute;
	width: 100%;
	height: 100px;
	background: #7f7f7f;
	filter: alpha(opacity = 50);
	-moz-opacity: 0.8;
	-khtml-opacity: 0.5;
	opacity: 0.5;
	top: 0px;
	z-index: 99999;
}

.modal-dialog {
	z-index: 9999;
}

.modal-body {
	padding-top: 0;
}
</style>

<!-- websocket -->
<link rel="stylesheet" href="static/websocket/css/chat.css"
	type="text/css" media="all" />
<!-- websocket -->
	<script type="text/javascript" src="static/websocket/js/sockjs.min.js"></script>


<!-- 即时通讯 -->
<!-- <link rel="stylesheet" type="text/css"
	href="plugins/websocketInstantMsg/ext4/resources/css/ext-all.css">
<link rel="stylesheet" type="text/css"
	href="plugins/websocketInstantMsg/css/websocket.css" />
<script type="text/javascript"
	src="plugins/websocketInstantMsg/ext4/ext-all-debug.js"></script>
<script type="text/javascript"
	src="plugins/websocketInstantMsg/websocket.js"></script> -->
<!-- 即时通讯 -->

</head>
<body class="no-skin">
	<!-- #section:basics/navbar.layout -->

	<!-- 页面顶部¨ -->
	<%@ include file="head.jsp"%>
	<div id="websocket_button"></div>
	<!-- 少了此处，聊天窗口就无法关闭 -->
	<!-- /section:basics/navbar.layout -->
	<div class="main-container" id="main-container">
		<script type="text/javascript">
				try{ace.settings.check('main-container' , 'fixed')}catch(e){}
			</script>

		<!-- #section:basics/sidebar -->
		<!-- 左侧菜单 -->
		<%@ include file="left.jsp"%>

		<!-- /section:basics/sidebar -->
		<div class="main-content">
			<div class="main-content-inner">
				<!-- /section:basics/content.breadcrumbs -->
				<div class="page-content">
					<!-- #section:settings.box -->
					<div class="ace-settings-container" id="ace-settings-container">
						<div class="btn btn-app btn-xs btn-warning ace-settings-btn"
							id="ace-settings-btn">
							<i class="ace-icon fa fa-cog bigger-130"></i>
						</div>

						<div class="ace-settings-box clearfix" id="ace-settings-box">
							<div class="pull-left width-50">
								<!-- #section:settings.skins -->
								<div class="ace-settings-item">
									<div class="pull-left">
										<select id="skin-colorpicker" class="hide">
											<option data-skin="no-skin" value="#438EB9">#438EB9</option>
											<option data-skin="skin-1" value="#222A2D">#222A2D</option>
											<option data-skin="skin-2" value="#C6487E">#C6487E</option>
											<option data-skin="skin-3" value="#D0D0D0">#D0D0D0</option>
										</select>
									</div>
									<span>&nbsp; 选择皮肤</span>
								</div>

								<!-- /section:settings.skins -->

								<!-- #section:settings.navbar -->
								<div class="ace-settings-item">
									<input type="checkbox" class="ace ace-checkbox-2"
										id="ace-settings-navbar" /> <label class="lbl"
										for="ace-settings-navbar">固定导航栏</label>
								</div>

								<!-- /section:settings.navbar -->

								<!-- #section:settings.sidebar -->
								<div class="ace-settings-item">
									<input type="checkbox" class="ace ace-checkbox-2"
										id="ace-settings-sidebar" /> <label class="lbl"
										for="ace-settings-sidebar">固定侧边栏</label>
								</div>

								<!-- /section:settings.sidebar -->

								<!-- #section:settings.breadcrumbs -->
								<div class="ace-settings-item">
									<input type="checkbox" class="ace ace-checkbox-2"
										id="ace-settings-breadcrumbs" /> <label class="lbl"
										for="ace-settings-breadcrumbs">固定面包屑</label>
								</div>

								<!-- /section:settings.breadcrumbs -->

								<!-- #section:settings.rtl -->
								<div class="ace-settings-item">
									<input type="checkbox" class="ace ace-checkbox-2"
										id="ace-settings-rtl" /> <label class="lbl"
										for="ace-settings-rtl">菜单居左</label>
								</div>

								<!-- /section:settings.rtl -->

								<!-- #section:settings.container -->
								<div class="ace-settings-item">
									<input type="checkbox" class="ace ace-checkbox-2"
										id="ace-settings-add-container" /> <label class="lbl"
										for="ace-settings-add-container"> 居中风格 </label>
								</div>

								<!-- /section:settings.container -->
							</div>
							<!-- /.pull-left -->

							<div class="pull-left width-50">
								<!-- #section:basics/sidebar.options -->
								<div class="ace-settings-item">
									<input type="checkbox" class="ace ace-checkbox-2"
										id="ace-settings-hover" /> <label class="lbl"
										for="ace-settings-hover">折叠菜单</label>
								</div>

								<div class="ace-settings-item">
									<input type="checkbox" class="ace ace-checkbox-2"
										id="ace-settings-compact" /> <label class="lbl"
										for="ace-settings-compact">压缩菜单</label>
								</div>

								<div class="ace-settings-item">
									<input type="checkbox" class="ace ace-checkbox-2"
										id="ace-settings-highlight" /> <label class="lbl"
										for="ace-settings-highlight">弹出风格</label>
								</div>

								<!-- /section:basics/sidebar.options -->
							</div>
							<!-- /.pull-left -->
						</div>
						<!-- /.ace-settings-box -->
					</div>
					<!-- /.ace-settings-container -->
					<div class="row">
						<div id="jzts"
							style="display: none; width: 100%; position: fixed; z-index: 99999999;">
							<div class="commitopacity" id="bkbgjz"></div>
							<div style="padding-left: 70%; padding-top: 1px;">
								<div style="float: left; margin-top: 3px;">
									<img src="static/images/loadingi.gif" />
								</div>
								<div style="margin-top: 6px;">
									<h4 class="lighter block red">&nbsp;加载中 ...</h4>
								</div>
							</div>
						</div>
						<div>
							<iframe name="mainFrame" id="mainFrame" frameborder="0"
								src="tab.do" style="margin: 0 auto; width: 100%; height: 100%;"></iframe>
						</div>
					</div>
					<!-- /.row -->
				</div>
				<!-- /.page-content -->

			</div>
		</div>
		<!-- /.main-content -->

	</div>
	<!-- /.main-container -->


	<div class="modal fade bs-example-modal-lg" id="modal" tabindex="-1"
		role="dialog" aria-labelledby="myLargeModalLabel">
		<div class="modal-dialog modal-lg" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="gridSystemModalLabel">即时通讯</h4>
				</div>
				<div class="modal-body">
					<div class="row">
						<!--聊天区域开始-->
						<div class="chatArea" id="chatArea">
							<div class="inChatArea">
								<div id="chatSidebar" class="chatSidebar">
									<h2 id="chatOnline">在线用户(0人)</h2>
									<ul id="chatUserList">
										<!--  <li>bobo老师</li>
				                 -->
									</ul>
								</div>
								<div class="chatCon">
									<div class="up" id="up">
										<ul id="contentUl">
											<!-- <li><b>14:08</b><em>江山如此多娇</em><span>今天天气不大家出来嗨！！！！！</span></li>
				                	-->
										</ul>
									</div>
									<div class="down">
										<textarea class="textInfo" id="msg" title="按ctrl+enter直接发送"></textarea>
										<button class="btn" id="sendBtn"></button>
									</div>
								</div>

							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- basic scripts -->
	<!-- 页面底部js¨ -->
	<%@ include file="foot.jsp"%>

	<!-- page specific plugin scripts -->

	<!-- ace scripts -->
	<script src="static/ace/js/ace/elements.scroller.js"></script>
	<script src="static/ace/js/ace/elements.colorpicker.js"></script>
	<script src="static/ace/js/ace/elements.fileinput.js"></script>
	<script src="static/ace/js/ace/elements.typeahead.js"></script>
	<script src="static/ace/js/ace/elements.wysiwyg.js"></script>
	<script src="static/ace/js/ace/elements.spinner.js"></script>
	<script src="static/ace/js/ace/elements.treeview.js"></script>
	<script src="static/ace/js/ace/elements.wizard.js"></script>
	<script src="static/ace/js/ace/elements.aside.js"></script>
	<script src="static/ace/js/ace/ace.js"></script>
	<script src="static/ace/js/ace/ace.ajax-content.js"></script>
	<script src="static/ace/js/ace/ace.touch-drag.js"></script>
	<script src="static/ace/js/ace/ace.sidebar.js"></script>
	<script src="static/ace/js/ace/ace.sidebar-scroll-1.js"></script>
	<script src="static/ace/js/ace/ace.submenu-hover.js"></script>
	<script src="static/ace/js/ace/ace.widget-box.js"></script>
	<script src="static/ace/js/ace/ace.settings.js"></script>
	<script src="static/ace/js/ace/ace.settings-rtl.js"></script>
	<script src="static/ace/js/ace/ace.settings-skin.js"></script>
	<script src="static/ace/js/ace/ace.widget-on-reload.js"></script>
	<script src="static/ace/js/ace/ace.searchbox-autocomplete.js"></script>
	<!-- inline scripts related to this page -->

	<!-- the following scripts are used in demo only for onpage help and you don't need them -->
	<link rel="stylesheet" href="static/ace/css/ace.onpage-help.css" />

	<script type="text/javascript"> ace.vars['base'] = '..'; </script>
	<script src="static/ace/js/ace/elements.onpage-help.js"></script>
	<script src="static/ace/js/ace/ace.onpage-help.js"></script>

	<!--引入属于此页面的js -->
	<script type="text/javascript" src="static/js/myjs/head.js"></script>
	<!--引入属于此页面的js -->
	<script type="text/javascript" src="static/js/myjs/index.js"></script>
	<!--引入弹窗组件start-->
	<script type="text/javascript" src="plugins/attention/zDialog/zDrag.js"></script>
	<script type="text/javascript"
		src="plugins/attention/zDialog/zDialog.js"></script>
	<!--引入弹窗组件end-->
	<!--提示框-->
	<script type="text/javascript" src="static/js/jquery.tips.js"></script>

	
</body>

<script type="text/javascript">
	function webSocket(){
		$.ajax({
			type: "POST",
			url: '<%=basePath%>webSocket.do',
	    	data: {},
			dataType:'json',
			cache: false,
			success: function(data){
				$("#modal").modal({backdrop: 'static', keyboard: false});
				debugger;
				var oldPath = '<%=basePath%>';
				var num = oldPath.indexOf("//");
				var path = oldPath.substring(num+2);
				var uid = data.id;
				//发送人编号
				var from = data.id;
				var fromName = data.username;
				//接收人编号
				var to="-1";
				// 创建一个Socket实例
				//参数为URL，ws表示WebSocket协议。onopen、onclose和onmessage方法把事件连接到Socket实例上。每个方法都提供了一个事件，以表示Socket的状态。
				var websocket;
				//不同浏览器的WebSocket对象类型不同
				//alert("ws://" + path + "/ws?uid="+uid);
				if ('WebSocket' in window) {
					websocket = new WebSocket("ws://localhost:8080/ssm/ws");
					console.log("=============WebSocket");
					//火狐
				} else if ('MozWebSocket' in window) {
					websocket = new MozWebSocket("ws://" + path + "ws");
					console.log("=============MozWebSocket");
				} else {
					websocket = new SockJS("http://" + path + "ws/sockjs");
					console.log("=============SockJS");
				}
				
				console.log("ws://" + path + "ws");
				
				//打开Socket,
				websocket.onopen = function(event) { 
					console.log("WebSocket:已连接");
				}
				
				// 监听消息
				//onmessage事件提供了一个data属性，它可以包含消息的Body部分。消息的Body部分必须是一个字符串，可以进行序列化/反序列化操作，以便传递更多的数据。
				websocket.onmessage = function(event) { 
					console.log('Client received a message',event);
					//var data=JSON.parse(event.data);
					var data=$.parseJSON(event.data);
					console.log("WebSocket:收到一条消息",data);
					
					//2种推送的消息
					//1.用户聊天信息：发送消息触发
					//2.系统消息：登录和退出触发
					
					//判断是否是欢迎消息（没用户编号的就是欢迎消息）
					if(data.from==undefined||data.from==null||data.from==""){
						//===系统消息
						$("#contentUl").append("<li><b>"+data.date+"</b><em>系统消息：</em><span>"+data.text+"</span></li>");
						//刷新在线用户列表
						$("#chatOnline").html("在线用户("+data.userList.length+")人");
						$("#chatUserList").empty();
						$(data.userList).each(function(){
							$("#chatUserList").append("<li>"+this.nickname+"</li>");
						});
						
					}else{
						//===普通消息
						//处理一下个人信息的显示：
						if(data.fromName==fromName){
							data.fromName="我";
							$("#contentUl").append("<li><span  style='display:block; float:right;'><em>"+data.fromName+"</em><span>"+data.text+"</span><b>"+data.date+"</b></span></li><br/>");
						}else{
							$("#contentUl").append("<li><b>"+data.date+"</b><em>"+data.fromName+"</em><span>"+data.text+"</span></li><br/>");
						}
						
					}
					
					scrollToBottom();
				}; 
				
				// 监听WebSocket的关闭
				websocket.onclose = function(event) { 
					$("#contentUl").append("<li><b>"+new Date().Format("yyyy-MM-dd hh:mm:ss")+"</b><em>系统消息：</em><span>连接已断开！</span></li>");
					scrollToBottom();
					console.log("WebSocket:已关闭：Client notified socket has closed",event); 
				}; 
				
				//监听异常
				websocket.onerror = function(event) {
					$("#contentUl").append("<li><b>"+new Date().Format("yyyy-MM-dd hh:mm:ss")+"</b><em>系统消息：</em><span>连接异常，建议重新登录</span></li>");
					scrollToBottom();
					console.log("WebSocket:发生错误 ",event);
				};
				
				//onload初始化
				$(function(){
					//发送消息
					$("#sendBtn").on("click",function(){
						sendMsg();
					});
					
					//给退出聊天绑定事件
					$("#exitBtn").on("click",function(){
						closeWebsocket();
						location.href="${pageContext.request.contextPath}/index.jsp";
					});
					
					//给输入框绑定事件
					$("#msg").on("keydown",function(event){
						keySend(event);
					});
					
					//初始化时如果有消息，则滚动条到最下面：
					scrollToBottom();
					
				});

				//使用ctrl+回车快捷键发送消息
				function keySend(e) {
					var theEvent = window.event || e; 
					var code = theEvent.keyCode || theEvent.which; 
					if (theEvent.ctrlKey && code == 13) {
						var msg=$("#msg");
						if (msg.innerHTML == "") {
							msg.focus();
							return false;
						}
						sendMsg();
					}
				}
				
				//发送消息
				function sendMsg(){
					//对象为空了
					if(websocket==undefined||websocket==null){
						//alert('WebSocket connection not established, please connect.');
						alert('您的连接已经丢失，请退出聊天重新进入');
						return;
					}
					//获取用户要发送的消息内容
					var msg=$("#msg").val();
					if(msg==""){
						return;
					}else{
						var data={};
						data["from"]=from;
						data["fromName"]=fromName;
						data["to"]=to;
						data["text"]=msg;
						//发送消息
						websocket.send(JSON.stringify(data));
						//发送完消息，清空输入框
						$("#msg").val("");
					}
				}

				//关闭Websocket连接
				function closeWebsocket(){
					if (websocket != null) {
						websocket.close();
						websocket = null;
					}
					
				}
				
				//div滚动条(scrollbar)保持在最底部
				function scrollToBottom(){
					//var div = document.getElementById('chatCon');
					var div = document.getElementById('up');
					//div.scrollTop = div.scrollHeight;
				}	
				//格式化日期
				Date.prototype.Format = function (fmt) { //author: meizz 
				    var o = {
				        "M+": this.getMonth() + 1, //月份 
				        "d+": this.getDate(), //日 
				        "h+": this.getHours(), //小时 
				        "m+": this.getMinutes(), //分 
				        "s+": this.getSeconds(), //秒 
				        "q+": Math.floor((this.getMonth() + 3) / 3), //季度 
				        "S": this.getMilliseconds() //毫秒 
				    };
				    if (/(y+)/.test(fmt)) fmt = fmt.replace(RegExp.$1, (this.getFullYear() + "").substr(4 - RegExp.$1.length));
				    for (var k in o)
				    if (new RegExp("(" + k + ")").test(fmt)) fmt = fmt.replace(RegExp.$1, (RegExp.$1.length == 1) ? (o[k]) : (("00" + o[k]).substr(("" + o[k]).length)));
				    return fmt;
				}
				
			}
		});
		
		
		
	}	
</script>
</html>