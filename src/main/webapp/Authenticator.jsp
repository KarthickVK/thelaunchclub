<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Authenticator</title>
<style>
div {
  align:center;
  background-color: powderblue;
  width: 300px;
  height:190px;
  border: 5px solid green;
  padding: 30px;
  margin: 10px;
}
</style>
</head>
<body>
<div>
<h1>SIGN UP</h1>
<form action="Register" method="post">
<table>
<tr><td>User Name: </td><td><input type="text" name="uname"></td></tr>
<tr><td>Password: </td><td><input type="text" name="password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" title="Must contain atleast one number,one uppercase,lowercase and atleast 8 characters" required></td></tr>
<tr><td>Email: </td><td><input type="text" name="email"></td></tr>
<tr><td>phone: </td><td><input type="text" name="phone"></td></tr>
<tr><td></td><td><input type="submit" value="register"></td></tr>
</table>
</form>
</div>

<div>
<h1>LOGIN</h1>
<form action="Login" method="post">
<table>
<tr><td>User name:</td><td><input type="text" name="uname"></td></tr>
<tr><td>Password:</td><td><input type="text" name="password"></td></tr>
<tr><td></td><td><input type="submit" value="login"></td></tr>
</table>
</form>
</div>
</body>
</html>