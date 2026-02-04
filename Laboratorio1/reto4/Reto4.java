package reto4;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Reto4 {

    public static void main(String[] args) {

        
        Map<String, Integer> mapHash = new HashMap<>();
        mapHash.put("oro", 10);
        mapHash.put("plata", 5);
        mapHash.put("bronce", 2);

        
        Map<String, Integer> mapTable = new Hashtable<>();
        mapTable.put("plata", 8);     
        mapTable.put("diamante", 20);
        mapTable.put("esmeralda", 15);

       
        combinarMapas(mapHash, mapTable);
    }

    public static void combinarMapas(Map<String, Integer> mapHash, Map<String, Integer> mapTable) {
        Map<String, Integer> unificado = new HashMap<>(mapHash);

        
        mapTable.forEach(unificado::put);

        unificado.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .map(e -> "CLAVE: " + e.getKey().toUpperCase() + " | VALOR: " + e.getValue())
                .forEach(System.out::println);
    }
}
