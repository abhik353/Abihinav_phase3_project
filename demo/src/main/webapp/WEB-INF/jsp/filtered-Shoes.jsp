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
			<caption>All shoes:</caption>
			<thead>
				<tr>
					<th>name</th>
					<th>description</th>
					<th>category</th>
					<th>size</th>
					<th>price</th>
					<th></th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${sc}" var="shoe">
					<tr>
						<td>${shoe.name}</td>
						<td>${shoe.desc}</td>
						<td>${shoe.category}</td>
						<td>${shoe.size}</td>
						<td>${shoe.price}</td>
						<td><a type="button" class="btn btn-success"
							href="/update-shoe?id=${shoe.id}">Update</a></td>
						<td><a type="button" class="btn btn-warning"
							href="/delete-shoe?id=${shoe.id}">Delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<div>
			<a class="button" href="/list-shoes">Back to manage shoes page</a>
		</div>
	</div>
	
	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>