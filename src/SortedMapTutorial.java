import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapTutorial {
    public static void main(String[] args) {
        SortedMap<String, Integer> fruits = new TreeMap<>();
        fruits.put("Maçã", 16);
        fruits.put("Abóbora", 24);
        fruits.put("Blueberry", 90);
        fruits.put("Morango", 23);
        fruits.put("Abacaxi", 5);

        SortedMap<String, Integer> test = fruits.tailMap("Banana");
        System.out.println(test);

        SortedMap<String, Integer> subMap = fruits.subMap("B", "N");
        System.out.println(subMap);
    }
}
