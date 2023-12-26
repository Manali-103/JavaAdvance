<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Login page</h2>
 <form action="UserValidationServlet">
 <pre>
Name:<input type="text" name="name"/>

 Physics:<input type="text" name="phy"/>
 Chemistry:<input type="text" name="chem"/>
 Maths:<input type="text" name="math"/>
 
 <input type="submit" value="Sign in">
 </pre>
 </form>
</body>
</html>