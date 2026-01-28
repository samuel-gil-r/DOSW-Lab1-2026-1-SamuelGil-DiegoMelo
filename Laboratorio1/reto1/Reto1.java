package reto1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Reto1 {

    public static void main(String[] args) {

        List<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante(
                "Samuel Gil", 21, "samuel.gil@mail.escuelaing.edu.co", 6));
        estudiantes.add(new Estudiante(
                "Diego Melo", 20, "diego.melo@mail.escuelaing.edu.co", 5));


        List<String> descripciones = estudiantes.stream()
                .map(e -> e.getNombreCompleto()
                        + ", estudiante de la escuela de "
                        + e.getSemestre()
                        + " semestre de "
                        + e.getEdad()
                        + " años")
                .collect(Collectors.toList());


        List<String> correos = estudiantes.stream()
                .map(Estudiante::getCorreoInstitucional)
                .collect(Collectors.toList());


        Runnable imprimirMensaje = () -> {
            String mensajeFinal =
                    "¡Hola, bienvenidos! Nosotros somos la pareja conformada por "
                            + String.join(" y ", descripciones)
                            + ". Nuestros correos institucionales son "
                            + String.join(" y ", correos)
                            + ".";

            MensajeBienvenida mensaje = new MensajeBienvenida(mensajeFinal);
            System.out.println(mensaje.getMensaje());
        };

        imprimirMensaje.run();
    }
}

