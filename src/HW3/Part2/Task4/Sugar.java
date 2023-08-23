package HW3.Part2.Task4;

public class Sugar extends CoffeeDecorator{
    public Sugar(Coffee decoratorCoffee) {
        super(decoratorCoffee);
    }

    public double cost(){
        return super.cost() + 0.5;
    }
}
