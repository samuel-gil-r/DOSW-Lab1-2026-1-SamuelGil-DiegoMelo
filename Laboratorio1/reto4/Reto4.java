package reto4;
import java.util.*;
import java.util.stream.Collectors;

public class Reto4 {
    public static void main(String[] args) {
<<<<<<< HEAD

    }

    public static void combinarMapas(Map<String, Integer> mapHash, Map<String, Integer> mapTable) {

=======
        

    public static void combinarMapas(Map<String, Integer> mapHash, Map<String, Integer> mapTable) {
    
>>>>>>> a5ea68d780ccc48b668d38c257583c9908d3d9d7
        Map<String, Integer> unificado = new HashMap<>(mapHash);
        mapTable.forEach((k, v) -> unificado.put(k, v));

        unificado.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .map(e -> "CLAVE: " + e.getKey().toUpperCase() + " | VALOR: " + e.getValue())
                .forEach(System.out::println);
    }
}
