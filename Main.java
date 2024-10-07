import modelo.*;
import arreglo.*;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Crear el arreglo de EstadoEtapa
        ArregloEstadoEtapa arregloEstadoEtapa = new ArregloEstadoEtapa();

        // Crear el arreglo de GradoEstudio
        ArregloGradoEstudio arregloGradoEstudio = new ArregloGradoEstudio();

        // Agregar varios grados de estudio
        GradoEstudio grado1 = new GradoEstudio("Licenciatura en Informática");
        GradoEstudio grado2 = new GradoEstudio("Ingeniería de Sistemas");
        GradoEstudio grado3 = new GradoEstudio("Maestría en Ciencias de la Computación");

        arregloGradoEstudio.agregar(grado1);
        arregloGradoEstudio.agregar(grado2);
        arregloGradoEstudio.agregar(grado3);

        // Mostrar todos los grados agregados
        System.out.println(arregloGradoEstudio);

        // Buscar un grado por descripción
        GradoEstudio buscado = arregloGradoEstudio.buscar("Ingeniería de Sistemas");
        if (buscado != null) {
            System.out.println("Grado encontrado: " + buscado);
        } else {
            System.out.println("Grado no encontrado.");
        }

        // Agregar varios estados de etapa
        EstadoEtapa estado1 = new EstadoEtapa("Inicio", true);
        EstadoEtapa estado2 = new EstadoEtapa("Medio", false);
        EstadoEtapa estado3 = new EstadoEtapa("Fin", true);

        arregloEstadoEtapa.agregar(estado1);
        arregloEstadoEtapa.agregar(estado2);
        arregloEstadoEtapa.agregar(estado3);

        // Mostrar todos los estados agregados
        System.out.println(arregloEstadoEtapa);

        // Buscar un estado por nombre
        EstadoEtapa estadoBuscado = arregloEstadoEtapa.buscarPorNombre("Medio");
        if (estadoBuscado != null) {
            System.out.println("Estado encontrado: " + estadoBuscado);
        } else {
            System.out.println("Estado no encontrado.");
        }

        // Eliminar un estado
        boolean eliminado = arregloEstadoEtapa.eliminar("Inicio");
        if (eliminado) {
            System.out.println("Estado 'Inicio' eliminado.");
        }

        // Mostrar el arreglo después de la eliminación
        System.out.println(arregloEstadoEtapa);
    }
}
