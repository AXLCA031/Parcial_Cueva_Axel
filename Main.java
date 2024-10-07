import modelo.*;
import arreglo.*;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        ArregloEstadoEtapa arregloEstadoEtapa = new ArregloEstadoEtapa();

        ArregloGradoEstudio arregloGradoEstudio = new ArregloGradoEstudio();

        GradoEstudio grado1 = new GradoEstudio("Licenciatura en Informática");
        GradoEstudio grado2 = new GradoEstudio("Ingeniería de Sistemas");
        GradoEstudio grado3 = new GradoEstudio("Maestría en Ciencias de la Computación");

        arregloGradoEstudio.agregar(grado1);
        arregloGradoEstudio.agregar(grado2);
        arregloGradoEstudio.agregar(grado3);

        System.out.println(arregloGradoEstudio);

        GradoEstudio buscado = arregloGradoEstudio.buscar("Ingeniería de Sistemas");
        if (buscado != null) {
            System.out.println("Grado encontrado: " + buscado);
        } else {
            System.out.println("Grado no encontrado.");
        }

        EstadoEtapa estado1 = new EstadoEtapa("Inicio", true);
        EstadoEtapa estado2 = new EstadoEtapa("Medio", false);
        EstadoEtapa estado3 = new EstadoEtapa("Fin", true);

        arregloEstadoEtapa.agregar(estado1);
        arregloEstadoEtapa.agregar(estado2);
        arregloEstadoEtapa.agregar(estado3);

        System.out.println(arregloEstadoEtapa);

        EstadoEtapa estadoBuscado = arregloEstadoEtapa.buscarPorNombre("Medio");
        if (estadoBuscado != null) {
            System.out.println("Estado encontrado: " + estadoBuscado);
        } else {
            System.out.println("Estado no encontrado.");
        }

        boolean eliminado = arregloEstadoEtapa.eliminar("Inicio");
        if (eliminado) {
            System.out.println("Estado 'Inicio' eliminado.");
        }

        System.out.println(arregloEstadoEtapa);
    }
}
