<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="form-container">
 	
 	<h1>Edit Student Details</h1>
 	
	<form:form method="POST" modelAttribute="User"  class="form-horizontal" action="/springexample/editsave">

<div class="row">
			<div class="form-group col-md-12">
				<div class="col-md-7">
					<form:hidden path="id"  class="form-control input-sm"/>
					<div class="has-error">
				</div>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="firstName">First Name</label>
				<div class="col-md-7">
					<form:input type="text" path="firstName" id="firstName" class="form-control input-sm"/>
					<div class="has-error">
						<form:errors path="firstName" class="help-inline"/>
					</div>
				</div>
			</div>
		</div>

		<div class="row">
			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="lastName">Last Name</label>
				<div class="col-md-7">
					<form:input type="text" path="lastName" id="lastName" class="form-control input-sm"/>
					<div class="has-error">
						<form:errors path="lastName" class="help-inline"/>
					</div>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="UserName">User Name</label>
				<div class="col-md-7">
					<form:input type="text" path="UserName" id="UserName" class="form-control input-sm"/>
					<div class="has-error">
						<form:errors path="UserName" class="help-inline"/>
					</div>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="type">Type</label>
				<div class="col-md-7" class="form-control input-sm">
					<form:radiobutton path="type" value="B" />Buyer
	    			<form:radiobutton path="type" value="S" />Seller
					<div class="has-error">
						<form:errors path="type" class="help-inline"/>
					</div>
				</div>
			</div>
		</div>


		<div class="row">
			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="email">Email</label>
				<div class="col-md-7">
					<form:input type="text" path="email" id="email" class="form-control input-sm"/>
					<div class="has-error">
						<form:errors path="email" class="help-inline"/>
					</div>
				</div>
			</div>
		</div>


		<div class="row">
			<div class="form-actions floatRight">
				<input type="submit" value="Edit" class="btn btn-primary btn-sm">
			</div>
		</div>
	</form:form>
	</div>
</body>
</html>