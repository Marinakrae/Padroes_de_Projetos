package pizza.director;

import pizza.builders.Builder;
import pizza.ingredientes.Massa;
import pizza.ingredientes.Molho;
import pizza.ingredientes.Queijo;
import pizza.ingredientes.Sabor;
import pizza.pizzas.PizzaType;

public class Director {

    public void constructPizza(Builder builder){
        builder.setPizzaType(PizzaType.PIZZA);
        builder.setMassa(new Massa(true, 30));
        builder.setMolho(new Molho("Tomate"));
        builder.setQueijo(new Queijo("Mussarela"));
        builder.setSabor(new Sabor("Marguerita", "Azeitona"));
    }

    public void constructCalzzone(Builder builder) {
        builder.setPizzaType(PizzaType.CALZZONE);
        builder.setMassa(new Massa(false, 45));
        builder.setMolho(new Molho("Strogonoff"));
        builder.setQueijo(new Queijo("Cheddar"));
        builder.setSabor(new Sabor("Strogonoff", ""));
    }
}
