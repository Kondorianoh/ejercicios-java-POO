# Ejercicio 2. Rectángulo con comportamiento

**Objetivo:** Estado y comportamiento · métodos con retorno · responsabilidad del objeto

## Enunciado

Modelá un rectángulo que conozca su base y su altura y que sea responsable de realizar sus propios cálculos geométricos.

El programa principal debe limitarse a crear el rectángulo y mostrar los valores obtenidos.

## Requisitos y reglas de negocio

- Definir la clase `Rectangulo` con `base` y `altura` de tipo `double`.
- Calcular el área mediante la relación `área = base × altura`.
- Calcular el perímetro mediante la relación `perímetro = 2 × (base + altura)`.
- Los cálculos deben realizarse dentro de `Rectangulo` y devolver un resultado; `Main` no debe repetir las fórmulas.

## Escenario mínimo de prueba

| Elemento | Detalle / resultado esperado |
|---|---|
| **Datos** | Base = 5 y altura = 3. |
| **Resultados esperados** | Área = 15; perímetro = 16. |
| **Prueba adicional** | Crear al menos otro rectángulo con medidas distintas y verificar ambos cálculos. |

## UML simplificado

```text
Rectangulo
- base: double
- altura: double
+ calcularArea(): double
+ calcularPerimetro(): double
