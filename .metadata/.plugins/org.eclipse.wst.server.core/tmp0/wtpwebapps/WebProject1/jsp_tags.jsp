<%@ page import="java.time.LocalDate, java.time.LocalTime" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body >
   <h1> demonstrating JSP tags</h1>
   <%@ include file = "greeting.html" %>
   <%----Adding some decoration --%>
   
   <%!
   int number = 5;
   public String sayWelcome(String name){
	   return "Welcome" + name;
   } 
   %>
   
   <%-----Printing hello 5 times using <h2> Heading --%>
   
   <%
     for(int a= 1; a<=5; a++){
    	 
     
   
   %>
   <h2>Hello</h2>
   <% 
   }
   LocalDate  sysdate = LocalDate.now();
   LocalTime  sysTime = LocalTime.now();
   
   %>
   <h2>Number is<%=number %></h2>
   <h2>Square of <%=number %> is<%=(number*number) %></h2>
   <h2>Reply from method is <%=sayWelcome("Manaaa") %></h2>
</body>
</html>