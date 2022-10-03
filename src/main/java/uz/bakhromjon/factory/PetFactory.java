package uz.bakhromjon.factory;

import org.springframework.stereotype.Component;

/**
 * @author : Bakhromjon Khasanboyev
 * @username: @xbakhromjon
 * @since : 03/10/22, Mon, 08:15
 **/
@Component
public class PetFactory {
    public Pet create(String animalType) {
        return switch (animalType.toLowerCase()) {
            case "dog" -> new Dog();
            case "cat" -> new Cat();
            default -> {
                throw new UnsupportedOperationException("Unknown type");
            }
        };
    }
}
