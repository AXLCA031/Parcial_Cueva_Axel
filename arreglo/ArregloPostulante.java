package arreglo;

import modelo.Postulante;
import java.util.ArrayList;
import java.util.List;

public class ArregloPostulante {
    private List<Postulante> postulantes = new ArrayList<>();
    private int indice;

    public boolean agregar(Postulante postulante) {
        return postulantes.add(postulante);
    }

    public boolean buscar(String DNI) {
        return postulantes.stream().anyMatch(p -> p.equals(DNI));
    }
}
