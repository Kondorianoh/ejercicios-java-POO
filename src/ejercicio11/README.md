# Ejercicio 11. Biblioteca con colección de libros

**Objetivo:** ArrayList · colecciones de objetos · búsqueda · colaboración

## Enunciado

Construí una `Biblioteca` capaz de administrar una cantidad variable de objetos `Libro`.

La colección debe permitir incorporar libros, mostrar el catálogo y localizar un ejemplar mediante su ISBN.

## Requisitos y reglas de negocio

- `Libro` debe almacenar `titulo` e `isbn`.
- `Biblioteca` debe conservar los libros en una colección `ArrayList`.
- Agregar libros sin exponer la colección para que sea modificada directamente desde `Main`.
- Listar el título y el ISBN de todos los libros en el orden en que fueron agregados.
- Buscar por ISBN recorriendo la colección e informar claramente si no existe coincidencia.

## Escenario mínimo de prueba

| Elemento | Detalle / resultado esperado |
|---|---|
| **Libros** | Clean Code, ISBN 111; Effective Java, ISBN 222. |
| **Listado** | Deben aparecer ambos libros con su título e ISBN. |
| **Búsqueda** | Buscar ISBN 222. El libro encontrado debe ser Effective Java. |
| **Caso sin resultado** | Buscar un ISBN inexistente y comprobar que el programa lo gestione sin errores. |

## UML simplificado

```text
Biblioteca  ◇────  0..* Libro
             agregación / colección

Biblioteca
- libros: ArrayList<Libro>
+ agregarLibro(Libro): void
+ buscarPorIsbn(String): Libro
+ listarLibros(): void

Libro
- titulo: String
- isbn: String
+ getTitulo(): String
+ getIsbn(): String
