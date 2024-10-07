package modelo;

public class EstadoEtapa {
    private String nombre;
    private boolean estado;

    public EstadoEtapa(String nombre, boolean estado) {
        this.nombre = nombre;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "EstadoEtapa{" +
                "nombre='" + nombre + '\'' +
                ", estado=" + estado +
                '}';
    }
}
