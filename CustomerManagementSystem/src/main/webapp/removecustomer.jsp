<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="index.css">
<title>Remove Customer</title>
</head>
<body>
    
    <div class="header">
        <h2>Remove Customer Form</h2>

    </div>
    <div class="topnav">
        <a class="active" href="welcome">Home</a>
        <a href="add">Add Customer</a>
        <a href="search">Search Customer</a>
        <a href="update">Update Customer</a>
       
		
      </div>
	<div class="bodydiv">
		<form action="remove" method="post">
			
			
            <div class="leftbox">
			<div>
				<label id="labelmargin" style="margin-right: 30px;">Customer Id   : </label><input id="inputdefault" type="text" name="customerId" placeholder="Id" required="required">
			</div>
			<div>
			<ul><li>Note : Use Search Menu To Find Out The Customer Id </li></ul>
			</div>
			
        </div>
        	
        <div id="button">
            <button class="button button1"  type="submit">Remove Customer</button>
        </div>
    
       
 

		</form>
        
       
	</div>

</body>
</html>