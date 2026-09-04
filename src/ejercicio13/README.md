# Ejercicio 13. Curso y estudiantes

**Objetivo:** Colecciones · reglas de negocio · colaboración

## Enunciado

Modelá un `Curso` que administre sus inscripciones.

El curso posee un cupo máximo y una colección de alumnos; debe impedir tanto el exceso de cupo como la inscripción repetida de un mismo legajo.

## Requisitos y reglas de negocio

- `Alumno` debe almacenar `nombre` y `legajo`.
- `Curso` debe almacenar `codigo`, `nombre`, `cupoMaximo` y una colección `ArrayList` de alumnos.
- El cupo mínimo permitido es `1`, aunque se reciba un valor menor.
- Aceptar una inscripción solamente si todavía hay lugar y el legajo no está registrado.
- Informar si la inscripción fue aceptada.
- Calcular lugares disponibles mediante:
  `lugares disponibles = cupo máximo − cantidad de inscriptos`.

## Escenario mínimo de prueba

| Elemento | Detalle / resultado esperado |
|---|---|
| **Curso** | POO1; Programación Orientada a Objetos; cupo máximo 2. |
| **Inscripciones aceptadas** | Ana, legajo A1; Luis, legajo A2. |
| **Inscripción rechazada** | Eva, legajo A3, porque el cupo ya está completo. |
| **Resultado** | Lugares disponibles: 0. También debe rechazarse cualquier legajo duplicado. |

## UML simplificado

```text
Curso  ◇────  0..* Alumno
        agregación / inscripciones

Curso
- codigo: String
- nombre: String
- cupoMaximo: int
- alumnos: ArrayList<Alumno>
+ inscribir(Alumno): boolean
+ lugaresDisponibles(): int

Alumno
- nombre: String
- legajo: String
+ getNombre(): String
+ getLegajo(): String
