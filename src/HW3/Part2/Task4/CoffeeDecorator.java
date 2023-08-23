package HW3.Part2.Task4;

public abstract class CoffeeDecorator implements Coffee{
    protected Coffee decoratorCoffee;

    public CoffeeDecorator(Coffee decoratorCoffee){
        this.decoratorCoffee = decoratorCoffee;
    }
    public double cost() {
        return decoratorCoffee.cost();
    }
}
