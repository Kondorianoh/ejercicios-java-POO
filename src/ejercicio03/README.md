# Ejercicio 3. Cuenta bancaria protegida

**Objetivo:** Encapsulamiento · validaciones · estado consistente

## Enunciado

Construí una clase `CuentaBancaria` que administre un titular y su saldo. El saldo debe permanecer protegido: solamente podrá cambiar mediante operaciones válidas de depósito o extracción.

## Requisitos y reglas de negocio

- Definir `titular` (`String`) y `saldo` (`double`) como estado interno de la cuenta.
- Si el saldo inicial es negativo, la cuenta debe comenzar con saldo `0`.
- Aceptar depósitos únicamente cuando el monto sea mayor que `0`.
- Aceptar extracciones únicamente cuando el monto sea mayor que `0` y no supere el saldo disponible.
- `depositar()` y `extraer()` deben informar si la operación fue aceptada.
- `consultarSaldo()` debe devolver el saldo actual.

## Escenario mínimo de prueba

| Elemento | Detalle / resultado esperado |
|---|---|
| **Cuenta inicial** | Titular: Ana; saldo inicial: $10.000. |
| **Depósito** | Depositar $2.500. El saldo pasa a $12.500. |
| **Extracción rechazada** | Intentar retirar $20.000. La operación debe rechazarse y el saldo no debe cambiar. |
| **Extracción válida** | Retirar $3.000. Saldo final esperado: $9.500. |

## UML simplificado

```text
CuentaBancaria
- titular: String
- saldo: double
+ depositar(double): boolean
+ extraer(double): boolean
+ consultarSaldo(): double
