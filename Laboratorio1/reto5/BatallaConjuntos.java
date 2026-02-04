package reto5;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class BatallaConjuntos {
    public static Set<Integer> hashSetSinMultiplosDe3(Set<Integer> entrada) {
        return entrada.stream()
                .filter(n -> n % 3 != 0)
                .collect(Collectors.toCollection(HashSet::new));
    }
    public static Set<Integer> treeSetSinMultiplosDe5(Set<Integer> entrada) {
        return entrada.stream()
                .filter(n -> n % 5 != 0)
                .collect(Collectors.toCollection(TreeSet::new));
    }
    public static Set<Integer> unirOrdenado(Set<Integer> a, Set<Integer> b) {
        Set<Integer> union = new TreeSet<>();
        union.addAll(a);
        union.addAll(b);
        return union;
    }
    public static void imprimir(Set<Integer> conjunto) {
        conjunto.forEach(n -> System.out.println("Número en arena: " + n));
    }

    public static void main(String[] args) {
        Set<Integer> hash = new HashSet<>();
        hash.add(4); hash.add(9); hash.add(15); hash.add(7); hash.add(18); hash.add(21); hash.add(10); hash.add(5);
        Set<Integer> tree = new TreeSet<>();
        tree.add(12); tree.add(3); tree.add(25); tree.add(10); tree.add(7); tree.add(30); tree.add(18); tree.add(4);
        Set<Integer> hashFiltrado = hashSetSinMultiplosDe3(hash);
        Set<Integer> treeFiltrado = treeSetSinMultiplosDe5(tree);
        Set<Integer> union = unirOrdenado(hashFiltrado, treeFiltrado);
        imprimir(union);
    }
}
