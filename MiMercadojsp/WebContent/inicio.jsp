<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page session="true"%>
<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Mi Mercado</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<link rel="stylesheet" href="css/diseno_inicio.css">
<script src="https://kit.fontawesome.com/3ea5541bf2.js"
	crossorigin="anonymous"></script>
<link rel="icon" type="image/png"
	href="https://www.google.com/s2/favicons?domain=css-tricks.com">


</head>
<body>
	<header>
		<div class="encabezado">
			<img src="imagenes/img/MiMercado1.jpeg" alt="MiMercado" width="200"
				height="150"> <br />
			<center>
				<h1>Bienvenidos a MiMercado</h1>
			</center>
		</div>
	</header>
	<main class="principal">
	<form class="Registro" class="was-validated"
		action="${pageContext.request.contextPath}/RegistroUsuario?accion=insertar"
		method="post">
		<label class="label_titulos" for="nombre">Nombres</label> <input
			class="formulario_input" type="text" name="nombre" id="nombres"
			placeholder="Ingrese sus nombres" required></input><br /> 
			<label class="label_titulos" for="apellido">Apellido</label> <input
			class="formulario_input" type="text" name="apellido" id="nombres"
			placeholder="Ingrese sus nombres" required></input><br />
			<label class="label_titulos" for="cedula">Cedula</label> <input
			class="formulario_input" type="number" name="cedula" id="nombres"
			placeholder="Ingrese sus nombres" required></input><br />
			<label
			class="label_titulos" for="correo">Correo</label> <input
			class="formulario_input" type="email" name="correo" id="correo"
			placeholder="Ingrese su correo" required></input><br /> <label
			class="label_titulos" for="celular">Celular</label> <input
			class="formulario_input" type="number" name="celular" id="dirección"
			placeholder="Ingrese su dirección" required></input><br /> <label
			class="label_titulos" for="password">Contraseña</label> <input
			class="formulario_input" type="password" name="password"
			id="contraseña" placeholder="Ingrese su contraseña" required></input><br />
		<label class="label_titulos" for="confirmar_password">Confirmar
			contaseña</label> <input class="formulario_input" type="password"
			name="confirmar_password" id="confirmar"
			placeholder="Ingrese nuevamente su contaseña" required></input><br />
		<br />
		<center>
			<input class="botones" type="submit" value="Registrar"></input>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<a href="inicioSesion.jsp"><input class="botones" type="button"
				value="Iniciar sesion"></input></a>
		</center>
	</form>
	</main>



	<!-- footer-->


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

</body>
</html>