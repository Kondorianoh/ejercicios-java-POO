# Ejercicio 9. Pedido y Producto

**Objetivo:** Colaboración · referencias · responsabilidades

## Enunciado

Creá un `Pedido` sencillo que represente la compra de una cantidad determinada de un único `Producto`.

El pedido debe consultar el precio del producto asociado y calcular su importe total sin que `Main` realice la multiplicación.

## Requisitos y reglas de negocio

- `Producto` debe almacenar `nombre` y `precio`; un precio negativo se considera `0`.
- `Pedido` debe conservar una referencia al `Producto` y una `cantidad`.
- Si la cantidad recibida es menor que `1`, utilizar `1` como cantidad mínima.
- Calcular el total mediante `total = precio del producto × cantidad`.
- El resumen debe informar nombre, cantidad e importe total.

## Escenario mínimo de prueba

| Elemento | Detalle / resultado esperado |
|---|---|
| **Producto** | Mouse; precio unitario $15.000. |
| **Pedido** | 3 unidades. |
| **Total esperado** | $15.000 × 3 = $45.000. |
| **Prueba adicional** | Crear un pedido con cantidad 0 y verificar que se utilice la cantidad mínima de 1. |

## UML simplificado

```text
Pedido ───────► Producto
          asociación mediante referencia

Pedido
- producto: Producto
- cantidad: int
+ calcularTotal(): double
+ mostrarResumen(): void

Producto
- nombre: String
- precio: double
+ getNombre(): String
+ getPrecio(): double
