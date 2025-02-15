# RegEx - Java Terminal

Este programa en Java está diseñado para identificar si un texto ingresado por el usuario es un correo electrónico, un número de teléfono en el formato nnn-nnn-nnnn, o una dirección URL. El programa utiliza Programación Orientada a Objetos (POO) y está dividido en tres clases principales: Main, Interfaz, y Regex.

Estructura del Programa
Clase Principal (Main):

Esta clase contiene el método main que inicia la ejecución del programa.
Solicita al usuario que ingrese un texto y continúa solicitando texto hasta que el usuario ingrese "salir".
Utiliza la clase Interfaz para determinar el tipo de texto ingresado y muestra el resultado correspondiente.
Clase Interfaz:

Actúa como intermediaria entre la entrada del usuario y la clase Regex.
Contiene métodos que llaman a los métodos estáticos de la clase Regex para validar el texto ingresado.
Clase Regex:

Contiene las expresiones regulares necesarias para validar si el texto es un correo electrónico, un número de teléfono o una dirección URL.
Proporciona métodos estáticos que utilizan estas expresiones regulares para realizar las validaciones.
