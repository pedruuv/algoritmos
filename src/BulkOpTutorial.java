import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BulkOpTutorial {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Maçã");
        fruits.add("Banana");
        fruits.add("Pêssego");
        fruits.add("Laranja");

        System.out.println("Antes do Bulk:\n" + fruits);

        List<String> tropicalFruits = new ArrayList<>();
        tropicalFruits.add("Banana");
        tropicalFruits.add("Abacaxi");

        fruits.addAll(tropicalFruits);
        System.out.println("Depois do Bulk:\n" + fruits);

        boolean containsAll = fruits.containsAll(tropicalFruits);
        System.out.println(containsAll);

        fruits.retainAll(tropicalFruits);
        System.out.println(fruits);

    }
}
