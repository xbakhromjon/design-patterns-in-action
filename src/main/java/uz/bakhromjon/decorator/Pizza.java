package uz.bakhromjon.decorator;

import java.math.BigDecimal;

/**
 * @author : Bakhromjon Khasanboyev
 * @username: @xbakhromjon
 * @since : 04/10/22, Tue, 09:17
 **/
public abstract class Pizza {
    protected String description;

    public String getDescription() {
        return description;
    }


    public abstract BigDecimal getCost();
}
