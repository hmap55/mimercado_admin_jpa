<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page session="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>MiMercado</title>
<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">

<link rel="stylesheet" href="css/admin.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
<link rel="icon" type="image/png"
	href="https://www.google.com/s2/favicons?domain=css-tricks.com">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link
	href="https://fonts.googleapis.com/css2?family=Roboto:wght@300&display=swap"
	rel="stylesheet">
</head>
<body>
	<!----------------------header-------------------->
	<%
		//HttpSession sesion = request.getSession();
		//String nombre = (String) sesion.getAttribute("sesionLog");
	%>
	<header class="header">
		<div class="header-logo">
			<h1>MIMERCADO</h1>
			<div class="imagen"></div>

		</div>

		<div class="header-busqueda">
			<input type="text" id="busqueda" placeholder="Busca un producto">
			<span class="logo-busqueda"> <i class="fas fa-search fa-2x"></i>
			</span>
		</div>
		<div class="header-admin">
			<div class="header-carrito">
				<h3 class="header-carrito-total">
					Total: <span id="total">0</span> <span> <i
						class="fas fa-shopping-cart "></i></span>
				</h3>
			</div>
			<div class="header-usuario">
				<h3 class="header-carrito-usuario">
				
				
					Mi nombre:<span id="nombre"> ${sesionLog}
					</span><span><i class="fas fa-user"></i></span>
				</h3>
			</div>
		</div>
	</header>


	<!----------------------nav-------------------->

	<nav class="menu">
		<ul class="menu-opciones">
			<a href=""><li class="opciones">Promos</li></a>
			<a href=""><li class="opciones">Secciones</li></a>
			<li class="opciones">Marcas</li>
			<li class="opciones">Favoritos</li>
		</ul>
	</nav>

	<!-- script-->





	<jsp:include page="WEB-INF/paginas/productos/botones.jsp" />

	<jsp:include page="WEB-INF/paginas/productos/listadoProducto.jsp" />






	<!--------------footer------------------------------------>
	<footer>
		<div class="container-footer">
			<div class="container-body">

				<div class="colum1">
					<h1>Información de contacto</h1>

					<p>Encuentra todo para tu hogar, de la mejor calidad y al mejor
						precio</p>
					<p>No dudes en contactarnos</p>
					<div class="row">
						<i class="far fa-envelope"></i> <label>Correo:MiMercado@MiMercado.com</label>
					</div>
					<div class="row">
						<i class="fas fa-phone-alt"></i> <label>Tel: 300 555 5555</label>

					</div>
				</div>

				<div class="colum2">
					<div class="logo">
						<img class="logo2" src="imagenes/img/logo_small_icon_only.png"
							alt="MiMercado" width="150" height="150">
					</div>
					<center>
						<h1>MiMercado</h1>
					</center>
				</div>

				<div class="colum3">
					<h1>Redes sociales</h1>
					<br />
					<div class="redes-container">
						<ul>
							<li><a href="https://www.facebook.com/" class="facebook"><i
									class="fab fa-facebook-square"></i></a></li>
							<li><a href="https://www.instagram.com/?hl=es"
								class="instagram"><i class="fab fa-instagram-square"></i></a></li>
							<li><a href="https://twitter.com/?lang=es" class="twitter"><i
									class="fab fa-twitter-square"></i></a></li>
						</ul>
					</div>
					<br />
					<center>
						<p>Siguenos en nuestras redes sociales</p>
					</center>
				</div>

			</div>
			<div class="container-copyright">
				<div class="copyright">MiMercado 2021 © Todos los derechos
					reservados</div>
			</div>
		</div>
	</footer>
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
		integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
		integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
		crossorigin="anonymous"></script>
</html>