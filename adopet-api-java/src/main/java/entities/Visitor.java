package entities;

public class Visitor extends User{

    public Visitor(String name, String lastName, int age, String address, String neighbourhood, String city, String state, String rg,
                   String cpf, String profission, String maritalStatus, String phone, String cellPhone) throws Exception {
        super(name, lastName, age, address, neighbourhood, city, state, rg, cpf, profission, maritalStatus, phone, cellPhone);
    }

    @Override
    protected boolean shouldValidateAge() {
        return false;
    }

    @Override
    protected boolean shouldValidateAddress() {
        return false;
    }

    @Override
    protected String getInstanceAsString() {
        return "Visitor";
    }

}
