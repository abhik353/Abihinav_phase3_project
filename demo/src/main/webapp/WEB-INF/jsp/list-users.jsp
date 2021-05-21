<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
	<div class="container">
		<table class="table table-striped">
			<caption>All users:</caption>
			<thead>
				<tr>
					<th>name</th>
					<th>email</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${users}" var="user">
					<tr>
						<td>${user.userName}</td>
						<td>${user.email}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<div>
		</div>
		<div>
			<a class="button" href="/list-shoes">go back to manage shoe page</a>
		</div>
		<div>
			<form action="search-user" method="post">
    		<input type="text" name="cn">
    		<button type="submit">Search</button>
			</form>
		</div>
	</div>
	
	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>