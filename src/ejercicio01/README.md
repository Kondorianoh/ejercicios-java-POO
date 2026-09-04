# Ejercicio 1. Primer objeto: Persona

**Objetivo:** Clase e instancia · atributos · métodos · creación de objetos

## Enunciado

Desarrollá una aplicación sencilla para representar personas. Cada objeto `Persona` debe conservar su propio nombre y edad y ser responsable de mostrar una presentación y de actualizar su edad cuando cumple años.

El programa principal se utilizará únicamente para crear objetos y ejecutar un escenario de prueba; no debe modificar directamente la edad de una persona.

## Requisitos y reglas de negocio

- Definir la clase `Persona` con los atributos `nombre` (`String`) y `edad` (`int`).
- Inicializar ambos datos al crear cada persona.
- El método `presentarse()` debe informar el nombre y la edad actual del objeto.
- El método `cumplirAnios()` debe aumentar la edad exactamente en una unidad.
- Crear cada clase pública en su archivo correspondiente y utilizar `Main.java` solamente para probar el comportamiento.

## Escenario mínimo de prueba

| Elemento | Detalle / resultado esperado |
|---|---|
| **Datos iniciales** | Ana, 20 años; Luis, 25 años. |
| **Acciones** | Presentar a ambas personas; luego hacer que Ana cumpla años y volver a presentarla. |
| **Comprobación** | Ana debe informar 21 años después del cambio. Luis debe conservar sus 25 años. |

## UML simplificado

```text
Persona
- nombre: String
- edad: int
+ presentarse(): void
+ cumplirAnios(): void
