package modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Postulante {
    private String DNI;
    private String email;
    private String nombres;
    private String apellidos;
    private String direccion;
    private Date nacimiento;
    private String clave;
    private List<Postulacion> postulaciones = new ArrayList<>();

    public Postulante(String DNI, String email, String nombres, String apellidos, String direccion, Date nacimiento, String clave) {
        this.DNI = DNI;
        this.email = email;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.nacimiento = nacimiento;
        this.clave = clave;
    }

    public boolean asignarGradoEstudio(GradoEstudio gradoEstudio) {
        return true;
    }

    public boolean postular(Oferta oferta, String glosa) {
        Postulacion postulacion = new Postulacion(new Date(), false, null);
        return postulaciones.add(postulacion);
    }

    public boolean anularPostulacion(Postulacion postulacion) {
        postulacion.anular();
        return true;
    }

    public List<Postulacion> getPostulaciones() {
        return postulaciones;
    }
}
