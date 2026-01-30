package Laboratorio1.reto1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Reto1 {

    public static class Estudiante {
        String nombre;
        String carrera;
        int semestre;
        int edad;
        String correo;

        public Estudiante(String nombre, String carrera, int semestre, int edad, String correo) {
            this.nombre = nombre;
            this.carrera = carrera;
            this.semestre = semestre;
            this.edad = edad;
            this.correo = correo;
        }
    }

    public static void main(String[] args) {
        
        List<Estudiante> estudiantes = Arrays.asList(
            new Estudiante("Juan Diego Melo", "Ingeniería de Sistemas", 7, 21, "juan.melo@mail.escuelaing.edu.co"),
            new Estudiante("Samuel Gil", "Ingeniería de Sistemas", 7, 22, "samuel.gil@mail.escuelaing.edu.co")
        );

        String mensaje = estudiantes.stream()
            .map(e -> e.nombre + ", estudiante de " + e.carrera + " de " + e.semestre + "° semestre de " + e.edad + " años")
            .collect(Collectors.joining(" y ", "¡Hola, bienvenidos! Nosotros somos la pareja conformada por ", "."));

        String correos = estudiantes.stream()
            .map(e -> e.correo)
            .collect(Collectors.joining(" y ", "Nuestros correos institucionales son ", "."));

        System.out.println(mensaje + " " + correos);
    }
}

