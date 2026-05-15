package coleccion;

import iterator.IteratorPersona;
import modelo.Persona;

public interface ColeccionPersonas {

    void agregar(Persona persona);

    IteratorPersona crearIterator();
}