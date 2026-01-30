package Laboratorio1.reto5;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Reto5 {

    // Misión Estudiante A (Diego): HashSet (Sin orden)
    // Regla: Generar aleatorios y eliminar múltiplos de 3
    public Set<Integer> obtenerConjuntoA() {
        Set<Integer> conjunto = new HashSet<>();
        Random random = new Random();

        // Generamos 10 números aleatorios entre 0 y 50
        while (conjunto.size() < 10) {
            conjunto.add(random.nextInt(51));
        }

        // Aplicamos la regla: Filtrar (eliminar) múltiplos de 3
        return conjunto.stream()
                .filter(n -> n % 3 != 0) // "Deja pasar solo los que NO son múltiplos de 3"
                .collect(Collectors.toSet());
    }
}