import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReductionTutorial {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

//        int sum = numbers.stream().reduce(0, (acc, n) -> acc + n);
//        System.out.println(sum);

//        int min = numbers.stream().reduce(1, (acc, n) -> acc < n ? acc : n);
//
//        System.out.println(min);

        Optional<Integer> product = numbers.stream().reduce((acc, n) -> acc * n);

        product.ifPresent(System.out::println);
    }
}
