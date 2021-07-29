<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome Page</title>

</head>
<style>
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
        
        body {
  background-image: url('F:/JDBC/C1/WebContent/wood.jpeg');
}
        .text-center {
  text-align: center;
}
        
</style>
<body>
	<h1 style="text-align:center">Online Course Registration</h1>
	
	<div class="text-center"> 
		<button class="btn" onclick="window.location.href = 'admin_login.jsp';">LOGIN AS A ADMIN</button>
		<button class="btn" onclick="window.location.href = 'student_login.jsp';">LOGIN AS A STUDENT</button>
	</div>
</body>
</html>