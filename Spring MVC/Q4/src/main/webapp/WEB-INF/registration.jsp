<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body>
	<h1>Registration:</h1>
	<form action="/registerUser.html" method="post">
    <table>
    <tr>
        <td>Username:</td><td> <input type="text" name="username"/></td>
    </tr>
    <tr>
        <td>Email:</td><td> <input type="text" name="email"/></td>
    </tr>
    <tr>
       <td>Password: </td><td> <input type="password" name="password"/></td>
    
    </tr>
     <tr>
     <td><td> <input type="submit" value="register"/></td>
     </tr>
     </table>
     </form>
</body>
</html>