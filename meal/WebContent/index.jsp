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
	<body>
		<div class="all" id="app">
			<div class="body-box">
				<div class="login-box">
				<form action="login.do" method="post">
					<div class="input-box">
						<label>姓名:</label>
						<br />
						<input type="text" name="name"/>
						
						<br/>
						<label>密码:</label>
						<br />
						<input type="password" name="password" />
					</div>
					<div class="login-button">
						<input type="submit" value="登录"></button>
					</div>
				</div>
				</form>
			</div>
		</div>
	</body>
	  <script src="https://unpkg.com/vue/dist/vue.js"></script>
	  <!-- import JavaScript -->
	  <script src="https://unpkg.com/element-ui/lib/index.js"></script>
	  <script>
	    new Vue({
	      el: '#app',
	      data: function() {
	        return {
	        	visible: false,
	        	name:'',
	        	password:'',
	        }
	      },
	    })
	  </script>
</html>