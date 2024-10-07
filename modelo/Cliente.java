package modelo;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String RUC;
    private String nombre;
    private String email;
    private String telefono;
    private String clave;
    private List<Oferta> ofertas = new ArrayList<>();
    private Contacto contacto;

    public Cliente(String RUC, String nombre, String email, String telefono, String clave) {
        this.RUC = RUC;
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.clave = clave;
    }

    public boolean agregarOferta(Oferta oferta) {
        return ofertas.add(oferta);
    }

    public boolean eliminarOferta(Oferta oferta) {
        return ofertas.remove(oferta);
    }

    public List<Oferta> getOfertas() {
        return ofertas;
    }

    public void registrarContacto(String DNI, String nombres, String apellidos, String puesto) {
        this.contacto = new Contacto(DNI, nombres, apellidos, puesto);
    }

    public String getNombre() {
        return nombre;
    }
}
