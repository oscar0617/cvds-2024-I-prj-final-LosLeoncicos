# PROYECTO FINAL - CICLO DE VIDA DEL DESARROLLO DE SOFTWARE

# CONDICIONES DE ENTREGA:
## Nombre del proyecto: TopQuoter by Los Leoncicos
_2024-I, CVDS-2024, David Leonardo Piñeros Cortés; Camilo Nicolas Murcia Espinosa; Jeisson Steban Casallas Rozo; Oscar Santiago Lesmes Parra, Ivan Dario Lemus Moya, Roles: Ivan Dario Lemus Moya, Product Owner; Oscar Santiago Lesmes Parra, SCRUM Master; David Leonardo, Camilo Nicolas & Jeisson Steban, Equipo de Desarrollo._

## Descripción del producto.
 - Modulo Privado: Funcionalidad de ingreso por medio de un usuario admin, capacidad de crear cotizaciones nuevas y de actualizar su estado (Creado, En Proceso, Eliminado), capacidad para actualizar los precios de los productos, añadir productos y eliminarlos.
 - Modulo Publico: Funcionalidad de consultar por medio del modelo del vehículo, capacidad de agregar al carrito distintos servicios, visualizar un total del servicio, eliminar elementos del carrito, enviar mensaje al asesor o imprimir un PDF con un resumen.

## Descripción general.
- En la pantalla inicial, encontramos las opciones para filtrar por medio del vehículo del usuario, para observar los servicios disponibles
  ![image](https://github.com/oscar0617/cvds-2024-I-prj-final-LosLeoncicos/assets/111905740/165f0a2d-3f6f-47f6-96a4-e7f39bd01447)
- En nuestro módulo público tenemos los servicios disponibles para agregar a la cotización
  ![image](https://github.com/oscar0617/cvds-2024-I-prj-final-LosLeoncicos/assets/111905740/4cb618d1-f854-4397-9182-2a1a4504b916)
  ![image](https://github.com/oscar0617/cvds-2024-I-prj-final-LosLeoncicos/assets/111905740/06843bf3-5a45-4950-b625-cd81b393a1ed)
- Podemos avanzar para solicitar mayor información o imprimir nuestra cotización en PDF

- Por medio de nuestro módulo privado podemos encontrar la información de las cotizaciones y productos, adicionalmente, podemos actualizar o agregar nuevos registros.
  ![image](https://github.com/oscar0617/cvds-2024-I-prj-final-LosLeoncicos/assets/111905740/32c90dd8-819a-4d02-9e69-88d873e50507)
  ![image](https://github.com/oscar0617/cvds-2024-I-prj-final-LosLeoncicos/assets/111905740/005a8fea-c961-4666-af4d-98af902a4a1a)
  ![image](https://github.com/oscar0617/cvds-2024-I-prj-final-LosLeoncicos/assets/111905740/b5eac764-b216-4b23-bf9a-07c2bc58dba1)

## Arquitectura y Diseño detallado:
 - Modelo E-R.

   ![image](https://github.com/oscar0617/cvds-2024-I-prj-final-LosLeoncicos/assets/111905740/0ccfba1d-7f17-448c-b70c-5b8be4c9ad25)

 - Diagrama de clases.
   
   ![image](https://github.com/oscar0617/cvds-2024-I-prj-final-LosLeoncicos/assets/111905740/789dc511-cb90-4ce7-a592-84896dfa5536)
   ![image](https://github.com/oscar0617/cvds-2024-I-prj-final-LosLeoncicos/assets/147172021/10c9b1d9-dc28-4260-8504-fcc214dd7a65)


 - La arquitectura usada para este proyecto fue JMBC, utilizamos el framework de Spring-Boot, el cual nos permitió ejecutar nuestra aplicacion por medio de nuestro localhost.
 - [Proyecto en Azure DevOps](https://dev.azure.com/ivanlemus0422/cvds-2024-I-los-leoncicos).
 - [Backlog Sprint 2](https://dev.azure.com/ivanlemus0422/cvds-2024-I-los-leoncicos/_sprints/backlog/cvds-2024-I-los-leoncicos%20Team/cvds-2024-I-los-leoncicos/Sprint%202).
 - [Backlog Sprint 3](https://dev.azure.com/ivanlemus0422/cvds-2024-I-los-leoncicos/_sprints/backlog/cvds-2024-I-los-leoncicos%20Team/cvds-2024-I-los-leoncicos/Sprint%203).

## Descripción del proceso:
 - Nuestra metodologia consistió en la división del trabajo priorizando la importancia de cada requisito, asi mismo, buscamos que cada integrante hiciera la funcionalidad donde se sienta más seguro, para asegurar la calidad del producto.
 - Reporte de pruebas y de cubrimiento de las mismas (JUnit test).

![image](https://github.com/oscar0617/cvds-2024-I-prj-final-LosLeoncicos/assets/111905740/a33d4098-b06e-43c3-aeb6-a0c8ec3364c8)

 
### Sprint 2:
  ![image](https://github.com/oscar0617/cvds-2024-I-prj-final-LosLeoncicos/assets/111905740/ebd5d99a-cf02-4108-9431-fcf867c0bb43)

### Sprint 3:
  ![image](https://github.com/oscar0617/cvds-2024-I-prj-final-LosLeoncicos/assets/111905740/944aa6d1-8550-4012-9edb-1a31898d5eb0)

