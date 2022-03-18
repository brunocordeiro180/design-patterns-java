public class Main {
    
    public static void main(String[] args) {

        PizzaInterface pizza = new MussarelaPizza(new CalabresaPizza(new PlainPizza()));
        System.out.println("Descricao: " + pizza.getDescription());
        System.out.println("Valor: " + pizza.getValue());
    }
}
