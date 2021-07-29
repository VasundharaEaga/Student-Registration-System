<%@page import="java.sql.*"%>
<%@page import="com.student.Admin"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<% Admin admin = (Admin) session.getAttribute("logAdmin");
 if(admin==null){
     response.sendRedirect("index.jsp");
 }
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome Admin</title>
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
     table.center {
  margin-left: auto; 
  margin-right: auto;
 
}
table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
}
      


</style>
<body>
	<form action="AdminLogoutServlet" method="post">
		<h1 style="text-align:center"> Welcome, <%= admin.getName() %></h1>
	    <h1 style="text-align:center"> Your Account ID: <%= admin.getId() %></h1>
	    <button class="btn">Logout</button>
	    <a href = 'admin_add_enroll.jsp';">ADD A COURSE</a>
	    
      
      
  	</form>
  	
  	<h1 style="text-align:center">Student Enrollment List</h1>
<%
try 
{  
    Class.forName("com.mysql.jdbc.Driver");  
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/C1","root","vasu");    
    Statement stmt = con.createStatement();  
    ResultSet rs = stmt.executeQuery("select * from enroll");  
%>

<table class="center" >
<tr>
<th>Student Name</th>
<th>Course ID</th>
<th>Course Name</th>
<th>Student Phone No</th>
</tr>
<%
while(rs.next()){
%>
<tr>
<td><%=rs.getString(1) %></td>	
<td><%=rs.getString(2) %></td>	
<td><%=rs.getString(3) %></td>	
<td><%=rs.getString(4) %></td>	
</tr>
<%
}
%>
</table>

<%
}
catch (Exception e) 
{  
 out.println("error");  
}  
%>
  	
</body>
</html>