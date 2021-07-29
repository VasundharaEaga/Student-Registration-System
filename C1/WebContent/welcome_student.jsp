<%@page import="com.student.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<% User user = (User) session.getAttribute("logUser");
 if(user==null){
     response.sendRedirect("index.jsp");
 }
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome Student Page</title>
</head>
<style>
 body {
  background-image: url('F:/JDBC/C1/WebContent/wood.jpeg');
}
.btn {
            background-color: white;
            border: 2px solid black;
            color: green;
            padding: 5px 10px;
            text-align: center;
            display: inline-block;
            font-size: 20px;
            margin: 10px 30px;
            cursor: pointer;
            text-decoration:none;
        }
         .text-center {
  text-align: center;
}
        

</style>

<body>
	<form action="StudentLogoutServlet" method="post">
		<h1 style="text-align:center"> Welcome, <%= user.getName() %></h1>
	     <h3 style="text-align:center">Your Account ID: <%= user.getId() %> </h3>
	    <div class="text-center"> 
			<button class="btn">Logout</button>
			<a href="student_enroll.jsp">ENROLL IN A COURSE</a>
		</div> 
      
  	</form>
  
</body>
</html>