import java.util.LinkedList;
import java.util.Queue;

public class QueueTutorial {
    public static void main(String[] args) {
        Queue<String> fruits = new LinkedList<>();

        fruits.add("Strawberry");
        fruits.add("Watermelon");
        String test = fruits.poll();
        System.out.println(test);
        System.out.println(fruits);
    }
}
