import java.util.List;
import java.util.stream.Stream;

public class TestePqSim {
    public static void main(String[] args) {
        List<Integer> numbers = Stream.iterate(0, n -> n + 1).limit(200).toList();

        numbers.parallelStream().filter(n -> n > 50).forEachOrdered(System.out::println);
    }
}
