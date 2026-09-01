<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add student </title>
</head>
<body>
<form action="student" method="post">
Name
<input type="text" name="name">
 Roll No:
 <input type="number" name="rollno">
 Marks:
 <input type="number" name="marks">
 <br></br>
 <input type ="submit" value="Add Student">
</form>
 <p>Name: ${name }</p>
 <p>Rollno. : ${rollno }</p>
 <p>Marks : ${marks }</p>
 
 
 
</body>
</html>