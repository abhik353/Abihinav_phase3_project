<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Insert title here</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
	<div class="container">
		<form:form method="post" modelAttribute="report">
			<form:hidden path="id" />
			<fieldset class="form-group">
				<form:label path="name">name</form:label>
				<form:input path="name" type="text" class="form-control" 
					required="required" />
				<form:errors path="name" cssClass="text-warning" />
			</fieldset>
			<fieldset class="form-group">
				<form:label path="product">product</form:label>
				<form:input path="product" type="text" class="form-control"
					required="required" />
				<form:errors path="product" cssClass="text-warning" />
			</fieldset>
			<fieldset class="form-group">
				<form:label path="category">category</form:label>
				<form:input path="category" type="text" class="form-control"
					required="required" />
				<form:errors path="category" cssClass="text-warning" />
			</fieldset>	
			<fieldset class="form-group">
				<form:label path="date">date</form:label>
				<form:input path="date" type="text" class="form-control"
					required="required" />
				<form:errors path="date" cssClass="text-warning" />
			</fieldset>			

			<button type="submit" class="btn btn-danger">add</button>
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