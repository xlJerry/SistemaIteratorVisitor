package iterator;

import java.util.ArrayList;
import modelo.Persona;

public class ArrayListPersonaIterator implements IteratorPersona {

    private ArrayList<Persona> personas;
    private int posicion;

    public ArrayListPersonaIterator(ArrayList<Persona> personas) {
        this.personas = personas;
        this.posicion = 0;
    }

    @Override
    public boolean hasNext() {
        return posicion < personas.size();
    }

    @Override
    public Persona next() {
        Persona persona = personas.get(posicion);
        posicion++;
        return persona;
    }
}