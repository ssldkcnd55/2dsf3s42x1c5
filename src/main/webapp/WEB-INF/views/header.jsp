<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>header</title>
<style type="text/css">
nav {
	float: left;
}

nav ul li {
	float: left;
	display: block;
	width: 120px;
	height: 35px;
	backgroubd: orange;
	color: navy;
}

a{
text-decoration: none;
}
</style>
</head>
<body>
	<header>
		<nav>
			<ul>
				<li><a>home</a></li>
				<li><a>공지사항</a></li>
				<li><a>게시글</a></li>
				<li><a>QnA</a></li>
				<li><a>자료실</a></li>
			</ul>
		</nav>
		<table id="loginFrm">
			<form action="test.do" method="post">
			<tr>
				<th><input type="text" name="userid"></th>
				<th rowspan="2"><input type="submit" value="로그인">
			</tr>
			<tr>
				<th><input type="password" name="userpwd"></th>
				<th colspan="2"><a>아이디/암호분실시</a>&nbsp; <a>회원가입</a></th>
			</tr>
			<tr>
				<th></th>
				<th></th>
			</tr>
			<tr>
				<th></th>
				<th></th>
			</tr>
			</form>
		</table>
	</header>

</body>
</html>