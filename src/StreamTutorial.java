import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamTutorial {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("João", "Maria", "Pedro");

        Stream<String> jNames = names.stream().filter(name -> name.startsWith("J"));

        List<Integer> streamIterated = Stream.iterate(40, n -> n+2).limit(20).toList();

        LongStream fibonacci = Stream.iterate(new long[] {0, 1}, p -> new long[]{p[1], p[0] + p[1]}).mapToLong(p -> p[0]).limit(20);

        fibonacci.forEach(System.out::println);

        List<Integer> listaDeNumeros= Stream.iterate(40, n -> n+2).limit(20).toList();

        System.out.println(listaDeNumeros);


    }
}
