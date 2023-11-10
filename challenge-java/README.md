# Challenge Técnico

## Descripción del Proyecto

El proyecto en cuestion Expone tres servicios REST Full que permiten realizar consultas al mismo.
Estos son:
    .GetAll: devuelve todos los manufacturers que se encuentran en la API otorgada para este challenge.
    .GetByCountry: devuelve todos los manufacturers del pais seleccionado.
    .getMfrsByVehicleName que permite recuperar todos los manufacturers con todos sus vehiculos que tengan un vehiculo especifico en su listado.

## Requisitos Previos

Asegúrese de tener instalado Java y Maven en su sistema antes de ejecutar este proyecto.

- [Java](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Maven](https://maven.apache.org/download.cgi)

## Configuración del Proyecto

1. **Clonar el Repositorio:**
   ```bash
   git clone https://gitlab.com/leandrodelgado/evaluacion-tecnica.git
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

   La aplicación estará disponible en `http://localhost:8080`.

2. **Endpoints Disponibles:**
    - `/api/evaluacion-tecnica/country?format={format}&country={country}`: Donde:
        - `format`: Permite seleccionar el formato de la respuesta, ya sea en json o xml. Es obligatorio.
        - `country`: Valor que permite filtrar los manufactures por país (campo Country).
    - `/api/evaluacion-tecnica/name?format={format}&name={name}`: Donde:
        - `format`: Permite seleccionar el formato de la respuesta, ya sea en json o xml. Es obligatorio.
        - `name`: Valor que permite filtrar los manufactures por nombre (campo Mfr_Name).

## Estructura del Proyecto

La estructura del proyecto sigue las convenciones de un proyecto Spring Boot:

- `src/main/java`: Contiene el código fuente de la aplicación.
    - `com.evaluacion.tecnica`: Paquete principal.
        - `configuration`: Configuraciones de la aplicación.
        - `controller`: Controladores de los endpoints.
        - `dto`: Modelos comunes utilizado como respuestas en los servicios propios.
            - `client`: Modelos comunes utilizados como respuestas en los servicios del endpoint externo.
        - `entity`: Entidades que representan tablas sobre H2.
        - `repository`: Repositorio de JPA.
        - `service`: Interface donde se declaran los métodos que llevarán a cabo la lógica de negocio.
        - `service.impl`: Implementación de los métodos que llevarán a cabo la lógica de negocio.
- `src/test/java`: Contiene las pruebas unitarias.
    - `com.evaluacion.tecnica`: Paquete de pruebas.


## Pruebas Unitarias

Se han incluido pruebas unitarias para garantizar la integridad y el correcto funcionamiento de las funciones clave del proyecto. Para ejecutar las pruebas, utilice el siguiente comando:

```bash
mvn test
```

## Swagger

El proyecto se encuentra documentado utilizando Swagger. Para acceder a la documentación del mismo con la posibilidad de efectura pruebas de invocaciones ingrese a:
http://localhost:8080/swagger-ui/index.html

## Tecnologías Principales Utilizadas

- [Spring Boot](https://spring.io/projects/spring-boot): Framework para el desarrollo de aplicaciones Java basadas en el principio de convención sobre configuración.
- [ModelMapper](https://modelmapper.org/): Permite el mapeo entre entidades y DTO de forma automática.
- [H2 Database](https://www.h2database.com/): Base de datos embebida escrita en Java.

## Licencia

Este proyecto está bajo la licencia [MIT](LICENSE).
