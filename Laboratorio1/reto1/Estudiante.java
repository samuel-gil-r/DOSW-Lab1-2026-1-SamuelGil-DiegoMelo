package reto1;

public class Estudiante {

    private String nombreCompleto;
    private int edad;
    private String correoInstitucional;
    private int semestre;

    public Estudiante(String nombreCompleto, int edad, String correoInstitucional, int semestre) {
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
        this.correoInstitucional = correoInstitucional;
        this.semestre = semestre;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public int getEdad() {
        return edad;
    }

    public String getCorreoInstitucional() {
        return correoInstitucional;
    }

    public int getSemestre() {
        return semestre;
    }
}

