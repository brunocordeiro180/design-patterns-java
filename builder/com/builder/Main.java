package builder.com.builder;

public class Main {
    public static void main(String[] args) {
        System.out.println("oi mundo");

        Person person = new Person.Builder()
                .age(15)
                .name("Joazinho")
                .married(true)
                .build();

        System.out.println(person);
    }
}