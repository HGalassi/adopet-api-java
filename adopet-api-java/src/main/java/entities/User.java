package entities;

public abstract class User {

    private String name;
    private String lastName;
    private int age;
    private String address;
    private String neighbourhood;
    private String city;
    private String state;
    private String rg;
    private String cpf;
    private String profission;
    private String maritalStatus;
    private String phone;
    private String cellPhone;

    public User(String name, String lastName, int age, String address, String neighbourhood, String city,
                String state, String rg, String cpf, String profission, String maritalStatus, String phone, String cellPhone) throws Exception {
            this.name = name;
            this.lastName = lastName;
            this.age = age;
            this.address = address;
            this.neighbourhood = neighbourhood;
            this.city = city;
            this.state = state;
            this.rg = rg;
            this.cpf = cpf;
            this.profission = profission;
            this.maritalStatus = maritalStatus;
            this.phone = phone;
            this.cellPhone = cellPhone;

            isNameValid();
            hasValidAge();
            hasValidAddress();
            hasValidCity();
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setNeighbourhood(String neighbourhood) {
        this.neighbourhood = neighbourhood;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setProfission(String profission) {
        this.profission = profission;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    private boolean isNameValid() throws Exception {
        if(name.length() <3 || name.isBlank())
            throw new Exception("Invalid Name");

        if(lastName.length() <3 || lastName.isBlank())
            throw new Exception("Invalid LastName");

        return true;
    }

    protected boolean hasValidAge() throws Exception {
        return this.shouldValidateAge() ? isAgeValid() : true;
    }

    private boolean isAgeValid() throws Exception {
        if (age < 18)
            throw new Exception("Invalid age paw");
        return true;
    }

    protected abstract boolean shouldValidateAge();

    protected boolean hasValidAddress() throws Exception {
        return this.shouldValidateAddress() ? isAddressValid() : true;
    }

    private boolean isAddressValid() throws Exception {
        if (address.length() < 15){
            throw new Exception("Invalid Address paw");
        }
        return true;
    }

    protected abstract boolean shouldValidateAddress();

    private boolean hasValidCity() throws Exception {
        if (city.isBlank() || city.length() < 3)
            throw new Exception ("Invalid City paw");

        return true;
    }

    protected String getFullName() {
        return name.concat(" ".concat(lastName));
    }

    protected void addFullName(String name, String lastName) {
        name.concat(" ".concat(lastName));
    }

    protected String getName() {
        return this.name;
    }

    protected abstract String getInstanceAsString();

}
