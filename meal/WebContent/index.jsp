<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
	<head>
		<meta charset="utf-8" />
		<title></title>
		<script src="js/vue.js" type="text/javascript" charset="utf-8"></script>
		<link rel="stylesheet" type="text/css" href="./css/index.css"/>
		<script src="https://unpkg.com/axios/dist/axios.min.js"></script>
	</head>
	<video width="100%" autoplay loop preload muted x-webkit-airplay="true" airplay="allow" webkit-playsinline="true" playsinline="true" src="./video/index-video.mp4" class="video"></video>
	<body>
		<div class="head_con">
			<ul class="menu_list">
				<li class="menu_item">项目成员：</li>
				<li class="menu_item">高琛皓</li>
				<li class="menu_item">时家庆</li>
				<li class="menu_item">王浩杰</li>
				<li class="menu_item">黄翔</li>
			</ul>
		</div>
		<div class="banner_txt">
			<p class="txt">聚会管理系统</p>
		</div>
		<div class="all">
			<div class="body-box">
				<div class="login-box">
				<form action="login.do" method="post">
					<div class="input-box">
						<label>邮箱:</label>
						<br />
						<input type="text" name="account"/>
						
						<br/>
						<label>密码:</label>
						<br />
						<input type="password" name="password" />
					</div>
					<div class="login-button">
						<input type="submit" class="btn" value="登录">
						
						
						<a class="btn" id="reg" href="register.jsp">注册</a>
					</div>
				</div>
				</form>
			</div>
		</div>
		<div class="descript_area">
      		<p class="txt">《数据库系统分析》大作业，<span class="pc"></span>聚会管理系统登录页面   ——— <span class="m"></span>2021-1-15<span class="pc"></span></p>
    	</div>
	</body>
	  <script src="https://unpkg.com/vue/dist/vue.js"></script>
	  <!-- import JavaScript -->
	  <script src="https://unpkg.com/element-ui/lib/index.js"></script>
	  <script>

	  </script>
</html>