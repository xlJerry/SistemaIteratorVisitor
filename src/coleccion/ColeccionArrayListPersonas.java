package coleccion;

import java.util.ArrayList;
import iterator.ArrayListPersonaIterator;
import iterator.IteratorPersona;
import modelo.Persona;

public class ColeccionArrayListPersonas implements ColeccionPersonas {

    private ArrayList<Persona> personas;

    public ColeccionArrayListPersonas() {
        this.personas = new ArrayList<>();
    }

    @Override
    public void agregar(Persona persona) {
        personas.add(persona);
    }

    @Override
    public IteratorPersona crearIterator() {
        return new ArrayListPersonaIterator(personas);
    }
}