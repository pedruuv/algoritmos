package Algoritmos;

import java.util.List;
import java.util.stream.Stream;

public class PesquisaBinária {
    public static void main(String[] args) {
        List<Integer> numbers = Stream.iterate(1, n -> n + 1).limit(100).toList();

        int baixo = 0;
        int alto = numbers.size() - 1;

        int secNumber = 78;
        int cont = 0;

        while (baixo <= alto){
            int meio = (baixo + alto) / 2;
            int chute = numbers.get(meio);
            if (chute == secNumber){
                System.out.println(meio);
                System.out.println(chute);
                System.out.println(cont);
                break;
            } else if (chute > secNumber) {
                alto = meio - 1;
            } else {
                baixo = meio + 1;
            }

            cont++;
        }
    }
}
