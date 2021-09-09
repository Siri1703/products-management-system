<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>

 input[type=submit] {
  width: 50%;
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
  }
  
  body {
	background: linear-gradient(-45deg, #ee7752, #e73c7e, #23a6d5, #23d5ab);
	background-size: 400% 400%;
	animation: gradient 15s ease infinite;
	height: 100vh;
}

@keyframes gradient {
	0% {
		background-position: 0% 50%;
	}
	50% {
		background-position: 100% 50%;
	}
	100% {
		background-position: 0% 50%;
	}
}
  
  </style>
  </head>
<body>
<center>
<form action="laptopadd">
<input type="submit" value="laptopadd"><br>
</form >
<form action="laptopavailable">
<input type="submit" value="laptopavailable" ><br>
</form>
<form action="laptopdelete.jsp">
<input type="submit" value="laptopdelete"><br>
</form>
<form action="laptopupdate.jsp">
<input type="submit" value="laptopupdate"><br>
</form>
</center>

</body>
</html>