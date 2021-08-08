package entities;

import javax.persistence.Embeddable;

public class Visitor extends User{

    public Visitor(String name, String lastName, int age, String address, String neighbourhood, String city, String state, String rg,
                   String cpf, String profission, String maritalStatus, String phone, String cellPhone) throws Exception {
        super(name, lastName, age, address, neighbourhood, city, state, rg, cpf, profission, maritalStatus, phone, cellPhone);
    }

    @Override
    protected boolean shouldValidateAge() { return false; }

    @Override
    protected boolean shouldValidateAddress() { return false;}

    @Override
    protected boolean shouldValidateCellPhone() throws Exception { return true;}

    @Override
    protected boolean shouldValidateCity() { return true; }

    @Override
    protected boolean shouldValidateState() { return true;}

    @Override
    protected boolean shouldValidateRg() { return false; }

    @Override
    protected boolean shouldValidateCpf() { return false; }

    @Override
    protected String getInstanceAsString() {
        return "Visitor";
    }

}
