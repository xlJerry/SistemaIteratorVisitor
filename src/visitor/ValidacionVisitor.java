package visitor;

import java.util.ArrayList;
import java.util.List;
import modelo.Docente;
import modelo.Estudiante;

public class ValidacionVisitor implements PersonaVisitor {

    private List<String> resultados;

    public ValidacionVisitor() {
        this.resultados = new ArrayList<>();
    }

    @Override
    public void visit(Estudiante estudiante) {
        if (!estudiante.datosCompletos()) {
            resultados.add("El estudiante " + estudiante.getNombre() + " tiene datos incompletos.");
        } else {
            resultados.add("El estudiante " + estudiante.getNombre() + " tiene los datos completos.");
        }
    }

    @Override
    public void visit(Docente docente) {
        if (!docente.datosCompletos()) {
            resultados.add("El docente " + docente.getNombre() + " tiene datos incompletos.");
        } else if (docente.getCodigo().length() > 4) {
            resultados.add("El docente " + docente.getNombre() + " tiene un codigo invalido. Debe tener maximo 4 digitos.");
        } else {
            resultados.add("El docente " + docente.getNombre() + " tiene los datos completos y codigo valido.");
        }
    }

    public List<String> getResultados() {
        return resultados;
    }

    public void mostrarResultado() {
        System.out.println("=== RESULTADO DE VALIDACION ===");

        for (String resultado : resultados) {
            System.out.println(resultado);
        }

        System.out.println();
    }
}