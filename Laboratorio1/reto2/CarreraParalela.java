package reto2;

import java.util.List;

public class CarreraParalela {

    public static class Resultado {
        public int minimo;
        public int maximo;
        public int cantidad;

        public boolean mayorEsMultiploDe2;
        public boolean mayorEsDivisorDe2;
        public boolean cantidadEsPar;
        public boolean cantidadEsImpar;
    }

    public static Resultado combinarResultados(List<Integer> numeros) {
        Resultado r = new Resultado();

        r.minimo = numeros.stream()
                .min(Integer::compareTo)
                .orElse(0);

        r.maximo = numeros.stream()
                .max(Integer::compareTo)
                .orElse(0);

        r.cantidad = numeros.size();

        r.mayorEsMultiploDe2 = (r.maximo % 2 == 0);
        r.mayorEsDivisorDe2 = (r.maximo != 0) ? (2 % r.maximo == 0) : false;

        r.cantidadEsPar = (r.cantidad % 2 == 0);
        r.cantidadEsImpar = (r.cantidad % 2 != 0);

        return r;
    }

    public static void main(String[] args) {
        List<Integer> numeros = List.of(5, 8, 2, 9, 1);

        Resultado r = combinarResultados(numeros);

        System.out.println("Minimo: " + r.minimo);
        System.out.println("Maximo: " + r.maximo);
        System.out.println("Cantidad: " + r.cantidad);
        System.out.println("Mayor multiplo de 2: " + r.mayorEsMultiploDe2);
        System.out.println("Mayor divisor de 2: " + r.mayorEsDivisorDe2);
        System.out.println("Cantidad par: " + r.cantidadEsPar);
        System.out.println("Cantidad impar: " + r.cantidadEsImpar);
    }
}
