# Ejercicio 12. Carrito de compras

**Objetivo:** Composición · colecciones · objetos colaboradores

## Enunciado

Desarrollá un `CarritoCompras` que agrupe distintos productos y sus cantidades.

Para representar cada renglón de compra, utilizá un `ItemCarrito` que relacione un `Producto` con la cantidad seleccionada.

## Requisitos y reglas de negocio

- `Producto` debe almacenar `nombre` y `precio`; un precio negativo se reemplaza por `0`.
- `ItemCarrito` debe relacionar un `Producto` con una cantidad mínima de `1` y calcular `precio × cantidad`.
- `CarritoCompras` debe conservar sus ítems en una colección `ArrayList`.
- El total del carrito es la suma de todos los subtotales; la suma corresponde al carrito y no a `Main`.
- El detalle debe informar cada producto, cantidad y subtotal, seguido del total general.

## Escenario mínimo de prueba

| Elemento | Detalle / resultado esperado |
|---|---|
| **Ítem 1** | Teclado: $25.000 × 1 = $25.000. |
| **Ítem 2** | Mouse: $15.000 × 2 = $30.000. |
| **Total esperado** | $25.000 + $30.000 = $55.000. |
| **Validación** | Una cantidad 0 o negativa debe convertirse en la cantidad mínima de 1. |

## UML simplificado

```text
CarritoCompras  ◆──  0..* ItemCarrito  ──►  Producto

CarritoCompras
- items: ArrayList<ItemCarrito>
+ agregarItem(ItemCarrito): void
+ calcularTotal(): double
+ mostrarDetalle(): void

ItemCarrito
- producto: Producto
- cantidad: int
+ calcularSubtotal(): double
+ mostrar(): void

Producto
- nombre: String
- precio: double
+ getNombre(): String
+ getPrecio(): double
