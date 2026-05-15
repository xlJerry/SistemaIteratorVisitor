package coleccion;

import java.util.TreeSet;
import iterator.IteratorPersona;
import iterator.TreeSetPersonaIterator;
import modelo.Persona;

public class ColeccionTreeSetPersonas implements ColeccionPersonas {

    private TreeSet<Persona> personas;

    public ColeccionTreeSetPersonas() {
        this.personas = new TreeSet<>();
    }

    @Override
    public void agregar(Persona persona) {
        personas.add(persona);
    }

    @Override
    public IteratorPersona crearIterator() {
        return new TreeSetPersonaIterator(personas);
    }
}