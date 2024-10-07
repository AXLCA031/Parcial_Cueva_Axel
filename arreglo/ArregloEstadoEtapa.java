package arreglo;

import modelo.EstadoEtapa;
import java.util.ArrayList;
import java.util.List;

public class ArregloEstadoEtapa {
    private List<EstadoEtapa> estados = new ArrayList<>();
    private int indice;

    public boolean agregar(EstadoEtapa estado) {
        return estados.add(estado);
    }

    public EstadoEtapa buscarPorNombre(String nombre) {
        for (EstadoEtapa estado : estados) {
            if (estado.getNombre().equalsIgnoreCase(nombre)) {
                return estado;
            }
        }
        return null;
    }

    public boolean eliminar(String nombre) {
        EstadoEtapa estado = buscarPorNombre(nombre);
        if (estado != null) {
            return estados.remove(estado);
        }
        return false;
    }

    @Override
    public String toString() {
        return "ArregloEstadoEtapa{" +
                "estados=" + estados +
                '}';
    }
}
