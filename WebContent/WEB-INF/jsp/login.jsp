<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="./css/bootstrap/bootstrap-theme.css">
<link rel="stylesheet" type="text/css" href="./css/bootstrap/bootstrap.min.css">
<title>Home</title>
</head>

<body style="margin-top: 10px;margin-left: 25px;">
	<form action="saveServlet">
  		<div class="form-group">
    		<label>Email address</label>
    		<input class="form-control" placeholder="Email" name="username" value="${username}" />
  		</div>
  <div class="form-group">
    <label>Password</label>
    <input class="form-control" placeholder="Password" name="password" value="${password}" />
  </div>
  <button type="submit" class="btn btn-default">Submit</button>
</form>
</body>
</html>