# Challenge Técnico

## Descripción del Proyecto

El proyecto en cuestion Expone tres servicios REST Full que permiten realizar consultas al mismo.
Estos son:
    .GetAll: devuelve todos los manufacturers que se encuentran en la API otorgada para este challenge.
    .GetByCountry: devuelve todos los manufacturers del pais seleccionado.   
    .GetMfrsByVehicleName que permite recuperar todos los manufacturers con todos sus vehiculos que tengan un vehiculo especifico en su listado.
Para cumplir con la lógica solicitada de consumir solamente una única vez el servicio de la API otorgada, lo que se hizo fue seguir el patrón de diseño Singleton.
Este consta de una unica instancia de una Clase donde se almacenarán los datos del endpoint consumido.

La aplicación estará disponible en `http://localhost:3000`

## Configuración del Proyecto

1. **Clonar el Repositorio:**
   ```bash
   git clone https://github.com/nicosebey/tecnichal-challenge.git
   ```

2. **Compilar el Proyecto:**
   ```bash
   mvn clean install
   ```

## Ejecución del Proyecto

1. **Ejecutar la Aplicación:**
   ```bash
   mvn spring-boot:run
   ```


2. **Endpoints Disponibles:**
    - Los endpoints disponibles quedan visibles en http://localhost:3000/swagger-ui/index.html

## Estructura del Proyecto


- `src/main/java`: Código fuente de la aplicación.
    - `com.example.challenge`: Paquete principal.
        - `config`: Configuraciones de la aplicación.
        - `controller`: Controladores de los endpoints.
        - `dto`: Modelado de las respuestas de los servicios.
        - `services`: Interface con la lógica de negocio.
- `src/test/java`: Contiene las pruebas unitarias.

## Licencia

Este proyecto está bajo la licencia [MIT](LICENSE).
