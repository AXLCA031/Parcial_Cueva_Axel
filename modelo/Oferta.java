package modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Oferta {
    private String puesto;
    private String descripcion;
    private String area;
    private Date fechaInicio;
    private Date fechaTermino;
    private List<Requisito> requisitos = new ArrayList<>();

    public Oferta(String puesto, String descripcion, String area, Date fechaInicio, Date fechaTermino) {
        this.puesto = puesto;
        this.descripcion = descripcion;
        this.area = area;
        this.fechaInicio = fechaInicio;
        this.fechaTermino = fechaTermino;
    }

    public boolean agregarRequisito(int orden, String descripcion) {
        return requisitos.add(new Requisito(orden, descripcion));
    }

    public boolean eliminarRequisito(int orden) {
        return requisitos.removeIf(r -> r.getOrden() == orden);
    }

    public List<Requisito> getRequisitos() {
        return requisitos;
    }
}
