## Autor

Daniel Isaias Roman Lozano 
20241020126
Ingenieria de Sistemas  
Universidad Distrital Francisco Jose de Caldas

# Sistema Iterator Visitor

Aplicacion Java desarrollada en NetBeans que implementa los patrones de diseno **Iterator** y **Visitor** para recorrer y validar personas dentro de diferentes estructuras de datos.

## Descripcion del problema

De acuerdo con el escenario propuesto en clase, se requiere manejar datos de personas, especificamente estudiantes y docentes. Cada persona cuenta con codigo, nombre, direccion y una lista de telefonos.

El sistema debe permitir:

- Registrar estudiantes y docentes.
- Guardar las personas en una coleccion basada en ArrayList.
- Guardar las personas en una coleccion basada en TreeSet.
- Recorrer ambas colecciones usando el patron Iterator.
- Validar si los datos estan completos usando el patron Visitor.
- Enviar notificaciones cuando una persona tenga datos incompletos o cuando un docente tenga un codigo invalido.

## Patrones de diseño aplicados

### Patron Iterator

El patron Iterator se aplica para recorrer diferentes colecciones sin exponer su estructura interna.

En este proyecto se implementan dos recorridos:

- Recorrido sobre `ArrayList`.
- Recorrido sobre `TreeSet`.

Clases principales del patron Iterator:

```text
IteratorPersona
ArrayListPersonaIterator
TreeSetPersonaIterator
ColeccionPersonas
ColeccionArrayListPersonas
ColeccionTreeSetPersonas


