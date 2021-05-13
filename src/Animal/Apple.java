package Animal;

public class Apple extends Fruit implements Edible {
    @Override
    public String howtoEat() {
        return "Eat apple";
    }
}
