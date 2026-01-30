package Laboratorio1.reto4;

import java.util.*;
import java.util.stream.Collectors;

public class Reto4 {

    // Parte A (Diego): HashMap
    public Map<String, Integer> procesarHashMap(List<Map.Entry<String, Integer>> pares) {
        Map<String, Integer> mapa = new HashMap<>();
        for (Map.Entry<String, Integer> par : pares) {
            mapa.putIfAbsent(par.getKey(), par.getValue());
        }
        return mapa;
    }

    // Parte B (Samuel): CORREGIDO a Hashtable (Requisito PDF)
    public Map<String, Integer> construirMapaHash(List<Map.Entry<String, Integer>> pares) {
        Map<String, Integer> mapa = new Hashtable<>(); // ¡Aquí estaba el error!
        for (Map.Entry<String, Integer> par : pares) {
            mapa.putIfAbsent(par.getKey(), par.getValue());
        }
        return mapa;
    }

    // LA GRAN META (Faltaba esto): Unir, Mayúsculas y Ordenar
    public Map<String, Integer> unirMapas(Map<String, Integer> mapaA, Map<String, Integer> mapaB) {
        // Usamos TreeMap para garantizar el orden ascendente (Tarea de Samuel)
        Map<String, Integer> resultado = new TreeMap<>();

        // Prioridad al Hashtable (B) en caso de conflicto
        mapaB.forEach((k, v) -> resultado.put(k.toUpperCase(), v)); // Convertir a MAYÚSCULAS (Tarea de Diego)

        // Agregar del HashMap (A) solo si no existe (o sobrescribir según lógica de negocio, aquí priorizamos B)
        mapaA.forEach((k, v) -> resultado.putIfAbsent(k.toUpperCase(), v));

        return resultado;
    }
}