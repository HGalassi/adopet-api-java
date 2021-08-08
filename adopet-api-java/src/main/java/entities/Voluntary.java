package entities;

import javax.persistence.Embeddable;

public abstract class Voluntary extends User {

    public Voluntary(String name, String lastName, int age, String address, String neighbourhood, String city, String state,
                     String rg, String cpf, String profission, String maritalStatus, String phone, String cellPhone) throws Exception {

        super(name, lastName, age, address, neighbourhood, city, state, rg, cpf, profission, maritalStatus, phone, cellPhone);
    }
}
