<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Course List</title>
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
	<h1 style="text-align:center">Available Course List</h1>
<%
try 
{  
    Class.forName("com.mysql.jdbc.Driver");  
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/C1","root","vasu");    
    Statement stmt = con.createStatement();  
    ResultSet rs = stmt.executeQuery("select * from course");  
%>

<table class="center" >
<tr>
<th>Course ID</th>
<th>Course Name</th>
<th>Course Description</th>
<th>Course Fee</th>
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

<div class="text-center"> 
		<button class="btn" onclick="window.location.href = 'enroll_course.jsp';">To enroll into the course,click on this link</button>
		<button class="btn" onclick="window.location.href = 'welcome_student.jsp';">Back to welcome Page</button>
	</div>

	

</body>
</html>