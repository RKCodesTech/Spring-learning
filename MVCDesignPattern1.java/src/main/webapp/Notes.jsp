<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MVC Notes</title>

<style>
body{
    font-family: Arial, sans-serif;
    margin:40px;
    background:#f4f4f4;
    line-height:1.6;
}

.container{
    width:80%;
    margin:auto;
    background:white;
    padding:30px;
    border-radius:10px;
    box-shadow:0 0 10px rgba(0,0,0,0.2);
}

h1{
    text-align:center;
    color:#0d6efd;
}

h2{
    color:#dc3545;
}

h3{
    color:#198754;
}

pre{
    background:#eeeeee;
    padding:10px;
    border-radius:5px;
}

table{
    width:100%;
    border-collapse:collapse;
    margin-top:10px;
}

table,th,td{
    border:1px solid black;
}

th,td{
    padding:10px;
    text-align:center;
}

a{
    text-decoration:none;
    font-size:18px;
    color:white;
    background:#0d6efd;
    padding:10px 20px;
    border-radius:5px;
}

a:hover{
    background:#084298;
}
</style>

</head>
<body>

<div class="container">

<h1>MVC (Model–View–Controller) Notes</h1>

<hr>

<h2>1. Model</h2>

<h3>Definition</h3>

<p>
Model is the component that stores and manages application data and business logic.
</p>

<h3>Examples</h3>

<ul>
<li>User.java</li>
<li>Student.java</li>
</ul>

<h3>Responsibilities</h3>

<ul>
<li>Stores user/student information.</li>
<li>Contains data members (fields).</li>
<li>Uses getters and setters.</li>
<li>Passes data between the Controller and DAO.</li>
</ul>

<h3>Example</h3>

<pre>
public class User{

    private String name;
    private String email;
    private String password;

    //Getters and Setters

}
</pre>

<hr>

<h2>2. View</h2>

<h3>Definition</h3>

<p>
View is the user interface that displays data and accepts input from the user.
</p>

<h3>Examples</h3>

<ul>
<li>login.jsp</li>
<li>register.jsp</li>
<li>profile.jsp</li>
<li>HTML pages</li>
</ul>

<h3>Responsibilities</h3>

<ul>
<li>Takes input from the user.</li>
<li>Displays output.</li>
<li>Does not contain business logic.</li>
</ul>

<hr>

<h2>3. Controller</h2>

<h3>Definition</h3>

<p>
Controller receives the user's request, processes it, and coordinates between the View and the Model.
</p>

<h3>Examples</h3>

<ul>
<li>LoginServlet</li>
<li>RegisterServlet</li>
</ul>

<h3>Responsibilities</h3>

<ul>
<li>Receives requests from the View.</li>
<li>Reads form data.</li>
<li>Creates Model objects.</li>
<li>Calls DAO methods.</li>
<li>Sends the response to the appropriate page.</li>
</ul>

<hr>

<h2>4. DAO (Data Access Object)</h2>

<h3>Definition</h3>

<p>
DAO is a class that communicates with the database and performs database operations.
</p>

<h3>Responsibilities</h3>

<ul>
<li>Insert Data</li>
<li>Update Data</li>
<li>Delete Data</li>
<li>Search Data</li>
<li>Validate Login</li>
<li>Retrieve Records</li>
</ul>

<hr>

<h2>5. Database</h2>

<h3>Definition</h3>

<p>
Database stores all application data permanently.
</p>

<h3>Example</h3>

<table>

<tr>
<th>ID</th>
<th>Name</th>
<th>Email</th>
</tr>

<tr>
<td>1</td>
<td>Riya</td>
<td>riya@gmail.com</td>
</tr>

<tr>
<td>2</td>
<td>Aman</td>
<td>aman@gmail.com</td>
</tr>

</table>

<hr>

<h2>6. HttpSession</h2>

<h3>Definition</h3>

<p>
HttpSession is used to store information about the currently logged-in user on the server across multiple HTTP requests.
</p>

<h3>Common Methods</h3>

<pre>
HttpSession session = request.getSession();

session.setAttribute("user", user);

User user = (User) session.getAttribute("user");

session.invalidate();
</pre>

<hr>

<h2>7. RequestDispatcher</h2>

<h3>Definition</h3>

<p>
RequestDispatcher is used to forward a request from one servlet or JSP to another resource on the server.
</p>

<h3>Example</h3>

<pre>
RequestDispatcher rd = request.getRequestDispatcher("profile.jsp");

rd.forward(request,response);
</pre>

<h3>Features</h3>

<ul>
<li>Same request and response are used.</li>
<li>Browser URL does not change.</li>
<li>Faster than sendRedirect().</li>
</ul>

<hr>

<h2>8. sendRedirect()</h2>

<h3>Definition</h3>

<p>
sendRedirect() sends the client to another resource by creating a new request.
</p>

<h3>Example</h3>

<pre>
response.sendRedirect("profile.jsp");
</pre>

<h3>Features</h3>

<ul>
<li>Creates a new request.</li>
<li>Browser URL changes.</li>
<li>Request attributes are lost.</li>
</ul>

<hr>

<h2>Difference Between forward() and sendRedirect()</h2>

<table>

<tr>
<th>forward()</th>
<th>sendRedirect()</th>
</tr>

<tr>
<td>Server Side</td>
<td>Client Side</td>
</tr>

<tr>
<td>Same Request</td>
<td>New Request</td>
</tr>

<tr>
<td>URL Does Not Change</td>
<td>URL Changes</td>
</tr>

<tr>
<td>Faster</td>
<td>Slightly Slower</td>
</tr>

<tr>
<td>Request Attributes Available</td>
<td>Request Attributes Lost</td>
</tr>

</table>

<hr>

<h2>MVC Architecture Flow</h2>

<pre>
User
   │
   ▼
login.jsp (View)
   │
   ▼
LoginServlet (Controller)
   │
   ▼
User.java (Model)
   │
   ▼
UserDAO (DAO)
   │
   ▼
MySQL Database
   │
   ▼
Success / Failure
   │
   ▼
profile.jsp / login.jsp
</pre>

<hr>

<h2>One-Line Revision</h2>

<ul>
<li><b>Model</b> → Stores application data.</li>

<li><b>View</b> → Displays data and accepts user input.</li>

<li><b>Controller</b> → Handles requests and controls application flow.</li>

<li><b>DAO</b> → Performs database operations.</li>

<li><b>Database</b> → Stores all records permanently.</li>

<li><b>HttpSession</b> → Maintains logged-in user information.</li>

<li><b>RequestDispatcher</b> → Forwards a request without changing the URL.</li>

<li><b>sendRedirect()</b> → Redirects using a new request and changes the URL.</li>

</ul>

<br><br>

<a href="profile.jsp">⬅ Back to Profile</a>

</div>

</body>
</html>