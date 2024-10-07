package arreglo;

import modelo.Cliente;
import java.util.ArrayList;
import java.util.List;

public class ArregloCliente {
    private List<Cliente> clientes = new ArrayList<>();
    private int indice;

    public boolean agregar(Cliente cliente) {
        return clientes.add(cliente);
    }

    public Cliente[] buscar(String RUC) {
        return clientes.stream().filter(c -> c.getNombre().equals(RUC)).toArray(Cliente[]::new);
    }
}
