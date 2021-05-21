<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Insert title here</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
	<div class="container">
		<form:form method="post" modelAttribute="user">
			<form:hidden path="id" />
			<fieldset class="form-group">
				<form:label path="userName">User name</form:label>
				<form:input path="userName" type="text" class="form-control" 
					required="required" />
				<form:errors path="userName" cssClass="text-warning" />
			</fieldset>
			<fieldset class="form-group">
				<form:label path="password">password</form:label>
				<form:input path="password" type="password" class="form-control"
					required="required" />
				<form:errors path="password" cssClass="text-warning" />
			</fieldset>
			<fieldset class="form-group">
				<form:label path="email">email</form:label>
				<form:input path="email" type="text" class="form-control"
					required="required" />
				<form:errors path="email" cssClass="text-warning" />
			</fieldset>			

			<button type="submit" class="btn btn-danger">Register</button>
		</form:form>
	</div>

	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
	<script
		src="webjars/bootstrap-datepicker/1.0.1/js/bootstrap-datepicker.js"></script>
	<script>
	</script>
</body>
</html>