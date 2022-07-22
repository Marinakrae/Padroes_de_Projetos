package pizza.pizzas;

import pizza.ingredientes.*;

public class Pizza {
    private final PizzaType pizzaType;
    private final Massa massa;
    private final Molho molho;
    private final Queijo queijo;
    private final Sabor sabor;

    public Pizza(PizzaType pizzaType, Massa massa, Molho molho, Queijo queijo, Sabor sabor) {
        this.pizzaType = pizzaType;
        this.massa = massa;
        this.molho = molho;
        this.queijo = queijo;
        this.sabor = sabor;
    }

    public PizzaType getPizzaType() {
        return pizzaType;
    }

    public Massa getMassa() {
        return massa;
    }

    public Molho getMolho() {
        return molho;
    }

    public Queijo getQueijo() {
        return queijo;
    }

    public Sabor getSabor() {
        return sabor;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "Tipo=" + pizzaType +
                ", massa=" + massa +
                ", molho=" + molho +
                ", queijo=" + queijo +
                ", sabor=" + sabor +
                '}';
    }
}
