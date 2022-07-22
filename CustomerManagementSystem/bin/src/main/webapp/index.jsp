<!DOCTYPE html>
<html lang="en">
<head>
<title>Customer Project</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
	<form action="welcome">

		<nav class="navbar navbar-expand-sm bg-dark navbar-dark"
			style="background: #1abc9c">
			<!-- Brand -->
			<a class="navbar-brand" href="welcome">HOME</a>

			<!-- Links -->
			<ul class="navbar-nav">


				<!-- Dropdown -->
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#" id="navbardrop"
					data-toggle="dropdown"> Customer </a>
					<div class="dropdown-menu">
						<a class="dropdown-item" href="/add">Add Customer</a> <a
							class="dropdown-item" href="/remove">Remove Customer</a> <a
							class="dropdown-item" href="/search">Search Customer</a> <a
							class="dropdown-item" href="/update">Update Customer</a>
					</div></li>
			</ul>
		</nav>
		<br>

		<div class="container">
			<h3>Manage Customer Details</h3>
			<ul>
				<li>Add New Customer Details</li>
				<li>Remove Old Customer Details</li>
				<li>Update Old Customer Details</li>
				<li>Search Customer Details</li>



			</ul>

		</div>


	</form>

</body>
</html>
