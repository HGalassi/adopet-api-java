package entities;

public class Adopter extends User{
    
    public Adopter(String name, String lastName, int age, String address, String neighbourhood, String city, String state, String rg,
                   String cpf, String profission, String maritalStatus, String phone, String cellPhone) throws Exception {
        super(name, lastName, age, address, neighbourhood, city, state, rg, cpf, profission, maritalStatus, phone, cellPhone);

        if(phone.isBlank())
            throw new Exception("Invalid Phone paw");
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
    protected boolean shouldValidateCellPhone() { return true;}

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
        return "Adopter";
    }
}
