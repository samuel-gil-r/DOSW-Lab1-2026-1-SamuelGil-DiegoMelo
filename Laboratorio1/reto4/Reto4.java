package reto4;
import java.util.*;
import java.util.stream.Collectors;

public class Reto4 {
    public static void main(String[] args) {
    }

    public static void combinarMapas(Map<String, Integer> mapHash, Map<String, Integer> mapTable) {
        Map<String, Integer> unificado = new HashMap<>(mapHash);
        mapTable.forEach((k, v) -> unificado.put(k, v));

        unificado.entrySet().stream()
                .sorted(Map.Entry.comparingByKey()) // Ordenar por clave
                .map(e -> "CLAVE: " + e.getKey().toUpperCase() + " | VALOR: " + e.getValue()) // Mayúsculas
                .forEach(System.out::println);
    }
}
