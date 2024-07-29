import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTutorial {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Maçã");
        fruits.add("Pera");
        fruits.add("Pêssego");
        fruits.add("Banana");

        Iterator<String> iterator = fruits.iterator();

        while (iterator.hasNext()){
            String fruit = iterator.next();
            System.out.println(fruit);
        }
    }
}
