package reto5;
import java.util.*;

public class Reto5 {
    public static void batallaConjuntos(Set<Integer> setA, Set<Integer> setB) {
        // 1. Unión ordenada (TreeSet)
        Set<Integer> union = new TreeSet<>(setA);
        union.addAll(setB);

        // 2. Filtrar múltiplos de 3 y 5
        union.stream()
                .filter(n -> n % 3 != 0)
                .filter(n -> n % 5 != 0)
                .forEach(n -> System.out.println("Número en arena: " + n));
    }
}