package visitor;

import modelo.Docente;
import modelo.Estudiante;

public class NotificacionVisitor implements PersonaVisitor {

    @Override
    public void visit(Estudiante estudiante) {
        if (!estudiante.datosCompletos()) {
            System.out.println("Notificacion enviada al estudiante "
                    + estudiante.getNombre()
                    + ": debe completar sus datos.");
        }
    }

    @Override
    public void visit(Docente docente) {
        if (!docente.datosCompletos()) {
            System.out.println("Notificacion enviada al docente "
                    + docente.getNombre()
                    + ": debe completar sus datos.");
        } else if (docente.getCodigo().length() > 4) {
            System.out.println("Notificacion enviada al docente "
                    + docente.getNombre()
                    + ": el codigo debe tener maximo 4 digitos.");
        }
    }
}