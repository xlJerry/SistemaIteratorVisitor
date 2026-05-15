package iterator;

import java.util.Iterator;
import java.util.TreeSet;
import modelo.Persona;

public class TreeSetPersonaIterator implements IteratorPersona {

    private Iterator<Persona> iteradorInterno;

    public TreeSetPersonaIterator(TreeSet<Persona> personas) {
        this.iteradorInterno = personas.iterator();
    }

    @Override
    public boolean hasNext() {
        return iteradorInterno.hasNext();
    }

    @Override
    public Persona next() {
        return iteradorInterno.next();
    }
}