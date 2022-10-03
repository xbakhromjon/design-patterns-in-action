package uz.bakhromjon.singleton;

/**
 * @author : Bakhromjon Khasanboyev
 * @username: @xbakhromjon
 * @since : 03/10/22, Mon, 08:57
 **/
public class SingA {
    private static SingA instance;


    public static SingA getInstance() {
        if (instance == null) {
            synchronized (SingA.class) {
                if (instance == null) {
                    instance = new SingA();
                }
            }
        }
        return instance;
    }
}
