# Ejercicio 6. Termómetro

**Objetivo:** Métodos derivados · inmutabilidad parcial · cálculos dentro del objeto

## Enunciado

Creá un `Termometro` que almacene una temperatura en grados Celsius. A partir de ese único estado deberá ofrecer consultas en Celsius, Fahrenheit y Kelvin sin alterar la temperatura original.

## Requisitos y reglas de negocio

- Almacenar la temperatura `celsius` como `double`.
- Convertir a Fahrenheit con la fórmula `F = C × 9 ÷ 5 + 32`.
- Convertir a Kelvin con la fórmula `K = C + 273,15`.
- Las conversiones deben devolver los valores calculados y no modificar el dato Celsius.

## Escenario mínimo de prueba

| Elemento | Detalle / resultado esperado |
|---|---|
| **Temperatura inicial** | 25 °C. |
| **Fahrenheit esperado** | 25 × 9 ÷ 5 + 32 = 77 °F. |
| **Kelvin esperado** | 25 + 273,15 = 298,15 K. |
| **Comprobación** | Después de ambas conversiones, la temperatura almacenada debe seguir siendo 25 °C. |

## UML simplificado

```text
Termometro
- celsius: double
+ getCelsius(): double
+ convertirAFahrenheit(): double
+ convertirAKelvin(): double
