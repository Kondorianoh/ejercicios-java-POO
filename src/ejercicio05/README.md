# Ejercicio 5. Alumno y promedio

**Objetivo:** Reglas de negocio · métodos de consulta · estado

## Enunciado

Modelá un alumno con sus datos identificatorios y tres calificaciones. El propio objeto debe validar las notas, calcular el promedio aritmético y determinar la condición de aprobación.

## Requisitos y reglas de negocio

- Almacenar `nombre`, `legajo` y tres notas de tipo `double`.
- Considerar válidas solamente las notas comprendidas entre `0` y `10`, inclusive.
- Una nota fuera de ese rango se reemplaza por `0`.
- Calcular el promedio como `(nota1 + nota2 + nota3) ÷ 3`.
- El alumno está aprobado cuando su promedio es mayor o igual que `6`.
- La regla de aprobación debe consultar el promedio calculado por el propio objeto.

## Escenario mínimo de prueba

| Elemento | Detalle / resultado esperado |
|---|---|
| **Alumno** | Lucía; legajo A100; notas 8, 6 y 7. |
| **Promedio esperado** | (8 + 6 + 7) ÷ 3 = 7. |
| **Condición esperada** | Aprobada, porque 7 ≥ 6. |
| **Prueba de validación** | Crear otro alumno con una nota fuera del rango y comprobar que esa nota sea considerada 0. |

## UML simplificado

```text
Alumno
- nombre: String
- legajo: String
- nota1: double
- nota2: double
- nota3: double
+ calcularPromedio(): double
+ estaAprobado(): boolean
