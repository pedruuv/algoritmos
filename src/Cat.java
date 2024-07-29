@VeryImportant
public class Cat extends Animal{

    private String foodPreference;

    public Cat(String name, int age, String foodPreference){
        super(name, age);
        this.foodPreference = foodPreference;

    }

    @Override
    @RunImmediatly(times = 3)
    public void makeASound() {
        System.out.println("MEOW MEOW MEOW!!!");
    }

    public void eat(){
        System.out.println("Munch");
    }
}
