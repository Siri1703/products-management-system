<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="styles/form.css">
<link rel="stylesheet" href="styles/header.css">
</head>

<body>
<ul>
  <li><a href="home.jsp">Home</a></li>
  <li><a href="home.jsp">Logout</a></li>
 
</ul>
<div class="login-box">
<h2>Enter New cost</h2>
<center>
<form action="lapud" method="post">
<div class="user-box">
Enter laptopid:<input type="number" name="lapid"><br>
Enter updated cost:<input type="number" name="cost"><br>
<input type="submit" value="update">
</div>
</form>
</center>
</div>
</body>
</html>