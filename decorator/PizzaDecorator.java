public abstract class PizzaDecorator implements PizzaInterface {

    protected PizzaInterface pizza;

    PizzaDecorator(PizzaInterface pizzaInterface){
        this.pizza = pizzaInterface;
    }

    @Override
    public String getDescription() {
        return this.pizza.getDescription();
    }

    @Override
    public double getValue(){
        return this.pizza.getValue();
    }
}
