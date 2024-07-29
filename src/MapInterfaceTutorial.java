import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapInterfaceTutorial {
    public static void main(String[] args) {

        Map<String, Integer> fruitsCount = new HashMap<>();
        fruitsCount.put("Maçã", 5);
        fruitsCount.put("Pêssego", 10);
        fruitsCount.put("Banana", 45);
        fruitsCount.put("Blueberry", 203);
        fruitsCount.put("MaçãVerde", 20);

        Map<String, Integer> fruitsCount2 = new HashMap<>();

        fruitsCount2.put("Maçã", 5);
        fruitsCount2.put("Pêssego", 10);
        fruitsCount2.put("Banana", 45);
        fruitsCount2.put("Blueberry", 203);
        fruitsCount2.put("MaçãVerde", 20);
//        fruitsCount2.put("Melância", 399);

        if (fruitsCount.keySet().equals(fruitsCount2.keySet())) {
            System.out.println("fruitsCount contêm todos os valores de fruitsCount2");
        } else {
            System.out.println("fruitsCount não contêm todos os valores de fruitsCount2");
        }

//        for (Map.Entry<String, Integer> e : fruitsCount.entrySet()){
//            System.out.println(e.getKey() + ": " + e.getValue());
//        }


    }
}
