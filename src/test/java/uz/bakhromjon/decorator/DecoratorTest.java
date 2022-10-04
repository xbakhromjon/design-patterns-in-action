package uz.bakhromjon.decorator;

import org.junit.jupiter.api.Test;

/**
 * @author : Bakhromjon Khasanboyev
 * @username: @xbakhromjon
 * @since : 04/10/22, Tue, 09:25
 **/
public class DecoratorTest {
    @Test
    public void decoratorTest() {
        Pizza pizza = new ThickCrustPizza();;
        System.out.println(pizza.getDescription());
        System.out.println(pizza.getCost());

        Pepperoni pepperoni = new Pepperoni(pizza);
        System.out.println(pepperoni.getDescription());
        System.out.println(pepperoni.getCost());

        Pepperoni doublePepperoni = new Pepperoni(pepperoni);
        System.out.println(doublePepperoni.getDescription());
        System.out.println(doublePepperoni.getCost());
    }
}
