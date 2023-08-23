package HW3.Part2.Task4;

public class Milk extends CoffeeDecorator{
    public Milk(Coffee decoratorCoffee) {
        super(decoratorCoffee);
    }

    public double cost(){
        return super.cost() + 0.7;
    }
}
