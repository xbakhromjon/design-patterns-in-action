package uz.bakhromjon.factory;

/**
 * @author : Bakhromjon Khasanboyev
 * @username: @xbakhromjon
 * @since : 03/10/22, Mon, 08:13
 **/
public class Dog implements Pet {
    private String name;
    private final String type = "DOG";

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public boolean isHungry() {
        return false;
    }

    @Override
    public void feed() {

    }
}
