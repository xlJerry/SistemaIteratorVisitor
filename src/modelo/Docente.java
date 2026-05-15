package modelo;

import visitor.PersonaVisitor;

public class Docente extends Persona {

    public Docente(String codigo, String nombre, String direccion) {
        super(codigo, nombre, direccion);
    }

    @Override
    public void accept(PersonaVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getTipo() {
        return "Docente";
    }
}