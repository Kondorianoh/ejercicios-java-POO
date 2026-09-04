# Ejercicio 14. Sistema de turnos

**Objetivo:** Modelado de varias clases · estados · colaboración

## Enunciado

Construí un sistema básico de turnos en el que un `Paciente` reserva una atención con un `Profesional` en una fecha y hora determinadas.

El `Turno` relaciona ambos objetos y controla su propio estado.

## Requisitos y reglas de negocio

- `Paciente` debe almacenar `nombre` y `documento`.
- `Profesional` debe almacenar `nombre` y `especialidad`.
- `Turno` debe conservar referencias al `Paciente` y al `Profesional`, además de una fecha y hora expresadas como `String`.
- Todo turno comienza en estado `PENDIENTE` y puede pasar a `CONFIRMADO` o `CANCELADO`.
- Un turno `CANCELADO` no puede confirmarse posteriormente.
- La visualización debe incluir fecha, paciente, profesional, especialidad y estado.

## Escenario mínimo de prueba

| Elemento | Detalle / resultado esperado |
|---|---|
| **Paciente** | Ana; documento 30.111.222. |
| **Profesional** | Dra. Pérez; especialidad Clínica. |
| **Turno** | 20/08/2026 a las 15:00; estado inicial PENDIENTE. |
| **Secuencia** | Mostrar el turno, confirmarlo y volver a mostrarlo. El estado final debe ser CONFIRMADO. |
| **Caso alternativo** | Cancelar otro turno e intentar confirmarlo; debe permanecer CANCELADO. |

## UML simplificado

```text
Paciente  ◄────  Turno  ────►  Profesional

Paciente
- nombre: String
- documento: String
+ getNombre(): String

Turno
- paciente: Paciente
- profesional: Profesional
- fechaHora: String
- estado: String
+ confirmar(): void
+ cancelar(): void
+ mostrarDetalle(): void

Profesional
- nombre: String
- especialidad: String
+ getNombre(): String
+ getEspecialidad(): String
