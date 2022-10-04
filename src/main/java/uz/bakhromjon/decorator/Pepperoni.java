package uz.bakhromjon.decorator;

import java.math.BigDecimal;

/**
 * @author : Bakhromjon Khasanboyev
 * @username: @xbakhromjon
 * @since : 04/10/22, Tue, 09:22
 **/
public class Pepperoni extends PizzaIngredient {
    private Pizza pizza;

    public Pepperoni(Pizza pizza) {
        super();
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return this.pizza.description + " + pepperoni";
    }

    @Override
    public BigDecimal getCost() {
        return new BigDecimal("1.50").add(pizza.getCost());
    }


}
