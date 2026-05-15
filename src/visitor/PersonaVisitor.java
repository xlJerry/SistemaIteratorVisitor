package visitor;

import modelo.Estudiante;
import modelo.Docente;

public interface PersonaVisitor {

    void visit(Estudiante estudiante);

    void visit(Docente docente);
}