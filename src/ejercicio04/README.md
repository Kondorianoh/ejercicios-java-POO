# Ejercicio 4. Producto y control de stock

**Objetivo:** Encapsulamiento · validación · métodos con parámetros

## Enunciado

Desarrollá una clase `Producto` que represente un artículo comercial y controle su precio y existencias. Las ventas y los ingresos de mercadería deben modificar el stock de manera segura.

## Requisitos y reglas de negocio

- Almacenar `codigo`, `nombre`, `precio` y `stock`.
- Si el precio o el stock inicial son negativos, inicializarlos en `0`.
- `ingresarStock()` debe aceptar únicamente cantidades mayores que `0`.
- `vender()` debe aceptar una cantidad mayor que `0` y menor o igual al stock disponible.
- Cada operación debe informar si pudo realizarse.
- Agregar una operación que muestre código, nombre, precio y stock actual.

## Escenario mínimo de prueba

| Elemento | Detalle / resultado esperado |
|---|---|
| **Producto inicial** | Código P01; Teclado; precio $25.000; stock 10 unidades. |
| **Venta** | Vender 2 unidades. El stock queda en 8. |
| **Ingreso** | Agregar 5 unidades. Stock final esperado: 13. |
| **Control** | Intentar vender más unidades que las disponibles y comprobar que el stock no cambie. |

## UML simplificado

```text
Producto
- codigo: String
- nombre: String
- precio: double
- stock: int
+ ingresarStock(int): boolean
+ vender(int): boolean
+ mostrarInformacion(): void
