import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TutorialAnnotation {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Cat myCat = new Cat("Hughie", 3, "Fish");
        Dog myDog = new Dog("Jupi", 8, "Steak and Rice");

        if (myDog.getClass().isAnnotationPresent(VeryImportant.class)){
            System.out.println("This thing is very important");
        } else {
            System.out.println("This thing is not very important");
        }

        for (Method method : myCat.getClass().getDeclaredMethods()){
            if (method.isAnnotationPresent(RunImmediatly.class)){
                RunImmediatly annotation = method.getAnnotation(RunImmediatly.class);

                for (int i = 0; i < annotation.times(); i++){
                    method.invoke(myCat);
                }
            }
        }

        for (Field field : myCat.getClass().getDeclaredFields()){
            if (field.isAnnotationPresent(ImportantString.class)){
                Object object = field.get(myCat);

                if (object instanceof String stringValue){
                    System.out.println(stringValue.toUpperCase());
                }
            }
        }
    }
}
