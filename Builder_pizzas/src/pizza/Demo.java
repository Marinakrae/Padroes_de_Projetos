package pizza;

import pizza.builders.PizzaBuilder;
import pizza.director.Director;
import pizza.pizzas.Pizza;

/**
 * Demo class. Everything comes together here.
 */
public class Demo {

    public static void main(String[] args) {
        Director director = new Director();

        PizzaBuilder builder = new PizzaBuilder();
        director.constructPizza(builder);

        Pizza pizza = builder.getResult();
        System.out.println("Pizza montada:\n" + pizza.getPizzaType());

    }

}
