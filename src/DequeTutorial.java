import java.util.Deque;
import java.util.LinkedList;

public class DequeTutorial {
    public static void main(String[] args) {
        Deque<String> fruits = new LinkedList<>();

        fruits.offerFirst("Banana");
        fruits.offerLast("Maçã");
        fruits.offerFirst("Pera");

        fruits.removeFirstOccurrence("Pera");
        System.out.println(fruits);

        String head = fruits.peekFirst();
        System.out.println(head);

        String tail = fruits.peekLast();
        System.out.println(tail);

        String fruit = fruits.pollFirst();
        System.out.println(fruit);

        System.out.println(fruits);
    }
}
