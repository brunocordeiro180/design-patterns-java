public class PlainPizza implements PizzaInterface {
    
    @Override
    public String getDescription() {
        
        return "Pizza";
    }

    @Override
    public double getValue() {
        
        return 4.0;
    }
}
