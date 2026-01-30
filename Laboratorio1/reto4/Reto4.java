package reto4;
import java.util.*;
import java.util.stream.Collectors;

public class Reto4 {
    public static void main(String[] args) {
        // Simulación para pruebas (puedes borrarlo si el Main está fuera)
    }

    public static void combinarMapas(Map<String, Integer> mapHash, Map<String, Integer> mapTable) {
        // 1. Unificar mapas con prioridad a los valores del Hashtable (mapTable)
        Map<String, Integer> unificado = new HashMap<>(mapHash);
        mapTable.forEach((k, v) -> unificado.put(k, v));

        // 2. Requisito Final: Claves en Mayúsculas (Samuel) + Orden Ascendente (Diego)
        unificado.entrySet().stream()
                .sorted(Map.Entry.comparingByKey()) // Ordenar por clave
                .map(e -> "CLAVE: " + e.getKey().toUpperCase() + " | VALOR: " + e.getValue()) // Mayúsculas
                .forEach(System.out::println);
    }
}