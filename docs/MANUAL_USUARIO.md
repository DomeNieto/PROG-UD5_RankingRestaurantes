# Manual de usuario

_**RakingRestaurantes**, es una aplicación de gestión de restaurantes que permite a los usuarios realizar diversas operaciones como agregar, editar, mostrar y eliminar información sobre los restaurantes registrados._

## Interfaz de Usuario

La interfaz de usuario se basa en ventanas emergentes utilizando a librería _java.swing_ de Java, lo que facilita la interacción del usuario con la aplicación.

## Menú

Al ejecutar la aplicación, se muestra un menú con 5 diferentes opciones. Cada opción sirve para gestionar los datos de los restaurantes dentro de la hostelería RipAdbaisor.

![image](https://github.com/DomeNieto/PROG-UD5_RankingRestaurantes/assets/159430482/823cd415-1085-4bc9-9ef3-07eacf751ef3)

---
## Funcionalidades principales

### Opción 1 - _Añadir Restaurante_

Permite al usuario agregar un nuevo restaurante.Al agregar un restaurante, se solicita al usuario que ingrese la siguiente información:

- Nombre
  
  ![image](https://github.com/DomeNieto/PROG-UD5_RankingRestaurantes/assets/159430482/5070d1ee-cbbc-4df2-bdad-b93e54c512c5)

- Ubicación
  
  ![image](https://github.com/DomeNieto/PROG-UD5_RankingRestaurantes/assets/159430482/fb985cc5-f714-4bc7-9a36-a08757504b77)

- Horario

  ![image](https://github.com/DomeNieto/PROG-UD5_RankingRestaurantes/assets/159430482/fe0d4e2b-d32b-4c43-881b-5bd9f59dcdbf)

- Puntuación


>[!NOTE]
>**Entradas y Validaciones**
- Si el usuario no ingresa la información solicitada, se muestra un mensaje de advertencia.

![image](https://github.com/DomeNieto/PROG-UD5_RankingRestaurantes/assets/159430482/332a6050-6b2d-4a1f-be3f-46d121c84664)

- Si el usuario ingresa en el dato puntuación un valor inferior a 0 o mayor que 5, se muestra en pantalla un mensaje que indica el error.
  
![image](https://github.com/DomeNieto/PROG-UD5_RankingRestaurantes/assets/159430482/5a78571e-29f0-4a0b-b973-378a05707bfa)

- Si el usuario ingresa en una frase/letra, en la casilla de puntuanción, se muestra en pantalla un mensaje que indica el error.
  
![image](https://github.com/DomeNieto/PROG-UD5_RankingRestaurantes/assets/159430482/b44567ae-af9a-4847-9a8f-e6a9a42e8e37)

---
### Opción 2 - _Editar Restaurante_

Permite al usuario editar la información de un restaurante existente.

![image](https://github.com/DomeNieto/PROG-UD5_RankingRestaurantes/assets/159430482/a41e4503-a13e-498e-bc4f-003fd05adb72)

 Al editar un restaurante, se permite al usuario elegir qué atributo desea modificar y luego ingresar el nuevo valor. 
 
 ![image](https://github.com/DomeNieto/PROG-UD5_RankingRestaurantes/assets/159430482/c8a5d14b-b921-48bf-8e7f-b4d1efa6f518)  ![image](https://github.com/DomeNieto/PROG-UD5_RankingRestaurantes/assets/159430482/7199b4d3-c155-42ea-94de-87f2d74e492a)


 Se realizan validaciones para garantizar que la entrada sea válida.
 
![image](https://github.com/DomeNieto/PROG-UD5_RankingRestaurantes/assets/159430482/1b6bfc9f-a87c-4818-97f6-528d8d00e8ff)

>[!NOTE]
>**Entradas y Validaciones**

- El número seleccionado por el usuario para realizar la operación debe ser cualquiera que se encuentra en la lista de restaurantes mostrados de caso contrario se mostrare un mensaje indicando el error.

  ![image](https://github.com/DomeNieto/PROG-UD5_RankingRestaurantes/assets/159430482/f9e48652-c0cf-4ce8-99be-94823b870788)

- El usuario no puede seleccionar un número que no se encuentre dentro de la lista de datos que se pueden editar, en caso de que se seleccione una opción errónea se mostrará un mensaje indicando el error.

  ![image](https://github.com/DomeNieto/PROG-UD5_RankingRestaurantes/assets/159430482/b0b6e289-0c4f-4cb9-aa78-d0875f81bf8a)

  
- Si el usuario ingresa en el dato puntuación un valor inferior a 0 o mayor que 5, se muestra en pantalla un mensaje que indica el error.
  
  ![image](https://github.com/DomeNieto/PROG-UD5_RankingRestaurantes/assets/159430482/5a78571e-29f0-4a0b-b973-378a05707bfa)
  
- Si el usuario no ingresa ningún cambio, se muestra un mensaje comunicando la acción.

   ![image](https://github.com/DomeNieto/PROG-UD5_RankingRestaurantes/assets/159430482/125d4ab8-7076-46cc-9d1d-09c2c085315c)

---
### Opción 3- _Mostrar Restaurantes_

Muestra una lista de todos los restaurantes registrados en la hostelería, ordenados de forma descente según su ranking; el caso de que no haya ningún restaurante registrado, se indica la situación mediante un mensaje.

  ![image](https://github.com/DomeNieto/PROG-UD5_RankingRestaurantes/assets/159430482/bf1fbc3d-9e4d-466b-8613-b449faa735a8)

---
### Opción 4 - _Eliminar Restaurante_

Permite al usuario eliminar un restaurante de la lista.

![image](https://github.com/DomeNieto/PROG-UD5_RankingRestaurantes/assets/159430482/9a81da28-dd32-4703-8cb7-80271a8f5811)

 Al eliminar un restaurante, se solicita al usuario que ingrese el número del restaurante que desea eliminar. Se realizan validaciones para garantizar que la entrada sea válida.

![image](https://github.com/DomeNieto/PROG-UD5_RankingRestaurantes/assets/159430482/34634c4b-5d5c-459c-b457-8dc270fccb21) ![image](https://github.com/DomeNieto/PROG-UD5_RankingRestaurantes/assets/159430482/b9de4dd6-fa8f-420b-8ef2-29b1ff3f4744)


>[!NOTE]
>**Entradas y Validaciones**

- El número seleccionado por el usuario para realizar la operación debe ser cualquiera que se encuentra en la lista de restaurantes mostrados de caso contrario se mostrare un mensaje indicando el error.

---
### Opción 5 - _Salir del programa_

Muestra un mensaje de despedida y cierra la aplicación.

![image](https://github.com/DomeNieto/PROG-UD5_RankingRestaurantes/assets/159430482/5b6f7c57-ef80-461e-8309-a6a19fc0a7c2)

---
## Consideraciones de Uso

- La aplicación opera en un bucle continuo hasta que el usuario decida salir del programa.
- Todas las operaciones se realizan de manera interactiva a través de la interfaz de usuario.
- Se recomienda seguir las instrucciones proporcionadas en cada ventana emergente para una experiencia fluida de usuario.


[**Volver**](README.md)
