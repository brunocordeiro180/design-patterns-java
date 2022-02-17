package decorator.com.decorator;

public class MussarelaPizza extends PizzaDecorator {

    public MussarelaPizza(PizzaInterface pizzaInterface){
        super(pizzaInterface);
    }
    
    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Mussarela"; 
    }

    @Override
    public double getValue() {
        return pizza.getValue() + 8.0;
    }
}
