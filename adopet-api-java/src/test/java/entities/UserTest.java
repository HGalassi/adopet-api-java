package entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTest {

    @Test
    public void shouldReturnFullName(){
        String name = "a Name";
        String lastName = "a Last Name";
        int age = 25;
        String address = " Some Address Here";
        User user = new User(name,lastName,age,address);
        Assertions.assertTrue(user.getFullName(name,lastName).equals(name.concat(" ".concat(lastName))));
    }

    @Test
    public void shouldAddValidFullName(){
        String name = "a Name";
        String lastName = "a Last Name";
        int age = 25;
        String address = " Some Address Here";
        User user = new User(name,lastName,age,address);
        user.addFullName(name,lastName);
        Assertions.assertTrue(user.getFullName(name,lastName).equals(name.concat(" ".concat(lastName))));
    }

}
