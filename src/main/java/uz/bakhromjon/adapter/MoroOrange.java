package uz.bakhromjon.adapter;

/**
 * @author : Bakhromjon Khasanboyev
 * @username: @xbakhromjon
 * @since : 04/10/22, Tue, 09:04
 **/
public class MoroOrange implements Orange {
    @Override
    public String getVariety() {
        return "Moro Blood orange";
    }

    @Override
    public void eat() {
        System.out.println("Moro gets enjoyed");
    }

    @Override
    public void peel() {
        System.out.println("Moro gets peeled");
    }

    @Override
    public void juice() {
        System.out.println("Moro gets juiced");
    }
}
