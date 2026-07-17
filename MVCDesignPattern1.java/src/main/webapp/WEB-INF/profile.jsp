<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="in.sp.model.User" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Profile</title>
</head>
<body>

<%
    User user = (User) session.getAttribute("session_user");

    if(user != null){
%>

<h2>WELCOME..</h2>

<h3>Name : <%= user.getName() %></h3>
<h3>Email : <%= user.getEmail() %></h3>

<%
    } else {
        response.sendRedirect("login.jsp");
    }
%>

</body>
</html>