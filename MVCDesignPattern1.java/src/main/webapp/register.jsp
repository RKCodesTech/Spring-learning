<%@ page language="java" contentType="text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html>
<body>
<%--Eclipse sometimes serves an older deployed copy of an .html file.
You edited register.html, but Tomcat was still using an old version.--%>
<form action="Register" method="post">

Name:
<input type="text" name="name1"><br><br>

Email:                                         
<input type="email" name="email1"><br><br>

Password:
<input type="password" name="password"><br><br>

<input type="submit" value="Register">

</form>

</body>
</html>