<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Insert title here</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
	<div class="container">
		<form:form method="post" modelAttribute="shoe">
			<form:hidden path="id" />
			<fieldset class="form-group">
				<form:label path="name">name</form:label>
				<form:input path="name" type="text" class="form-control"
					required="required" />
				<form:errors path="name" cssClass="text-warning" />
			</fieldset>
			<fieldset class="form-group">
				<form:label path="desc">Description</form:label>
				<form:input path="desc" type="text" class="form-control"
					required="required" />
				<form:errors path="desc" cssClass="text-warning" />
			</fieldset>
			<fieldset class="form-group">
				<form:label path="category">category</form:label>
				<form:input path="category" type="text" class="form-control"
					required="required" />
				<form:errors path="category" cssClass="text-warning" />
			</fieldset>
			<fieldset class="form-group">
				<form:label path="size">size</form:label>
				<form:input path="size" type="text" class="form-control"
					required="required" />
				<form:errors path="size" cssClass="text-warning" />
			</fieldset>
			<fieldset class="form-group">
				<form:label path="price">price</form:label>
				<form:input path="price" type="text" class="form-control"
					required="required" />
				<form:errors path="price" cssClass="text-warning" />
			</fieldset>

			<button type="submit" class="btn btn-danger">Add</button>
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