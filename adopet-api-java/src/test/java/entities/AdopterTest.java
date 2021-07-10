package entities;

import TestUtils.MockUser;
import TestUtils.UserUtils;
import org.junit.jupiter.api.Test;

import static com.googlecode.catchexception.apis.BDDCatchException.caughtException;
import static com.googlecode.catchexception.apis.BDDCatchException.when;
import static org.assertj.core.api.BDDAssertions.then;

public class AdopterTest {

    UserUtils utils = new UserUtils();

    @Test
    public void shouldThrowPhoneErrorWhenAdopter() throws Exception {
        MockUser mock = new MockUser.UserBuilderTest().phone("").build();
        when(() ->  utils.getNew("Adopter", mock));
        then(caughtException()).isInstanceOf(Exception.class).hasMessage("Invalid Phone paw");
    }
}
