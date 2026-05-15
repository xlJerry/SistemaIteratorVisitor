package app;

import coleccion.ColeccionArrayListPersonas;
import coleccion.ColeccionPersonas;
import coleccion.ColeccionTreeSetPersonas;
import iterator.IteratorPersona;
import modelo.Docente;
import modelo.Estudiante;
import modelo.Persona;
import visitor.NotificacionVisitor;
import visitor.ValidacionVisitor;

public class Main {

    public static void main(String[] args) {

        // ==============================
        // Crear personas de prueba
        // ==============================

        Estudiante daniel = new Estudiante("20241020126", "Daniel Roman", "Bogota");
        daniel.agregarTelefono("3001234567");

        Estudiante ana = new Estudiante("20241020120", "Ana Gomez", "");
        ana.agregarTelefono("3119876543");

        Docente carlos = new Docente("1234", "Carlos Perez", "Bogota");
        carlos.agregarTelefono("3205555555");

        Docente maria = new Docente("987654", "Maria Lopez", "Medellin");
        maria.agregarTelefono("3152222222");

        Estudiante luis = new Estudiante("20241020130", "Luis Martinez", "Cali");
        // Luis no tiene telefono para probar la validacion de datos incompletos.

        // ==============================
        // Crear colecciones
        // ==============================

        ColeccionPersonas coleccionArrayList = new ColeccionArrayListPersonas();
        ColeccionPersonas coleccionTreeSet = new ColeccionTreeSetPersonas();

        // Agregar personas a la coleccion ArrayList
        coleccionArrayList.agregar(daniel);
        coleccionArrayList.agregar(ana);
        coleccionArrayList.agregar(carlos);
        coleccionArrayList.agregar(maria);
        coleccionArrayList.agregar(luis);

        // Agregar personas a la coleccion TreeSet
        coleccionTreeSet.agregar(daniel);
        coleccionTreeSet.agregar(ana);
        coleccionTreeSet.agregar(carlos);
        coleccionTreeSet.agregar(maria);
        coleccionTreeSet.agregar(luis);

        // ==============================
        // Recorridos con Iterator
        // ==============================

        mostrarRecorrido("RECORRIDO CON ARRAYLIST", coleccionArrayList);
        mostrarRecorrido("RECORRIDO CON TREESET", coleccionTreeSet);

        // ==============================
        // Aplicacion del patron Visitor
        // ==============================

        ValidacionVisitor validacionVisitor = new ValidacionVisitor();
        NotificacionVisitor notificacionVisitor = new NotificacionVisitor();

        IteratorPersona iteradorValidacion = coleccionArrayList.crearIterator();

        while (iteradorValidacion.hasNext()) {
            Persona persona = iteradorValidacion.next();
            persona.accept(validacionVisitor);
        }

        validacionVisitor.mostrarResultado();

        System.out.println("=== NOTIFICACIONES ===");

        IteratorPersona iteradorNotificacion = coleccionArrayList.crearIterator();

        while (iteradorNotificacion.hasNext()) {
            Persona persona = iteradorNotificacion.next();
            persona.accept(notificacionVisitor);
        }
    }

    public static void mostrarRecorrido(String titulo, ColeccionPersonas coleccion) {
        System.out.println("=== " + titulo + " ===");

        IteratorPersona iterador = coleccion.crearIterator();

        while (iterador.hasNext()) {
            Persona persona = iterador.next();
            System.out.println(persona);
        }

        System.out.println();
    }
}