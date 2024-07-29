import java.util.ArrayList;
import java.util.List;

public class WildCards {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        Integer intValue = 2;
        intList.add(intValue);
        List<? extends Number> numList = intList;
    }
}
