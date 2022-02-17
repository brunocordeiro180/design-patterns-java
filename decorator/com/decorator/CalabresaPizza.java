package decorator.com.decorator;

public class CalabresaPizza extends PizzaDecorator {

    public CalabresaPizza(PizzaInterface pizzaInterface){
        super(pizzaInterface);
    }
    
    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Calabresa"; 
    }

    @Override
    public double getValue() {
        return pizza.getValue() + 2.0;
    }
}
