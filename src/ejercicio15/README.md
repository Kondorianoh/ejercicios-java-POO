# Ejercicio 15. Proyecto integrador: estacionamiento

**Objetivo:** Diseño de clases · encapsulamiento · colecciones · composición y colaboración

## Enunciado

Desarrollá un sistema de `Estacionamiento` que administre los vehículos actualmente estacionados.

Cada ingreso genera un `TicketEstacionamiento`; el egreso registra una cantidad de horas simulada, calcula el importe y retira el ticket de la colección activa.

## Requisitos y reglas de negocio

- `Vehiculo` debe almacenar `patente` y `modelo`.
- `TicketEstacionamiento` debe relacionar un vehículo con sus horas; las horas solamente se aceptan cuando son mayores que `0`.
- `Estacionamiento` debe mantener una colección `ArrayList` de tickets activos y utilizar una tarifa fija de `$2.500` por hora.
- Rechazar el ingreso si ya existe un ticket activo para la misma patente, sin distinguir mayúsculas de minúsculas.
- Para el egreso, localizar el ticket por patente, validar las horas y calcular el importe mediante:
  `importe = horas × tarifa`.
- Si el egreso es válido, retirar el ticket activo.
- Si no existe la patente o las horas son inválidas, informar el error sin modificar la colección.

## Escenario mínimo de prueba

| Elemento | Detalle / resultado esperado |
|---|---|
| **Vehículo** | Patente AA123BB; modelo Toyota Corolla. |
| **Ingreso** | El primer ingreso debe aceptarse; un segundo ingreso de la misma patente debe rechazarse. |
| **Egreso** | Registrar 3 horas para AA123BB. |
| **Importe esperado** | 3 × $2.500 = $7.500. |
| **Comprobación** | Después del egreso, la patente ya no debe figurar entre los tickets activos. |

## UML simplificado

```text
Estacionamiento  ◆──  0..* TicketEstacionamiento  ──►  Vehiculo

Estacionamiento
- tickets: ArrayList<TicketEstacionamiento>
- TARIFA_HORA: double = 2500
+ registrarIngreso(Vehiculo): boolean
+ registrarEgreso(String, int): double

TicketEstacionamiento
- vehiculo: Vehiculo
- horas: int
+ setHoras(int): void
+ getVehiculo(): Vehiculo
+ getHoras(): int

Vehiculo
- patente: String
- modelo: String
+ getPatente(): String
+ getModelo(): String
