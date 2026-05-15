package modelo;

import java.util.ArrayList;
import java.util.List;
import visitor.PersonaVisitor;

public abstract class Persona implements Comparable<Persona> {

    private String codigo;
    private String nombre;
    private String direccion;
    private List<String> telefonos;

    public Persona(String codigo, String nombre, String direccion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefonos = new ArrayList<>();
    }

    public void agregarTelefono(String telefono) {
        if (telefono != null && !telefono.trim().isEmpty()) {
            telefonos.add(telefono);
        }
    }

    public boolean datosCompletos() {
        return codigo != null && !codigo.trim().isEmpty()
                && nombre != null && !nombre.trim().isEmpty()
                && direccion != null && !direccion.trim().isEmpty()
                && telefonos != null && !telefonos.isEmpty();
    }

    @Override
    public int compareTo(Persona otra) {
        return this.codigo.compareTo(otra.getCodigo());
    }

    public abstract void accept(PersonaVisitor visitor);

    public abstract String getTipo();

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public List<String> getTelefonos() {
        return telefonos;
    }

    @Override
    public String toString() {
        return "Tipo: " + getTipo()
                + " | Codigo: " + codigo
                + " | Nombre: " + nombre
                + " | Direccion: " + direccion
                + " | Telefonos: " + telefonos;
    }
}