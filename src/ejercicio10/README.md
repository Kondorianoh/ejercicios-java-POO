# Ejercicio 10. Empleado y recibo simplificado

**Objetivo:** Reglas de negocio · constantes · métodos

## Enunciado

Modelá un `Empleado` que calcule su remuneración total a partir de un sueldo básico y una cantidad de horas extra.

El valor de cada hora extra es una regla común y fija del sistema.

## Requisitos y reglas de negocio

- Almacenar `nombre`, `legajo`, `sueldoBasico` y `horasExtra`.
- Utilizar `$5.000` como valor fijo de cada hora extra.
- Un sueldo básico o una cantidad de horas extra negativos deben considerarse `0`.
- Calcular el sueldo total mediante la fórmula:
  `sueldo total = sueldo básico + (horas extra × valor por hora extra)`.
- La constante y el cálculo deben pertenecer a `Empleado`.

## Escenario mínimo de prueba

| Elemento | Detalle / resultado esperado |
|---|---|
| **Empleado** | Martín; legajo E10; sueldo básico $800.000; 6 horas extra. |
| **Adicional** | 6 × $5.000 = $30.000. |
| **Sueldo total esperado** | $800.000 + $30.000 = $830.000. |

## UML simplificado

```text
Empleado
- nombre: String
- legajo: String
- sueldoBasico: double
- horasExtra: int
- VALOR_HORA_EXTRA: double = 5000
+ calcularSueldoTotal(): double
