package Animal;

public class Chicken extends Animal implements Edible {


    @Override
    String makeSound() {
        return "Chicken sound!";
    }

    @Override
    public String howtoEat() {
        return "Just eat!";
    }
}
