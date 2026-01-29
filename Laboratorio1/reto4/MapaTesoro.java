package reto4;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapaTesoro {

    public static Map<String, Integer> construirMapaHash(List<Map.Entry<String, Integer>> pares) {
        Map<String, Integer> mapa = new HashMap<>();

        for (Map.Entry<String, Integer> par : pares) {
            mapa.putIfAbsent(par.getKey(), par.getValue());
        }

        return mapa;
    }
}
