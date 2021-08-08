package sql;

import config.AdopetApiSpring;
import org.junit.jupiter.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import repository.UserRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {AdopetApiSpring.class})
//@Sql({"/employees_schema.sql", "/import_employees.sql"})
public class UserSqlTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testLoadDataForTestClass(){
        Assertions.assertTrue( userRepository.findAll().size() == 1);
    }

}
