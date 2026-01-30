package Laboratorio1.reto3;

import java.util.stream.Stream;

public class Reto3 {

    // Misión Estudiante A (Diego): StringBuilder
    public String susurroBuilder(String mensaje) {
    StringBuilder sb = new StringBuilder();

    // Repetir 3 veces usando Streams
    Stream.generate(() -> mensaje)
.limit(3)
.forEach(m -> sb.append(m).append(" "));

    return sb.toString().trim();
}
}