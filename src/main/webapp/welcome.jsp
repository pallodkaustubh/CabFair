<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>





<h1 style='color:green'>YOUR SELECTED CAB TYPE IS  <%= request.getAttribute("ctype") %> </h1>

<h1 style='color:red'>YOU SELECTED TO TRAVEL FOR  <%= request.getAttribute("kms") %> KMS </h1>

<h1 style='color:blue'>YOUR TOTAL FARE AMMOUNT  IS  <%= request.getAttribute("BillAmt") %> </h1>


</body>
</html>