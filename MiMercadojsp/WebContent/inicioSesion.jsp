<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page session = "true" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registro</title>
    <link rel="stylesheet" href="css/diseno_registro.css">
    <link rel="icon" type="image/png" href="https://www.google.com/s2/favicons?domain=css-tricks.com">
    <script src="https://kit.fontawesome.com/3ea5541bf2.js" crossorigin="anonymous"></script>
</head>
<body>
    <header>
        <div class="img">
        <img src="imagenes/img/MiMercado1.jpeg" alt="MiMercado" width="200" height="150"></div>
        <br />
        <center><h1 class="Titulo_principal">Bienvenidos a MiMercado</h1></center>
    </header>
    <main>
        <form class="Registro"  action="login" method ="post">
            <label class="label_titulos" for="correo">Correo</label>
            <input class="formulario_input" type="email" name="correo"id="correo"placeholder="Ingrese su correo" required></input><br />
            <label class="label_titulos" for="contaseña">Contraseña</label>
            <input class="formulario_input" type="password" name="password"id="contraseña"placeholder="Ingrese su contraseña" required></input><br /><br />
            <center><input class="botones" type="submit" value="Iniciar sesion"></input></center>
        </form>
    </main>

    <footer>
        <div class="container-footer">
            <div class="container-body">

                <div class="colum1">
                    <h1>Información de contacto</h1>
               
                    <p>Encuentra todo para tu hogar, de la mejor calidad y al mejor precio</p>
                    <p>No dudes en contactarnos </p>
                    <div class="row">
                        <i class="far fa-envelope"></i>
                        <label>Correo:MiMercado@MiMercado.com</label></div>
                    <div class="row">
                        <i class="fas fa-phone-alt"></i>
                        <label>Tel: 300 555 5555</label>

            </div> 
                </div>

                <div class="colum2">
                    <div class="logo">
                    <img class="logo2" src="imagenes/img/logo_small_icon_only.png" alt="MiMercado" width="150" height="150"></div>
                    <center><h1>MiMercado</h1></center>
                </div>

                <div class="colum3">
                    <h1>Redes sociales</h1><br />
                    <div class="redes-container">
                        <ul>
                            <li><a href="https://www.facebook.com/" class="facebook"><i class="fab fa-facebook-square"></i></a></li>
                            <li><a href="https://www.instagram.com/?hl=es" class="instagram"><i class="fab fa-instagram-square"></i></a></li>
                            <li><a href="https://twitter.com/?lang=es" class="twitter"><i class="fab fa-twitter-square"></i></a></li>
                        </ul>
                    </div><br />
                    <center><p>Siguenos en nuestras redes sociales</p></center>
                </div>
            
            </div>
        <div class="container-copyright">
            <div class="copyright">
                MiMercado 2021 © Todos los derechos reservados
            </div>
            </div>
        </div>
    </footer>
    
    
</body>
</html>