import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetInterfaceTutorial {
    public static void main(String[] args) {
        Set<String> fruits = new LinkedHashSet<>();

        fruits.add("Maçã");
        fruits.add("Banana");
        fruits.add("Pêssego");
        fruits.add("Laranja");
        fruits.add("Banana");
        fruits.add(null);
        fruits.add(null);

        Set<String> fruits2 = new HashSet<>();

        fruits2.add("Maçã");
        fruits2.add("Banana");
        fruits2.add("Pêssego");
        fruits2.add("Laranja");
        fruits2.add("Banana");
        fruits2.add(null);
        fruits2.add(null);


        if (fruits.equals(fruits2)){
            System.out.println("São iguais");
        } else{
            System.out.println("São diferentes");
        }
    }
}
