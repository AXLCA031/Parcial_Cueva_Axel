package arreglo;

import modelo.GradoEstudio;
import java.util.ArrayList;
import java.util.List;

public class ArregloGradoEstudio {
    private List<GradoEstudio> grados = new ArrayList<>();
    private int indice;

    public boolean agregar(GradoEstudio grado) {
        return grados.add(grado);
    }

    public GradoEstudio buscar(String criterio) {
        for (GradoEstudio grado : grados) {
            if (grado.getDescripcion().equalsIgnoreCase(criterio)) {
                return grado;
            }
        }
        return null;
    }

    public List<GradoEstudio> getGrados() {
        return grados;
    }
}
