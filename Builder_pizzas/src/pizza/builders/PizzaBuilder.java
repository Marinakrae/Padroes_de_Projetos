package pizza.builders;

import pizza.ingredientes.*;
import pizza.pizzas.Pizza;
import pizza.pizzas.PizzaType;

public class PizzaBuilder implements Builder{
    private PizzaType pizzaType;
    private Massa massa;
    private Molho molho;
    private Queijo queijo;
    private Sabor sabor;

    public void setPizzaType(PizzaType type) {
        this.pizzaType = pizzaType;
    }

    @Override
    public void setMassa(Massa massa) {
        this.massa = massa;
    }

    @Override
    public void setMolho(Molho molho) {
        this.molho = molho;
    }

    @Override
    public void setQueijo(Queijo queijo) {
        this.queijo = queijo;
    }

    @Override
    public void setSabor(Sabor sabor) {
        this.sabor = sabor;
    }

    public Pizza getResult() {
        return new Pizza(pizzaType, massa, molho, queijo, sabor);
    }
}
