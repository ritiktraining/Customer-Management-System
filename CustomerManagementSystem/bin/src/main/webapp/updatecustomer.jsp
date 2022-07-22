<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="index.css">
<title>Update Customer</title>


<script>
function populate(s1,s2){
	var s1 = document.getElementById(s1);
	var s2 = document.getElementById(s2);
	s2.innerHTML = "";
	
		
	if(s1.value == "India"){
		
		var optionArray =[
			<c:forEach items="${indiaList}" var="state" varStatus="status">  
		    '${ state.state_Name}'
		    <c:if test="${!status.last}">    
		      ,    
		    </c:if>  
		    </c:forEach>  
		];
	} else if(s1.value == "USA"){
		var optionArray =[
			<c:forEach items="${usaList}" var="state" varStatus="status">  
		    '${ state.state_Name}'
		    <c:if test="${!status.last}">    
		      ,    
		    </c:if>  
		    </c:forEach>  
		];
	} else if(s1.value == "Canada"){
		var optionArray =[
			<c:forEach items="${canadaList}" var="state" varStatus="status">  
		    '${ state.state_Name}'
		    <c:if test="${!status.last}">    
		      ,    
		    </c:if>  
		    </c:forEach>  
		];
		
	}
	else if(s1.value == "Australia"){
		var optionArray =[
			<c:forEach items="${australiaList}" var="state" varStatus="status">  
		    '${ state.state_Name}'
		    <c:if test="${!status.last}">    
		      ,    
		    </c:if>  
		    </c:forEach>  
		];
		
	}
	
	for(var option in optionArray){
		var pair = optionArray[option];
		var newOption = document.createElement("option");
		newOption.value = pair;
		newOption.innerHTML = pair;
		s2.options.add(newOption);
	}
}
</script>

</head>
<body>

	<div class="header">
		<h2>Update Customer Form</h2>

	</div>
	<div class="topnav">
		<a class="active" href="welcome">Home</a> <a href="add">Add
			Customer</a> <a href="search">Search Customer</a> <a href="remove">Remove
			Customer</a>



	</div>
	<div class="bodydiv">
		<form action="update" method="post">


			<div class="leftbox">
				<div>
					<label id="labelmargin" style="margin-right: 40px;">Customer
						Id : </label><input id="inputdefault" type="text" name="customerId"
						placeholder="Id" required="required">
				</div>
				<div>
					<label id="labelmargin" style="margin-right: 30px;">Customer
						No : </label><input id="inputdefault" type="text" name="customerNo"
						placeholder="Number">
				</div>
				<div>
					<label id="labelmargin">Customer Name : </label><input
						id="inputdefault" type="text" name="customerName"
						placeholder="Name">
				</div>
				<div>
					<label id="labelmargin" style="margin-right: 20px;">Customer
						Type : </label> <select name="customerType" id="inputdefault"
						placeholder="Type">
						<option value="none">Select</option>
						<option value="new">New</option>
						<option value="regular">Regular</option>

					</select>
				</div>
				<div>
					<label id="labelmargin">Customer Phone : </label><input
						id="inputdefault" type="text" name="customerPhone"
						placeholder="Phone">
				</div>
			</div>
			<div class="centerbox">
				<div>
					<label id="centermargin">Street : </label><input id="inputdefault"
						type="text" name="street" placeholder="Street">
				</div>
				<div>
					<label id="centermargin" style="margin-right: 40px;">City :
					</label><input id="inputdefault" type="text" name="city" placeholder="City">
				</div>

				<div>

					<label id="centermargin" style="margin-right: 15px;">Country
						: </label> <select id="country" name="country" class="company"
						onchange="populate(this.id,'state')">
						<option>Select</option>

						<c:forEach var="listValue" items="${countryList}">

							<option>${listValue.countryName}</option>

							<br>
						</c:forEach>


					</select>

				</div>

				<div>
					<label id="centermargin" style="margin-right: 35px;">State
						: </label><select id="state" name="state">



					</select>
				</div>


			</div>
			<div class="rightbox">
				<div>
					<label id="labelmargin">Created By : </label><input
						id="inputdefault" type="text" name="createdBy"
						placeholder="created by">
				</div>
				<div>
					<label id="labelmargin">Created On : </label><input
						id="inputdefault" type="date" name="createdOn">
				</div>
				<div>
					<label id="labelmargin">Updated By : </label><input
						id="inputdefault" type="text" name="updatedBy"
						placeholder="updated by">
				</div>
				<div>
					<label id="labelmargin">Updated On : </label><input
						id="inputdefault" type="date" name="updatedOn">
				</div>


			</div>
			<div id="button">
				<button class="button button1" type="submit">Update
					Customer</button>
			</div>




		</form>


	</div>

</body>
</html>