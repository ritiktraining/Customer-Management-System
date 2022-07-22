<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Searched Customer Details</title>
<link rel="stylesheet" href="index.css">
<style>
    table {
        box-sizing: border-box;
      border-collapse: collapse;
      width: 100%;
    }
    
    th, td {
      text-align: left;
      padding: 3px;
    }
    
    tr:nth-child(even) {background-color: #f2f2f2;}
    </style>
</head>
<body>

    <div class="header">
        <header><h2>Data From Search Page</h2></header>
    </div>
    <div class="topnav">
        <a class="active" href="welcome">Home</a>
        <a href="add">Add Customer</a>
        <a href="search">Search Customer</a>
        <a href="remove">Remove Customer</a>
        <a href="update">Update Customer</a>
       
		
      </div>

    <div style="margin-top: 40px; overflow-x: scroll;">
    <table >
        <tr>
        	<th>Cust. Id</th>
            <th>Customer Number</th>
            <th>Customer Name </th>
            <th>Customer Type</th>
            <th>Customer Phone</th>
            <th>Street</th>
            <th>City</th>
            <th>State</th>
            <th>Country</th>
            <th>Created By</th>
            <th>Created On</th>
            <th>Updated By</th>
            <th>Updated On</th>
         </tr>
          <c:forEach var="customerList" items="${customerList}">
         <tr>
            <td>${customerList.customerId}</td>
            <td>${customerList.customerNo }</td>
            <td>${customerList.customerName}</td>
            <td>${customerList.customerType}</td>
            <td>${customerList.customerPhone}</td>
            <td>${customerList.street}</td>
            <td>${customerList.city}</td>
            <td>${customerList.state}</td>
            <td>${customerList.country}</td>
            <td>${customerList.createdBy}</td>
            <td>${customerList.createdOn}</td>
            <td>${customerList.updatedBy}</td>
            <td>${customerList.updatedOn}</td>

         </tr>
 </c:forEach>

    </table>
</div>
</body>
</html>