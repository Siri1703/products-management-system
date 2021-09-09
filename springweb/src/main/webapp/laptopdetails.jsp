
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="styles/header.css">
<title>laptop</title>
<style>
html {
  height: 100%;
}
body {
  margin:0;
  padding:0;
  font-family: sans-serif;
  background: linear-gradient(#141e30, #243b55);
}
h1
{
margin: 0 0 30px;
  padding: 0;
  color: #ffffff;
  text-align: center;
}

.login-box {
  position: absolute;
  top: 50%;
  left: 50%;
  width: 400px;
  padding: 40px;
  transform: translate(-50%, -50%);
  background: rgba(0,0,0,.5);
  box-sizing: border-box;
  box-shadow: 0 15px 25px rgba(0,0,0,.6);
  border-radius: 10px;
}

.login-box h2 {
  margin: 0 0 30px;
  padding: 0;
  color: #ffffff;
  text-align: center;
}

.login-box .user-box {
  position: relative;
}

.login-box .user-box input {
  width: 100%;
  padding: 10px 0;
  font-size: 16px;
  color: #fff;
  margin-bottom: 30px;
  border: none;
  border-bottom: 1px solid #fff;
  outline: none;
  background: transparent;
}
.login-box .user-box label {
  position: absolute;
  top:0;
  left: 0;
  padding: 10px 0;
  font-size: 16px;
  color: white;
  pointer-events: none;
  transition: .5s;
}

.login-box .user-box input:focus ~ label,
.login-box .user-box input:valid ~ label {
  top: -20px;
  left: 0;
  color: #03e9f4;
  font-size: 12px;
}


</style>
</head>
<body>
<ul>
  <li><a href="home.jsp">Home</a></li>
  <li><a href="home.jsp">Logout</a></li>
 
</ul>
<center><h1>Enter laptop details to Add!!</h1></center>
<center>
<div class="login-box">
<h2>Enter details</h2>
<form  action="lap" method="POST">
<div class="user-box">
Enter Laptop id:<input type="text" name="lapid">
<br>

Enter Laptop Name:<input type="text" name="name"><br>

Enter ModelNo:<input type="text" name="modelno"><br>

Enter Laptop Cost:<input type="number" name="cost"><br>

<input type="submit" name="submit">
</div>
</form>
</div>
</center>
</body>
</html>