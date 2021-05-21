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
			<caption>All reports:</caption>
			<thead>
				<tr>
					<th>name</th>
					<th>product</th>
					<th>category</th>
					<th>date</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${reports}" var="report">
					<tr>
						<td>${report.name}</td>
						<td>${report.product}</td>
						<td>${report.category}</td>
						<td>${report.date}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<div>
			<a class="button" href="/list-shoes">Go back to manage product page</a>
		</div>
		<div>
			<form action="search-report-category" method="post">
    		<input type="text" name="rc" placeholder="search report by category">
    		<button type="submit">Search</button>
			</form>
		</div>
		<br>
		<div>
			<form action="search-report-date" method="post">
    		<input type="text" name="rd" placeholder="search report by date">
    		<button type="submit">Search</button>
			</form>
		</div>
	</div>
	
	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>