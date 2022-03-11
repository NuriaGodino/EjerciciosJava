<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/bienvenida.css">
</head>
<body>
	<div class="mensajes">
		<h1>Bienvenido ${param.usuario}</h1>
		<h2>Te invito a visitar mis otras páginas:</h2>
	</div>
	<div class="enlaces">
		<a class="cv" href="cv/Ejercicio3Curriculum/Index.html">Mi cv</a>
		<a class="web" href="libros/Ejercicio2HTML/Index.html">Mi web de libros</a>
	</div>
	
</body>
</html>