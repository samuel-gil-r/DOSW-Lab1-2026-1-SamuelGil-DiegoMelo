package Laboratorio1.reto4;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Reto4 {

    
    public Map<String, Integer> procesarHashMap(List<Map.Entry<String, Integer>> pares) {
        Map<String, Integer> mapa = new HashMap<>();

        for (Map.Entry<String, Integer> par : pares) {
            // putIfAbsent inserta solo si la clave NO existe (cumple la regla de conservar el primero)
            mapa.putIfAbsent(par.getKey(), par.getValue());
        }
        return mapa;
    }

    public static Map<String, Integer> construirMapaHash(List<Map.Entry<String, Integer>> pares) {
        Map<String, Integer> mapa = new HashMap<>();

        for (Map.Entry<String, Integer> par : pares) {
            mapa.putIfAbsent(par.getKey(), par.getValue());
        }

        return mapa;
    }
}
