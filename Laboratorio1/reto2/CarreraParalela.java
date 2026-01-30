package reto2;

import java.util.List;
import java.util.IntSummaryStatistics;

public class CarreraParalela {
    public static void procesarLista(List<Integer> numeros) {
        IntSummaryStatistics stats = numeros.stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics();

        // Lógica unificada (Samuel + Diego)
        int max = stats.getMax();
        int min = stats.getMin();
        long count = stats.getCount();

        System.out.println("Maximo: " + max);
        System.out.println("Minimo: " + min);
        System.out.println("Cantidad: " + count);

        // Validaciones requeridas (Par/Impar y Múltiplos)
        System.out.println("¿Max es múltiplo de 2?: " + ((max % 2 == 0) ? "Si" : "No"));
        System.out.println("¿Max es divisor de 2?: " + ((max != 0 && 2 % max == 0) ? "Si" : "No"));
        System.out.println("¿Cantidad es par?: " + ((count % 2 == 0) ? "Si" : "No"));
        System.out.println("¿Cantidad es impar?: " + ((count % 2 != 0) ? "Si" : "No"));
    }
}