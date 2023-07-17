public class Oreos extends CoffeeDecorator {

    private double cost = 1.00;

    Oreos(Coffee specialCoffee){
        super(specialCoffee);
    }

    public double makeCoffee() {
        return specialCoffee.makeCoffee() + addShot();
    }

    private double addShot() {
        System.out.println(" + crumbled oreos: $1.00");

        return cost;
    }
}
