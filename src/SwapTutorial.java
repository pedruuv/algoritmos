import java.util.*;

public class SwapTutorial {
    public static <T> void swap(List<T> list, int i, int j) {
        T temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        fruits.add("Maçã");
        fruits.add("Banana");
        fruits.add("Pêssego");
        fruits.add("Laranja");
        fruits.add("Banana");

        fruits.subList(0, 3).clear();
        System.out.println(fruits);

//        swap(fruits, 3, 0);
//        System.out.println(fruits);
//
//        for (ListIterator<String> iterator = fruits.listIterator(fruits.size()); iterator.hasPrevious();){
//            System.out.println(iterator.previous());
//        }


    }
}
