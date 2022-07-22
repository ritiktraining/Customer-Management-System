<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="index.css">
<title>Search Customer</title>
</head>
<body>

	<div class="header">
		<h2>Search Customer Form</h2>

	</div>
	<div class="topnav">
		<a class="active" href="welcome">Home</a> <a href="add">Add
			Customer</a> <a href="remove">Remove Customer</a> <a href="update">Update
			Customer</a> 

	</div>
	<div class="bodydiv">
		<form action="search" method="post">


			<div class="leftbox">
				<div>
					<label id="labelmargin" style="margin-right: 30px;">Customer
						Id : </label><input id="inputdefault" type="text" name="customerId"
						placeholder="id" required="required">
				</div>
				
			</div>

			<div id="button">
				<button class="button button1" type="submit">Search
					Customer</button>
			</div>




		</form>
		<form action="searchall" method="post">


			<div id="button">
				<button class="button button1" type="submit">Search All
					Customers</button>
			</div>




		</form>



	</div>

</body>
</html>