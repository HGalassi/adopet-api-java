package entities;

import TestUtils.MockUser;
import TestUtils.UserUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.googlecode.catchexception.apis.BDDCatchException.caughtException;
import static com.googlecode.catchexception.apis.BDDCatchException.when;
import static org.assertj.core.api.BDDAssertions.then;

public class UserTest {

    UserUtils utils = new UserUtils();

    @Test
    public void shouldThrowNameErrorWhenAdopter() throws Exception {
        MockUser mock = new MockUser.UserBuilderTest().name("").build();
        when(() ->  utils.getNew("Adopter", mock));
        then(caughtException()).isInstanceOf(Exception.class).hasMessage("Invalid Name");
    }

    @Test
    public void shouldThrowLastNameErrorWhenAdopter() throws Exception {
        MockUser mock = new MockUser.UserBuilderTest().lastName("").build();
        when(() ->  utils.getNew("Adopter", mock));
        then(caughtException()).isInstanceOf(Exception.class).hasMessage("Invalid LastName");
    }

    @Test
    public void shouldThrowAgeErrorWhenAdopter() throws Exception {
        MockUser mock = new MockUser.UserBuilderTest().age(15).build();
        when(() ->  utils.getNew("Adopter", mock));
        then(caughtException()).isInstanceOf(Exception.class).hasMessage("Invalid age paw");
    }

    @Test
    public void shouldThrowAddressErrorWhenAdopter() throws Exception {
        MockUser mock = new MockUser.UserBuilderTest().address("").build();
        when(() ->  utils.getNew("Adopter", mock));
        then(caughtException()).isInstanceOf(Exception.class).hasMessage("Invalid Address paw");
    }

    @Test
    public void shouldThrowNameErrorWhenCaretaker() throws Exception {
        MockUser mock = new MockUser.UserBuilderTest().name("").build();
        when(() ->  utils.getNew("Caretaker", mock));
        then(caughtException()).isInstanceOf(Exception.class).hasMessage("Invalid Name");
    }

    @Test
    public void shouldThrowLastNameErrorWhenCaretaker() throws Exception {
        MockUser mock = new MockUser.UserBuilderTest().lastName("").build();
        when(() ->  utils.getNew("Adopter", mock));
        then(caughtException()).isInstanceOf(Exception.class).hasMessage("Invalid LastName");
    }


    @Test
    public void shouldThrowAgeErrorWhenCaretaker() throws Exception {
        MockUser mock = new MockUser.UserBuilderTest().age(15).build();
        when(() ->  utils.getNew("Caretaker", mock));
        then(caughtException()).isInstanceOf(Exception.class).hasMessage("Invalid age paw");
    }

    @Test
    public void shouldThrowAddressErrorWhenCaretaker() throws Exception {
        MockUser mock = new MockUser.UserBuilderTest().address("").build();
        when(() ->  utils.getNew("Caretaker", mock));
        then(caughtException()).isInstanceOf(Exception.class).hasMessage("Invalid Address paw");
    }

    @Test
    public void shouldNotThrowNameErrorWhenVisitor() throws Exception {
        MockUser mock = new MockUser.UserBuilderTest().name("").build();
        when(() ->  utils.getNew("Visitor", mock));
        then(caughtException()).isInstanceOf(Exception.class).hasMessage("Invalid Name");
    }

    @Test
    public void shouldNotThrowLastNameErrorWhenVisitor() throws Exception {
        MockUser mock = new MockUser.UserBuilderTest().lastName("").build();
        when(() ->  utils.getNew("Visitor", mock));
        then(caughtException()).isInstanceOf(Exception.class).hasMessage("Invalid LastName");
    }

    @Test
    public void shouldNotThrowAgeErrorWhenVisitor() throws Exception {
        MockUser mock = new MockUser.UserBuilderTest().name("a Name").lastName("a Last Name").age(15).build();
        Assertions.assertTrue(utils.getNew("Visitor", mock).getFullName().equals("a Name".concat(" ".concat("a Last Name"))));
    }

    @Test
    public void shouldNotThrowAddressErrorWhenVisitor() throws Exception {
        MockUser mock = new MockUser.UserBuilderTest().name("a Name").lastName("a Last Name").age(15).build();
        Assertions.assertTrue(utils.getNew("Visitor", mock).getFullName().equals("a Name".concat(" ".concat("a Last Name"))));
    }
}
