# Proyecto Logginspring

Este es un proyecto que permite simular un loggin, sistema de roles y ademas las funciones de un CRUD utilizando Spring Boot. El propósito de este proyecto es emular un sistema de recomendacion de libros.

## Capturas de Pantalla

Aquí se muestran algunas capturas de pantalla del proyecto, primero parte de la inicalizacion y programacion de funciones.

![Captura de Pantalla 1](./capturas/Crear.png)
![Captura de Pantalla 2](./capturas/Programar.png)

## Evidencias de Simulaciones o pruebas

Aquí la verdad en cierto momento me atore y como es muy dificil estar checando la terminal para ver donde esta a falla acudi a postman.
![Captura de Pantalla 3](./capturas/Pruebas.png)

### Bases de datos

Realmente entre cada intento termine creando muchos conflictos con otras bases jeje, pero aqui estan las capturas del xampp.
![Captura de Pantalla 4](./capturas/bases.png)
![Captura de Pantalla 5](./capturas/bases2.png)

### Finalmente capturas de las vistas generadas por el proyecto

No crei necesario añadir las vistas de diseños previos ya que si eso fuera, nunca acabamos, pero aqui estan las vistas.
![Captura de Pantalla 5](./capturas/vista1.png)
![Captura de Pantalla 6](./capturas/vista2.png)
![Captura de Pantalla 7](./capturas/vista3.png)
![Captura de Pantalla 10](./capturas/vista6.png)
### Se añaden correciones y funciones extra
Empezamos con la implementacion de un boron que nos permite cambiar entre tema claro y tema oscuro
![Captura de Pantalla 10](./capturas/claro.png)
![Captura de Pantalla 10](./capturas/oscuro.png)

Ademas de corregir fallas como la imposibiladad para subir imagenes de perfil
se tuvo que cambiar en el controlador de perfil la manera en la que se interpretaba la imagen
![Captura de Pantalla 10](./capturas/vista5.png)
![Captura de Pantalla 10](./capturas/perfil.png)

Tambien se arreglan fallas en el administrador, ya que el controlador de adminuser, no guardaba correctamente
los roles en database provocando multiples dificultades, ahora se puede modificar y gestionar los roles sin
problemas
![Captura de Pantalla 10](./capturas/administrar.png)
![Captura de Pantalla 10](./capturas/rol.png)

Finamente se muestra la funcion de reecomendacion funcionando 
![Captura de Pantalla 10](./capturas/recomendar.png)


## Evidencia de dockerizacion
![Captura de Pantalla 10](./capturas/docker.png)

## Evidencia de pruebas con MySQL Workbench
![Captura de Pantalla 10](./capturas/workb.png)

## IMPORTANTE: iniciar sesion con usuario "admin" y contraseña "admin" para ver interfaz de administrador

1. Clona este repositorio:
   ```bash
   git clone https://github.com/tuusuario/logginspring.git
