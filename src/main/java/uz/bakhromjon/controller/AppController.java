package uz.bakhromjon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uz.bakhromjon.builder.Contact;
import uz.bakhromjon.builder.ContactBuilder;
import uz.bakhromjon.factory.Pet;
import uz.bakhromjon.factory.PetFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Bakhromjon Khasanboyev
 * @username: @xbakhromjon
 * @since : 03/10/22, Mon, 08:19
 **/
@RestController
public class AppController {

    @Autowired
    private PetFactory petFactory;

    @GetMapping()
    public String getDefault() {
        return "{\"message\":\"Hello World!\"}";
    }

    @PostMapping("adoptPet/{type}/{name}")
    public Pet createPet(@PathVariable String type, @PathVariable String name) {
        Pet pet = petFactory.create(type);
        pet.setName(name);
        return pet;
    }

    @GetMapping("/presidents")
    public List<Contact> getPresidents() {
        List<Contact> contacts = new ArrayList<>();

        contacts.add(new ContactBuilder().setFirstName("George").setLastName("Washington").build());
        contacts.add(new ContactBuilder().setFirstName("John").setLastName("Adams").build());
        return contacts;
    }
}
