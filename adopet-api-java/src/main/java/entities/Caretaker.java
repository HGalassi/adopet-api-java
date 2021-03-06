package entities;

import javax.persistence.Embeddable;

public class Caretaker extends User {

    public Caretaker(String name, String lastName, int age, String address, String neighbourhood, String city, String state,
                     String rg, String cpf, String profission, String maritalStatus, String phone, String cellPhone) throws Exception {
        super(name, lastName, age, address, neighbourhood, city, state, rg, cpf, profission, maritalStatus, phone, cellPhone);
    }

    @Override
    protected boolean shouldValidateAge() {
        return true;
    }

    @Override
    protected boolean shouldValidateAddress() {
        return true;
    }

    @Override
    protected boolean shouldValidateCellPhone() { return true; }

    @Override
    protected boolean shouldValidateCity() { return true; }

    @Override
    protected boolean shouldValidateState() { return true; }

    @Override
    protected boolean shouldValidateRg() { return true; }

    @Override
    protected boolean shouldValidateCpf() { return true; }

    @Override
    protected String getInstanceAsString() {
        return "Caretaker";
    }

}
