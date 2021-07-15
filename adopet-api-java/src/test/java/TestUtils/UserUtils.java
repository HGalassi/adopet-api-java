package TestUtils;

import entities.Adopter;
import entities.Caretaker;
import entities.User;
import entities.Visitor;

public class UserUtils {


    public User getNew(String userOf, MockUser mock) throws Exception {
        String name = null == mock.getName() ? "a Name" : mock.getName();
        String lastName = null == mock.getLastName() ? "a last Name" : mock.getLastName();
        int age = mock.getAge() <= 0 ? 25 : mock.getAge();
        String address = null == mock.getAddress()? "some Addres here and i hope this adrress is ok because this test must succeed" : mock.getAddress();
        String neighbourhood = null == mock.getNeighbourhood() ? "Some neighbourhood here" : mock.getNeighbourhood();
        String city = null == mock.getCity() ? "Jundicity" : mock.getCity();
        String state = null == mock.getState() ? "SP" : mock.getState();
        String rg = null == mock.getRg() ? "001112223" : mock.getRg();
        String cpf = null == mock.getCpf() ? "11122233344" : mock.getCpf();
        String profission = null == mock.getProfission() ? "Fisher" : mock.getProfission();
        String maritalStatus = null == mock.getMaritalStatus() ? "Single" : mock.getMaritalStatus();
        String phone = null == mock.getPhone() ? "1111223344" : mock.getPhone();
        String cellPhone = null == mock.getCellPhone() ? "11999998888" : mock.getCellPhone();

        switch (userOf) {
            case "Adopter":
                return new Adopter(name, lastName, age, address, neighbourhood, city, state, rg, cpf, profission, maritalStatus, phone, cellPhone);
            case "Visitor":
                return new Visitor(name, lastName, age, address, neighbourhood, city, state, rg, cpf, profission, maritalStatus, phone, cellPhone);
            case "Caretaker":
                return new Caretaker(name, lastName, age, address, neighbourhood, city, state, rg, cpf, profission, maritalStatus, phone, cellPhone);

        }
        throw new Exception(" Invalid Type");
    }
}
