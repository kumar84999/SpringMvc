<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<bodybgcolor="grey">
<p text-align="center"> <h1  >Register Student</h1> </p>
	<form action="./jk" method="post">
		<table>
			<tr>
				<td bgcolor="red">ID:</td>
				<td bgcolor="blue"><input type="text" name="id"></td>
			</tr>
			<tr>
				<td bgcolor="red">Name:</td>
				<td bgcolor="blue"><input type="text" name="name"></td>
			</tr>
			 
			<tr>
				<td bgcolor="red">dob:</td>
				<td bgcolor="blue"><input type="date" name="dob"></td>
			</tr>
			
			<tr>
				<td bgcolor="red">city:</td>
				<td bgcolor="blue" ><input type="text" name="city"></td>
			</tr>
			<tr>
				<td ><input type="submit" value="save"></td>
			</tr>


		</table>
		</form>
</body>
</html>