import java.util.Arrays;
import java.util.List;

public class ParallelStreamTutorial {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("João", "Pedro", "Camila", "Marcos", "Pablo");


        names.parallelStream().forEach(System.out::println);

        names.forEach(System.out::println);
    }
}
