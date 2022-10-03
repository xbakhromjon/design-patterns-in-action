package uz.bakhromjon.factory;

/**
 * @author : Bakhromjon Khasanboyev
 * @username: @xbakhromjon
 * @since : 03/10/22, Mon, 08:13
 **/
public interface Pet {
    void setName(String name);

    String getName();

    String getType();

    boolean isHungry();

    void feed();
}
