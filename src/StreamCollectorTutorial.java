import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamCollectorTutorial {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ana", "Camila", "Pedro", "João");

        Map<Integer, String> namesMap = names.stream().collect(Collectors.toMap(String::length, Function.identity()));

        System.out.println(namesMap);
    }
}
