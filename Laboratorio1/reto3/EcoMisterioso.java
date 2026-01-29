package reto3;

import java.util.function.Function;
import java.util.stream.IntStream;

public class EcoMisterioso {

    public static String repetirTresBuilder(String mensaje) {
        return IntStream.range(0, 3)
                .mapToObj(i -> mensaje)
                .reduce(new StringBuilder(),
                        (sb, s) -> sb.length() == 0 ? sb.append(s) : sb.append(" ").append(s),
                        StringBuilder::append)
                .toString();
    }

    public static String ecoEspecial(String mensaje) {
        Function<String, String> repetir = EcoMisterioso::repetirTresBuilder;
        String repetido = repetir.apply(mensaje);
        return new StringBuilder(repetido).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(repetirTresBuilder("hola"));
        System.out.println(ecoEspecial("hola"));
    }
}
