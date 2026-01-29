package reto2;

import java.util.List;
import java.util.function.Function;

public class CarreraParalela {

    public static class Resultado {
        public int minimo;
        public int cantidad;
    }


    public static Resultado calcularMinimoYCantidad(List<Integer> numeros) {

        Function<List<Integer>, Resultado> lambdaMinimoCantidad = lista -> {
            Resultado r = new Resultado();

            r.minimo = lista.stream()
                    .min((a, b) -> a.compareTo(b))
                    .orElse(0);

            r.cantidad = lista.size();

            return r;
        };

        return lambdaMinimoCantidad.apply(numeros);
    }

    public static void main(String[] args) {
        List<Integer> numeros = List.of(5, 8, 2, 9, 1);

        Resultado resultado = calcularMinimoYCantidad(numeros);

        System.out.println("Mínimo: " + resultado.minimo);
        System.out.println("Cantidad: " + resultado.cantidad);
    }


    // Tu parte (Diego):
    public Integer obtenerNumeroMasGrande(List<Integer> numeros) {
        return numeros.stream()
                .max((n1, n2) -> n1.compareTo(n2))
                .orElse(0);
    }
}
