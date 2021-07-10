package entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


import static com.googlecode.catchexception.apis.BDDCatchException.caughtException;
import static com.googlecode.catchexception.apis.BDDCatchException.when;
import static org.assertj.core.api.BDDAssertions.then;
import static org.mockito.BDDMockito.given;

public class UserTest {

    @Test
    public void shouldReturnFullName() throws Exception {
        String name = "a Name";
        String lastName = "a Last Name";
        int age = 25;
        String address = " Some Address Here";
        User user = new User(name,lastName,age,address);
        Assertions.assertTrue(user.getFullName(name,lastName).equals(name.concat(" ".concat(lastName))));
    }

    @Test
    public void shouldAddValidFullName() throws Exception {
        String name = "a Name";
        String lastName = "a Last Name";
        int age = 25;
        String address = " Some Address Here";
        User user = new User(name,lastName,age,address);
        user.addFullName(name,lastName);
        Assertions.assertTrue(user.getFullName(name,lastName).equals(name.concat(" ".concat(lastName))));
    }

    @Test
    public void shouldReturnOnlyFirstName() throws Exception {
        String name = "a Name";
        String lastName = "a Last Name";
        int age = 25;
        String address = " Some Address Here";
        User user = new User(name,lastName,age,address);

        Assertions.assertTrue(user.getName().equals("a Name"));
    }


    //https://gist.github.com/mariuszs/7489190 sample
    @Test
    public void shouldReturnValidatedAge() throws Exception {
        String name = "a Name";
        String lastName = "a Last Name";
        int age = 15;
        String address = " Some Address Here";

        when(() -> new User(name,lastName,age,address));
        then(caughtException()).isInstanceOf(Exception.class).hasMessage("deu ruim");
    }
}
