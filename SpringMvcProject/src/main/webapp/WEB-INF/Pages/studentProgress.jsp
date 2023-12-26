<%@page import= "day10.Model.StudentProgress" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
 <%
    Object msg = request.getAttribute("message");
    Object progressReport = session.getAttribute("progressReport");
    StudentProgress progress = (StudentProgress)progressReport;
  %>
  <h2><%=msg %> here is your message</h2>
  <h2>your name:<%=progress.getName() %></h2>
  <h2>Total marks:<%=progress.getTotalmarks()%></h2>
</body>
</html>