# Descripcion



Los servicio construidos son:

* [Listas tareas](http://localhost:8080/api/list)
* [Agregar Tarea](http://localhost:8080/api/add)
* [Editar Tarea](http://localhost:8080/api/edit)
* [Eliminar Tarea](http://localhost:8080/api/delete)

Request de ejemplo para cada servicio:

	Listas tareas:
{}

	Agregar Tarea:
	
{
	"descripcion":"primera tarea",
	"fechaCreacion":"2021-08-31T18:25:43",
	"vigente":true
}

	Editar Tarea:
{
    "id":"1",
	"descripcion":"Tarea Editanda",
	"fechaCreacion":"2021-08-31T18:25:43",
	"vigente":true
}

	Eliminar Tarea:
{
    "id":"2"
}

Se implementa swagger:

* [swagger-ui](http://localhost:8080/swagger-ui.html#/controller)

Se implementa Base de Datos H2:

* [h2-console](http://localhost:8080/h2-console/)

### Instrucciones de despliege

Para desplegar el proyecto solo se necesita dar start al proyecto en el Boot Dashboard,
con esto se iniciara la BD M2 a la cual se puede acceder a travez de la URL indicada mas arriba (usuario "sa" sin password)
no se incluye script de BD ya que la tabla se crea a partir de la entidad "TAREA" al iniciar la BD, Los id de las tareas son auto generados.

