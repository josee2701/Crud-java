# Proyecto CRUD - Notas, Profesores y Estudiantes

Este proyecto es una API REST que permite realizar operaciones CRUD (Crear, Leer, Actualizar y Eliminar) para gestionar Notas, Profesores y Estudiantes.

## Requisitos

Antes de iniciar, asegúrate de cumplir con los siguientes requisitos:

1. **Java**: Versión 11 o superior.
2. **Spring Boot**: Incluido en el proyecto.
3. **Base de datos**: Configuración previa en tu `application.properties` o `application.yml`.
4. **Postman o cualquier herramienta de cliente HTTP** para probar los endpoints.
5. **Frontend** (opcional): Puedes utilizar un cliente que se conecta a `http://localhost:3000`.

## Instalación

1. **Clona este repositorio**:
   ```bash
   git clone https://github.com/josee2701/Crud-java.git
   cd Crud-java
   ```

2. **Configura la base de datos** en el archivo `application.properties`:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/tu_base_de_datos
   spring.datasource.username=tu_usuario
   spring.datasource.password=tu_contraseña
   ```

3. **Compila y ejecuta la aplicación**:
   ```bash
   ./mvnw spring-boot:run
   ```

## Endpoints disponibles

### NotasController

1. **Listar todas las notas**
   - **Método**: `GET`
   - **URL**: `/notas/`

2. **Obtener detalle de una nota**
   - **Método**: `GET`
   - **URL**: `/notas/{id}/`

3. **Crear una nueva nota**
   - **Método**: `POST`
   - **URL**: `/notas/`
   - **Body (JSON)**:
     ```json
     {
         "estudiante": "Nombre Estudiante",
         "profesor": "Nombre Profesor",
         "nota1": 85,
         "description": "Descripción de la nota"
     }
     ```

4. **Actualizar una nota**
   - **Método**: `PUT`
   - **URL**: `/notas/{id}/`
   - **Body (JSON)**:
     ```json
     {
         "estudiante": "Nuevo Estudiante",
         "profesor": "Nuevo Profesor",
         "nota1": 90,
         "description": "Nueva descripción"
     }
     ```

5. **Eliminar una nota**
   - **Método**: `DELETE`
   - **URL**: `/notas/{id}/`

### ProfesoresController

1. **Listar todos los profesores**
   - **Método**: `GET`
   - **URL**: `/profesor/`

2. **Obtener detalle de un profesor**
   - **Método**: `GET`
   - **URL**: `/profesor/{id}`

3. **Crear un nuevo profesor**
   - **Método**: `POST`
   - **URL**: `/profesor/`
   - **Body (JSON)**:
     ```json
     {
         "nombre": "Nombre del Profesor"
     }
     ```

4. **Actualizar un profesor**
   - **Método**: `PUT`
   - **URL**: `/profesor/{id}`
   - **Body (JSON)**:
     ```json
     {
         "nombre": "Nuevo Nombre del Profesor"
     }
     ```

5. **Eliminar un profesor**
   - **Método**: `DELETE`
   - **URL**: `/profesor/{id}`

### EstudiantesController

1. **Listar todos los estudiantes**
   - **Método**: `GET`
   - **URL**: `/estudiantes/`

2. **Obtener detalle de un estudiante**
   - **Método**: `GET`
   - **URL**: `/estudiantes/{id}/`

3. **Crear un nuevo estudiante**
   - **Método**: `POST`
   - **URL**: `/estudiantes/`
   - **Body (JSON)**:
     ```json
     {
         "nombre": "Nombre del Estudiante"
     }
     ```

4. **Actualizar un estudiante**
   - **Método**: `PUT`
   - **URL**: `/estudiantes/{id}/`
   - **Body (JSON)**:
     ```json
     {
         "nombre": "Nuevo Nombre del Estudiante"
     }
     ```

5. **Eliminar un estudiante**
   - **Método**: `DELETE`
   - **URL**: `/estudiantes/{id}/`

## Pruebas con Postman

1. **Importa los endpoints manualmente** en Postman utilizando las rutas descritas anteriormente.
2. **Asegúrate de usar el formato JSON correcto** en el cuerpo de las peticiones POST y PUT.
3. **Observa las respuestas JSON** que indican el estado de la operación.
