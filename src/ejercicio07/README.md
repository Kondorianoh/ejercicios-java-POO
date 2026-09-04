# Ejercicio 7. Libro y autor

**Objetivo:** Relación entre objetos · referencias · colaboración

## Enunciado

Representá libros y autores como objetos distintos. Cada `Libro` debe conservar una referencia al `Autor` que lo escribió y utilizarla al mostrar su ficha bibliográfica.

## Requisitos y reglas de negocio

- `Autor` debe almacenar `nombre` y `nacionalidad`.
- `Libro` debe almacenar `titulo`, `isbn`, `paginas` y una referencia a `Autor`.
- Crear primero el autor y luego asociarlo al libro al construirlo.
- La ficha debe incluir título, ISBN, nombre y nacionalidad del autor, y cantidad de páginas.
- `Libro` no debe duplicar los datos internos de `Autor`.

## Escenario mínimo de prueba

| Elemento | Detalle / resultado esperado |
|---|---|
| **Autor** | Julio Cortázar; nacionalidad argentina. |
| **Libro** | Rayuela; ISBN 978-0001; 600 páginas. |
| **Comprobación** | La ficha debe recuperar los datos del autor a través de la referencia asociada. |

## UML simplificado

```text
Libro ───────► Autor
        asociación: cada libro conoce a un autor

Libro
- titulo: String
- isbn: String
- paginas: int
- autor: Autor
+ mostrarFicha(): void
Autor
- nombre: String
- nacionalidad: String
+ getNombre(): String
+ getNacionalidad(): String
