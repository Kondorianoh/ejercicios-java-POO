# Ejercicio 8. Auto compuesto por un Motor

**Objetivo:** Composición · delegación · responsabilidad

## Enunciado

Modelá un `Auto` compuesto por un `Motor`. El motor conoce su cilindrada y su estado de encendido. El auto ofrece las acciones de encender y apagar, pero debe delegar esas acciones en su motor en lugar de alterar directamente su estado.

## Requisitos y reglas de negocio

- `Motor` debe almacenar `cilindrada` y un indicador de `encendido`; todo motor comienza apagado.
- `Motor` es responsable de encenderse, apagarse e informar su estado.
- `Auto` debe almacenar `marca`, `modelo` y un `Motor`.
- El `Motor` debe crearse como parte de la construcción del `Auto`; esta decisión representa composición.
- `Auto` debe delegar las operaciones de encendido y apagado y poder mostrar su estado general.

## Escenario mínimo de prueba

| Elemento | Detalle / resultado esperado |
|---|---|
| **Auto** | Toyota Corolla con motor de 1.800 cm³. |
| **Estado inicial** | Motor apagado. |
| **Secuencia** | Mostrar estado; encender; volver a mostrar; apagar. |
| **Comprobación** | Los cambios deben producirse mediante las operaciones del `Motor`. |

## UML simplificado

```text
Auto  ◆────  1 Motor
      composición

Auto
- marca: String
- modelo: String
- motor: Motor
+ encender(): void
+ apagar(): void
+ mostrarEstado(): void

Motor
- cilindrada: int
- encendido: boolean
+ encender(): void
+ apagar(): void
+ estaEncendido(): boolean
