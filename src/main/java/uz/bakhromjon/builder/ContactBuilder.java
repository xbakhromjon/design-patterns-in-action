package uz.bakhromjon.builder;

/**
 * @author : Bakhromjon Khasanboyev
 * @username: @xbakhromjon
 * @since : 03/10/22, Mon, 08:41
 **/
public class ContactBuilder {
    private String firstName;
    private String lastName;
    private String email;

    public ContactBuilder() {
    }

    public ContactBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public ContactBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public ContactBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public Contact build() {
        return new Contact(firstName, lastName, email);
    }
}
