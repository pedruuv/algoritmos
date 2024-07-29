import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetTutorial {
    public static void main(String[] args) {
        SortedSet<String> fruits = new TreeSet<>();
        fruits.add("Maçã");
        fruits.add("Banana");
        fruits.add("Pêssego");
        fruits.add("Melância");
        fruits.add("Blueberry");
        fruits.add("Melância");

        List<String> count = fruits.subSet("Blueberry", "Melância\0").stream().toList();
        System.out.println(count);

        System.out.println(fruits.headSet("Maçã"));
    }
}
