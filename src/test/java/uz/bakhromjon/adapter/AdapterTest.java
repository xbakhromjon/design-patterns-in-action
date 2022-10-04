package uz.bakhromjon.adapter;

import org.junit.jupiter.api.Test;

/**
 * @author : Bakhromjon Khasanboyev
 * @username: @xbakhromjon
 * @since : 04/10/22, Tue, 09:05
 **/
public class AdapterTest {

    @Test
    public void adapterTest() {
        Orange orange = new MoroOrange();
        Apple apple = new AppleAdapter(orange);
        System.out.println(apple.getVariety());
        apple.eat();
    }
}
