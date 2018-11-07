<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${product}

<form action="/addTocart" method= "post">
  <input type="submit" value="Add To Cart" />
</form>
<form action="/CheckOut" method="post">
   <input type="submit" value="Checkout" />
</form>
</body>
</html>