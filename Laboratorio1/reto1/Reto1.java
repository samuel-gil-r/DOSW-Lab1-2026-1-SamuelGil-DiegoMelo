package reto1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Reto1 {
    public static void main(String[] args) {

        List<Estudiante> estudiantes = Arrays.asList(
                new Estudiante("Samuel Gil", 21, "samuel@mail.com", "6"),
                new Estudiante("Diego Melo", 22, "diego@mail.com", "5")
        );

        String mensaje = estudiantes.stream()
                .map(e -> String.format("%s, estudiante de %s.° semestre de %d años", e.getNombre(), e.getSemestre(), e.getEdad()))
                .collect(Collectors.joining(" y ", "¡Hola, bienvenidos! Nosotros somos la pareja conformada por ", "."));

        String correos = estudiantes.stream()
                .map(Estudiante::getCorreo)
                .collect(Collectors.joining(" y ", "Nuestros correos institucionales son ", "."));

        System.out.println(mensaje + " " + correos);
    }
}
class Estudiante {
    String nombre, correo, semestre; int edad;
    public Estudiante(String n, int e, String c, String s) { nombre=n; edad=e; correo=c; semestre=s; }
    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public String getCorreo() { return correo; }
    public String getSemestre() { return semestre; }
}
