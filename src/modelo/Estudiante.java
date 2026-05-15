package modelo;

import visitor.PersonaVisitor;

public class Estudiante extends Persona {

    public Estudiante(String codigo, String nombre, String direccion) {
        super(codigo, nombre, direccion);
    }

    @Override
    public void accept(PersonaVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getTipo() {
        return "Estudiante";
    }
}