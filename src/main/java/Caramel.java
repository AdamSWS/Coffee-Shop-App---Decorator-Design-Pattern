public class Caramel extends CoffeeDecorator {

    private double cost = .50;

    Caramel(Coffee specialCoffee){
        super(specialCoffee);
    }

    public double makeCoffee() {
        return specialCoffee.makeCoffee() + addShot();
    }

    private double addShot() {
        System.out.println(" + caramel: $0.50");

        return cost;
    }
}
