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

    @Test
    public void shoudTestCellPhoneWhenAdopter() throws Exception {
        MockUser mock = new MockUser.UserBuilderTest().cellPhone("119873602").build();
        when(() ->  utils.getNew("Adopter", mock));
        then(caughtException()).isInstanceOf(Exception.class).hasMessage("Invalid CellPhone paw");
    }

    @Test
    public void shoudTestPhoneMaskWhenAdopterSuccess() throws Exception {
        MockUser mock = new MockUser.UserBuilderTest().cellPhone("11987360259").build();
        Assertions.assertTrue(utils.getNew("Adopter", mock).getCellPhone().equals("(11)98736-0259"));
    }

    @Test
    public void shoudTestPhoneMaskWhenVisitorSuccess() throws Exception {
        MockUser mock = new MockUser.UserBuilderTest().cellPhone("11987360259").build();
        Assertions.assertTrue(utils.getNew("Visitor", mock).getCellPhone().equals("(11)98736-0259"));
    }

    @Test
    public void shoudTestPhoneMaskWhenCaretakerSuccess() throws Exception {
        MockUser mock = new MockUser.UserBuilderTest().cellPhone("11987360259").build();
        Assertions.assertTrue(utils.getNew("Caretaker", mock).getCellPhone().equals("(11)98736-0259"));
    }

    @Test
    public void shoudTestCityWhenAdopterAndThrowException() throws Exception {
        MockUser mock = new MockUser.UserBuilderTest().city("").build();
        when(() ->  utils.getNew("Adopter", mock));
        then(caughtException()).isInstanceOf(Exception.class).hasMessage("Invalid City paw");
    }

    @Test
    public void shoudTestCityWhenCaretakerAndThrowException() throws Exception {
        MockUser mock = new MockUser.UserBuilderTest().city("").build();
        when(() ->  utils.getNew("Caretaker", mock));
        then(caughtException()).isInstanceOf(Exception.class).hasMessage("Invalid City paw");
    }

    @Test
    public void shoudTestCityWhenVisitorAndThrowException() throws Exception {
        MockUser mock = new MockUser.UserBuilderTest().city("").build();
        when(() ->  utils.getNew("Visitor", mock));
        then(caughtException()).isInstanceOf(Exception.class).hasMessage("Invalid City paw");
    }

    @Test public void shouldTestCityWhenAdopterSuccess() throws Exception {
        MockUser mock = new MockUser.UserBuilderTest().city("Jundicity").build();
        Assertions.assertTrue(utils.getNew("Adopter", mock).getCity().equals("Jundicity"));
    }

    @Test public void shouldTestCityWhenCaretakerSuccess() throws Exception {
        MockUser mock = new MockUser.UserBuilderTest().city("Jundicity").build();
        Assertions.assertTrue(utils.getNew("Caretaker", mock).getCity().equals("Jundicity"));
    }

    @Test public void shouldTestCityWhenVisitorSuccess() throws Exception {
        MockUser mock = new MockUser.UserBuilderTest().city("Jundicity").build();
        Assertions.assertTrue(utils.getNew("Visitor", mock).getCity().equals("Jundicity"));
    }

    @Test
    public void shoudTestStateWhenAdopterAndThrowException() throws Exception {
        MockUser mock = new MockUser.UserBuilderTest().state("").build();
        when(() ->  utils.getNew("Adopter", mock));
        then(caughtException()).isInstanceOf(Exception.class).hasMessage("Invalid State paw");
    }

    @Test
    public void shoudTestStateWhenCaretakerAndThrowException() throws Exception {
        MockUser mock = new MockUser.UserBuilderTest().state("").build();
        when(() ->  utils.getNew("Caretaker", mock));
        then(caughtException()).isInstanceOf(Exception.class).hasMessage("Invalid State paw");
    }

    @Test
    public void shoudTestStateWhenVisitorAndThrowException() throws Exception {
        MockUser mock = new MockUser.UserBuilderTest().state("ABC").build();
        when(() ->  utils.getNew("Visitor", mock));
        then(caughtException()).isInstanceOf(Exception.class).hasMessage("Invalid State paw");
    }

    @Test public void shouldTestStateWhenVisitorSuccess() throws Exception {
        MockUser mock = new MockUser.UserBuilderTest().state("SP").build();
        Assertions.assertTrue(utils.getNew("Visitor", mock).getState().equals("SP"));
    }

    @Test public void shouldTestStateWhenCaretakerSuccess() throws Exception {
        MockUser mock = new MockUser.UserBuilderTest().state("SC").build();
        Assertions.assertTrue(utils.getNew("Caretaker", mock).getState().equals("SC"));
    }

    @Test public void shouldTestStateWhenAdopterSuccess() throws Exception {
        MockUser mock = new MockUser.UserBuilderTest().state("BA").build();
        Assertions.assertTrue(utils.getNew("Visitor", mock).getState().equals("BA"));
    }

    @Test
    public void shoudTestRgWhenAdopterAndThrowException() throws Exception {
        MockUser mock = new MockUser.UserBuilderTest().rg("12345678").build();
        when(() ->  utils.getNew("Adopter", mock));
        then(caughtException()).isInstanceOf(Exception.class).hasMessage("Invalid RG paw");
    }

    @Test
    public void shoudTestRgWhenCaretakerAndThrowException() throws Exception {
        MockUser mock = new MockUser.UserBuilderTest().rg("").build();
        when(() ->  utils.getNew("Caretaker", mock));
        then(caughtException()).isInstanceOf(Exception.class).hasMessage("Invalid RG paw");
    }

    @Test
    public void shoudTestRgWhenVisitorNotAndThrowException() throws Exception {
        MockUser mock = new MockUser.UserBuilderTest().rg("").build();
        Assertions.assertTrue(utils.getNew("Visitor", mock).getName().equals("a Name"));
    }

    @Test
    public void shoudTestRgWhenAdopterAndReturnMaskedRg() throws Exception {
        MockUser mock = new MockUser.UserBuilderTest().rg("112223334").build();//   11.222.333-4
        Assertions.assertTrue(utils.getNew("Adopter", mock).getRg().equals("11.222.333-4"));
    }

    @Test
    public void shoudTestRgWhenCaretakerAndReturnMaskedRg() throws Exception {
        MockUser mock = new MockUser.UserBuilderTest().rg("112223334").build();
        Assertions.assertTrue(utils.getNew("Caretaker", mock).getRg().equals("11.222.333-4"));
    }


}
