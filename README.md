# First Sergio Tomeo Samuel
## Voy a mostrar el resultado final de mi aplicación de la primera evaluación de la asignatura de Desarrollo de Interfaces, paso a paso.
### Enlace al repositorio de GitHub: https://github.com/SergioTS2101/First

## Demo de cómo funciona la app:

![Imagenes](https://github.com/SergioTS2101/First/blob/materialLogin/Imagenes/FirstGIF.gif)

## 1.Splash Screen 

![Imagenes](https://github.com/SergioTS2101/First/blob/materialLogin/Imagenes/First-Sergio.jpg)

El código fuente se encuentra aquí:
### Java
[Java](https://github.com/SergioTS2101/First/blob/materialLogin/app/src/main/java/com/sergio/first/SplashScreen.java)

### XML
[](https://github.com/SergioTS2101/First/blob/materialLogin/app/src/main/res/layout/activity_splash_screen.xml)

## 2.Login Screen

Tras haber visto el Splash Screen con su respectiva animación, el siguiente activity que se inicia es el Login Activity, el cual tiene este aspecto:

![Imagenes](https://github.com/SergioTS2101/First/blob/materialLogin/Imagenes/LoginScreen.png)

El código fuente se encuentra aquí:
### Java 
[](https://github.com/SergioTS2101/First/blob/materialLogin/app/src/main/java/com/sergio/first/LoginActivity.java)

### XML
[](https://github.com/SergioTS2101/First/blob/materialLogin/app/src/main/res/layout/activity_login.xml)

## 3.Main Screen
Tras introducir un nombre de usuario y una contraseña, haciendo click sobre el botón de "entrar", 
iremos al MainActivity, sobre la cual se desarrolla toda la actividad principal de la app.

![Imagenes](https://github.com/SergioTS2101/First/blob/materialLogin/Imagenes/MainEntrar.jpg)

![Imagenes](https://github.com/SergioTS2101/First/blob/materialLogin/Imagenes/Main1.png)

Esta ventana cuenta con un WebView, el cual nos hace posible implementar una página web en 
nuestra aplicación.

Este en concreto, según refrescamos la ventana (hecho con un SwipeRefresh Layout), 
nos cambia la imagen del vehículo en pantalla y nos aparece un *toast* que nos indica que la 
imagen ha sido actualizada.

![Imagenes](https://github.com/SergioTS2101/First/blob/materialLogin/Imagenes/Main12.png)

![Imagenes](https://github.com/SergioTS2101/First/blob/materialLogin/Imagenes/Main11.png)


En este MainActivity si hacemos un *tap* largo, nos aparecerá un menú, 
desde el cual podemos copiar texto (si hubiera) o descargar la imagen y esto lo sabrá el 
usuario por unos snackbar que aparecerá al instante de realizar estas acciones.

![Imagenes](https://github.com/SergioTS2101/First/blob/materialLogin/Imagenes/Main2.png)

![Imagenes](https://github.com/SergioTS2101/First/blob/materialLogin/Imagenes/Main3.png)

![Imagenes](https://github.com/SergioTS2101/First/blob/materialLogin/Imagenes/Main4.png)

Cuando hacemos click sobre el logo de la aplicación, nos aparecerá un 
*MaterialAlertDIalogBuilder* que nos preguntará si queremos volver al *Login*, 
dependiendo de la opción que pulsemos, hará una acción u otra la app.

Por el momento vamos a seleccionar la opción que dice __no__.

![Imagenes](https://github.com/SergioTS2101/First/blob/materialLogin/Imagenes/MainLogo.jpg)

![Imagenes](https://github.com/SergioTS2101/First/blob/materialLogin/Imagenes/Main5.png)

Si hacemos click sobre el la llave, se nos abrirá un *AlertDialog.builder*,
que nos permitirá seleccionar un correo electrónico en el caso de que queramos cambiar de cuenta.

![Imagenes](https://github.com/SergioTS2101/First/blob/materialLogin/Imagenes/MainCuenta.jpg)

![Imagenes](https://github.com/SergioTS2101/First/blob/materialLogin/Imagenes/Main6.png)

Tras hacer click sobre los 3 puntos, se nos despliega un menú que cuenta con 2 opciones. 
Una que nos llevará al AboutUsActivity y otra que nos dirigirá al SignUpActivity.

![Imagenes](https://github.com/SergioTS2101/First/blob/materialLogin/Imagenes/Main7.png)

Seleccionamos *Sobre nosotros* y nos aparecerá lo siguiente:

![Imagenes](https://github.com/SergioTS2101/First/blob/materialLogin/Imagenes/Main8.png)

El código fuente se encuentra aquí:
### Java
[](https://github.com/SergioTS2101/First/blob/materialLogin/app/src/main/java/com/sergio/first/AboutUsActivity.java)

### XML
[](https://github.com/SergioTS2101/First/blob/materialLogin/app/src/main/res/layout/sobre_nosotros.xml)

Si por el contrario, elegimos *Crear cuenta*, nos aparecerá lo siguiente:

![Imagenes](https://github.com/SergioTS2101/First/blob/materialLogin/Imagenes/Main9.png)

Tras introducir los datos y crear una cuenta, en la pantalla aparecerá un *toast* que nos 
indica que hemos creado una cuenta nueva con éxito.

![Imagenes](https://github.com/SergioTS2101/First/blob/materialLogin/Imagenes/Main10.png)

El código fuente se encuentra aquí:
### Java
[](https://github.com/SergioTS2101/First/blob/materialLogin/app/src/main/java/com/sergio/first/MainActivity.java)

### XML
[](https://github.com/SergioTS2101/First/blob/materialLogin/app/src/main/res/layout/activity_main.xml)


## 4.Sign Up Screen

Si somos usuarios nuevos y no tenemos una cuenta creada, podemos pinchar sobre el cuadro que 
dice "¿No tienes cuenta? Crear una" que nos llevará a una ventana que nos permita exclusivamente
realizar esta acción.

![Imagenes](https://github.com/SergioTS2101/First/blob/materialLogin/Imagenes/MainCrearCuenta.jpg)

Después de haber rellenado los campos para crear una cuenta, si hacemos click sobre el botón 
"Crear cuenta", nos aparecerá un toast que nos indica que nos hemos creado la cuenta con éxito.

![Imagenes](https://github.com/SergioTS2101/First/blob/materialLogin/Imagenes/SignUp1.png)

El código fuente se encuentra aquí:
### Java
[](https://github.com/SergioTS2101/First/blob/materialLogin/app/src/main/java/com/sergio/first/SignUpActivity.java)

### XML
[](https://github.com/SergioTS2101/First/blob/materialLogin/app/src/main/res/layout/activity_signup.xml)







