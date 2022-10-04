package uz.bakhromjon.decorator;

import java.math.BigDecimal;

/**
 * @author : Bakhromjon Khasanboyev
 * @username: @xbakhromjon
 * @since : 04/10/22, Tue, 09:19
 **/
public class ThickCrustPizza extends Pizza {

    public ThickCrustPizza() {
        super();
        this.description = "Thick crust pizza";
    }

    @Override
    public BigDecimal getCost() {
        return new BigDecimal("15.00");
    }
}
