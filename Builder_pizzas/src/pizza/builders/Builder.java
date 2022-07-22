package pizza.builders;

import pizza.ingredientes.*;
import pizza.pizzas.PizzaType;

public interface Builder {
    void setPizzaType(PizzaType type);
    void setMassa(Massa massa);
    void setMolho(Molho molho);
    void setQueijo(Queijo queijo);
    void setSabor(Sabor sabor);
}

//https://refactoring.guru/pt-br/design-patterns/builder/java/example