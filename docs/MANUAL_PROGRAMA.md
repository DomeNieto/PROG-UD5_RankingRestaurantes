# Documentación del programa
_**RakingRestaurantes**, es una aplicación de gestión de restaurantes que permite a los usuarios realizar diversas operaciones como agregar, editar, mostrar y eliminar información sobre los restaurantes registrados._

## Interfaz de Usuario
La interfaz de usuario se basa en ventanas emergentes utilizando a librería _java.swing_ de Java, lo que facilita la interacción del usuario con la aplicación.

---
## ESTRUCTURA DEL CÓDIGO
El código fuente del proyecto está organizado de la siguiente manera:

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp; ![image](https://github.com/DomeNieto/PROG-UD5_RankingRestaurantes/assets/159430482/8e75b53e-faa9-44b9-9fad-c05cc788aabf)


---
## CLASES EJECUTABLE
**App**

En la clase App, se encuentra la clase ejecutable del proyecto (Main), proporciona un bucle while para
garantizar la continuidad del programa, hasta que el usuario desee.
Desde esta clase se vinculan todos los métodos del proyecto y se sigue una lógica de menú

![image](https://github.com/DomeNieto/PROG-UD5_RankingRestaurantes/assets/159430482/b0c3a1d9-67c0-42db-a123-6e31332cb1a7)


---
## CLASES HOSTELERIA
**Restaurante**

Esta clase, llamada Restaurante, representa un restaurante de la Hosteleria y en ella se encuentran los
atributos generales y básico para poder ser almacenado.

##### Atributos

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;![image](https://github.com/DomeNieto/PROG-UD5_RankingRestaurantes/assets/159430482/5a4ae5ef-d099-48a6-9a93-adca65dc4534)


##### Métodos
- ###### Constructores
Los contructores de la clase reciben como parámetros los valores para inicializar los atributos de un
nuevo objeto.

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
![image](https://github.com/DomeNieto/PROG-UD5_RankingRestaurantes/assets/159430482/2a8f292b-e219-459f-ae2b-91071149875f)


- ###### Métodos de acceso getters y setters
Los métodos de acceso (getters) y modificación (setters) ofrecen una forma de obtener y cambiar
los atributos de un objeto Publicación.

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
 &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp;![image](https://github.com/DomeNieto/PROG-UD5_RankingRestaurantes/assets/159430482/fc24d947-8af5-4e3a-b1ec-00f2db5641f6)

- ###### toString
Se sobreescribe el método toString para controlar el formato que se va usar para mostrar la
información sobre el objeto que se almacene de tipo “Restaurante”

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
 ![image](https://github.com/DomeNieto/PROG-UD5_RankingRestaurantes/assets/159430482/a37073cb-536b-4b1c-b457-22464a46ca07)


---
**Gestor**
La clase Gestor proporciona métodos para gestionar y manipular la información almacenada.
Esta clase incluye métodos para añadir, elimininar, editar y mostrar información de restaurantes.

- **agregarRestaurante()**
  
Almacena la infromación necesaria para agregar un nuevo restaurante en el ArrayList de Restaurante, se usan una serie de validadores para grantizar la integridad del programa.

#### Funcionalidad:
- Solicita al usuario que ingrese el nombre, la locación, horario y puntuación del restaurante.
- Utiliza la clase Validador para asegurarse de que los datos ingresados no estén vacíos.
- Solicita al usuario que ingrese la puntuación del restaurante utilizando el método Validador.recibirPuntuacion().
- Crea un nuevo objeto Restaurante con los datos ingresados.
- Agrega el nuevo restaurante a la lista de restaurantes.

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
![image](https://github.com/DomeNieto/PROG-UD5_RankingRestaurantes/assets/159430482/ff4ab4a0-2e25-46f8-b07d-18f6b426933c)


- **mostrarRestaurantes()**
  
Muestra la información en el el ArrayList de Restaurante de manera ordenada descendentemente teniendo como parámetro la puntuación que ha recibido el restaurante.
Usa las interfaces Collections y Comparator de java.util

#### Funcionalidad:
- Comprueba si la lista de restaurantes está vacía.
- Si hay restaurantes registrados, ordena la lista en orden descendente según la puntuación de los restaurantes.
- Construye un mensaje que contiene la lista de restaurantes ordenados, numerados y formateados.

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
![image](https://github.com/DomeNieto/PROG-UD5_RankingRestaurantes/assets/159430482/aaf7f21e-8a3a-4d75-a22d-84969fdbdb76)


- **editarRestaurante()**
  
Se encarga de permitir al usuario editar los atributos de un restaurante existente en la lista.

#### Funcionalidad:
  - Comprueba si la lista de restaurantes está vacía.
  
  - Si hay restaurantes registrados, muestra la lista y solicita al usuario que elija el índice del restaurante a editar.
  
  - Una vez seleccionado el restaurante, muestra un menú de opciones para elegir qué atributo editar (nombre, locación, horario o puntuación).
  
  - Llama al método editarAtributo() para realizar la edición del atributo seleccionado.
  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
![image](https://github.com/DomeNieto/PROG-UD5_RankingRestaurantes/assets/159430482/4e4734e5-ccba-431b-be39-d58d9cee3053)


- **editarAtributo(Restaurante restaurante, String atributo)**
  
Realiza la edición de un atributo específico de un restaurante, sirve como auxiliar del método editarRestaurante().
#### Parámetros:
- restaurante: El restaurante que se va a editar.
- atributo: El atributo del restaurante que se va a editar (nombre, locación, horario o puntuación).
#### Funcionalidad:
- Solicita al usuario que ingrese el nuevo valor para el atributo seleccionado.
- Valida que el nuevo valor no esté vacío.
- Realiza la edición del atributo correspondiente del restaurante.
- Muestra un mensaje de confirmación después de la edición.
  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
![image](https://github.com/DomeNieto/PROG-UD5_RankingRestaurantes/assets/159430482/24af6717-be22-4fb3-b4a0-81b0bdffaef8)


- **eliminarRestaurante()**
Permitir al usuario eliminar un restaurante de la lista.
#### Funcionalidad:
- Comprueba si la lista de restaurantes está vacía.
- Si hay restaurantes registrados, muestra la lista y solicita al usuario que elija el índice del restaurante a eliminar.
- Elimina el restaurante seleccionado de la lista.
- Muestra un mensaje de confirmación después de la eliminación.
  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
![image](https://github.com/DomeNieto/PROG-UD5_RankingRestaurantes/assets/159430482/ca409c1e-3f61-42f4-9c84-daf11bf8acf4)

---
## CLASES UTILARIAS
>[!NOTE]
>### _Excepciones_
**Validador**

- **validarDato(String dato)**
  
Verifica si un dato ingresado no está vacío.
##### Parámetros:
- dato: El dato que se va a validar.
##### Funcionalidad:
- Verifica si el dato no está vacío.
- Si el dato está vacío, muestra un mensaje de error.
- Retorna true si el dato no está vacío, de lo contrario, retorna false.
  
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;![image](https://github.com/DomeNieto/PROG-UD5_RankingRestaurantes/assets/159430482/b174e3c4-ac3c-46fe-895f-451f6155a9e1)

- **recibirPuntuacion()**
  
  Solicita al usuario que ingrese la puntuación de un restaurante y valida que sea un número dentro del rango válido (entre 0 y 5).
  ##### Funcionalidad:
- Utiliza un bucle  para solicitar continuamente la puntuación hasta que se ingrese un valor válido.
- Utiliza un bloque try-catch para capturar excepciones si el usuario ingresa una cadena que no se puede convertir a un número.
- Verifica que la puntuación esté dentro del rango válido.
- Muestra mensajes de error si la puntuación ingresada no es válida.
  
   ![image](https://github.com/DomeNieto/PROG-UD5_RankingRestaurantes/assets/159430482/97a7ceed-b07a-429b-a629-d5a39e925f1b)

- **recibirIndice(ArrayList<Restaurante> restaurantes)**
  
  Solicita al usuario que ingrese el número del restaurante que desea seleccionar y valida que sea un número entero dentro del rango válido.
  ##### Parámetros:
  - restaurantes: La lista de restaurantes de la cual se seleccionará el índice.
  ##### Funcionalidad:
- Utiliza un bucle para solicitar continuamente el número del restaurante hasta que se ingrese un valor válido.
- Utiliza un bloque try-catch para capturar excepciones si el usuario ingresa una cadena que no se puede convertir a un número entero.
- Verifica que el índice esté dentro del rango válido (entre 1 y el tamaño de la lista de restaurantes).
- Muestra un mensaje de error si el índice ingresado no es válido.
  
![image](https://github.com/DomeNieto/PROG-UD5_RankingRestaurantes/assets/159430482/efc289a5-a606-45ae-92c8-dd3a1c2e9743)

---
**Menu**
- **mostrarMenuPrincipal()**
  
Muestra un menú con las opciones principales del programa y solicita al usuario que elija una opción.
##### Funcionalidad:
- Muestra un cuadro de diálogo con un menú que incluye 5 opciones
- Solicita al usuario que elija una opción.
- Retorna la opción seleccionada por el usuario como una cadena de texto.

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;![image](https://github.com/DomeNieto/PROG-UD5_RankingRestaurantes/assets/159430482/afd8d592-2a6c-4533-8326-72271d5f841d)

-  **mostrarMenuEdicion()**
  
Muestra un menú con las opciones de información que se pueden editar para un restaurante y solicita al usuario que elija una opción.
##### Funcionalidad:
- Muestra un cuadro de diálogo con un menú que incluye 4 opciones:
- Solicita al usuario que elija una opción.
- Retorna la opción seleccionada por el usuario como una cadena de texto.
  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;![image](https://github.com/DomeNieto/PROG-UD5_RankingRestaurantes/assets/159430482/90873b93-1618-4d9f-87ec-170aa07cd45b)


---
[**Volver**](README.md)
