public class Dog extends Animal{
    private String foodPreference;

    public Dog(String name, int age, String foodPreference){
        super(name, age);
        this.foodPreference = foodPreference;
    }

    @Override
    public void makeASound() {
        System.out.println("AU AU AU AU!!!");
    }
}
