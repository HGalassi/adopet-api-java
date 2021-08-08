package entities;

import javax.persistence.Id;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class User  {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id ;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false, name = "last_name")
    private String lastName;
    @Column(nullable = false)
    private int age;
    @Column(nullable = false)
    private String address;
    @Column(nullable = false)
    private String neighbourhood;
    @Column(nullable = false)
    private String city;
    @Column(nullable = false)
    private String state;
    @Column(nullable = false)
    private String rg;
    @Column(nullable = false)
    private String cpf;
    @Column(nullable = false)
    private String profission;
    @Column(nullable = false, name = "marital_status")
    private String maritalStatus;
    @Column(nullable = false)
    private String phone;
    @Column(nullable = false, name = "cell_phone")
    private String cellPhone;
    @JoinColumn
    private Long adopterId;


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
            hasValidCellPhone();
            hasValidState();
            hasValidRg();
            hasValidCpf();
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

    private boolean hasValidCellPhone() throws Exception {
        return this.shouldValidateCellPhone() ? isCellPhoneValid() : true;
    }

    protected abstract boolean shouldValidateCellPhone() throws Exception;

    private boolean isCellPhoneValid() throws Exception {
        if (cellPhone.length() < 11){
            throw new Exception("Invalid CellPhone paw");
        }

        formatCellphone();
        return true;
    }

    private void formatCellphone() {
        cellPhone = cellPhone.replaceFirst("(\\d{2})(\\d{5})(\\d+)", "($1)$2-$3");
    }


    private boolean hasValidRg() throws Exception {
        return this.shouldValidateRg()?  isValidRg() : true;
    }

    private boolean isValidRg() throws Exception {
        if(rg.isBlank() || rg.length() != 9){
            throw new Exception("Invalid RG paw");
        }

        formatRG();
        return true;
    }

    protected abstract boolean shouldValidateRg();

    private void formatRG() {
        rg = rg.replaceFirst("(\\d{2})(\\d{3})(\\d{3})(\\d+)", "$1.$2.$3-$4");
    }

    private void formatCPF() {
        this.cpf = cpf.replaceFirst("(\\d{3})(\\d{3})(\\d{3})(\\d+)", "$1.$2.$3-$4");
    }

    private boolean hasValidCity() throws Exception {
        return this.shouldValidateCity()? isValidCity() : true;
    }

    protected abstract boolean shouldValidateCity();

    private boolean isValidCity()throws Exception {
        if (city.isBlank() || city.length() < 3)
            throw new Exception ("Invalid City paw");

        return true;
    }

    private boolean hasValidState() throws Exception{
        return this.shouldValidateState()? isValidState() : true;
    }

    private boolean isValidState() throws Exception{
        if(state.isBlank() || state.length()!= 2){
            throw new Exception("Invalid State paw");
        }

        return true;
    }

    protected abstract boolean shouldValidateState();
    
    private boolean hasValidCpf() throws Exception{
        return this.shouldValidateCpf()? isValidCpf() : true;
    }

    private boolean isValidCpf() throws Exception {
        if(cpf.isBlank() || cpf.length()!=11){
            throw new Exception("Wrong CPF paw");
        }
        formatCPF();
        return true;
    }

    protected abstract boolean shouldValidateCpf();


    protected String getFullName() {
        return name.concat(" ".concat(lastName));
    }

    protected void addFullName(String name, String lastName) {
        name.concat(" ".concat(lastName));
    }

    protected String getName() {
        return this.name;
    }

    protected String getCellPhone() { return this.cellPhone;}

    protected abstract String getInstanceAsString();

    public int getAge() { return age; }

    public String getAddress() { return address; }

    public String getNeighbourhood() { return neighbourhood; }

    public String getCity() { return city; }

    public String getState() { return state; }

    public String getRg() { return rg; }

    public String getCpf() { return cpf; }

    public String getProfission() { return profission; }

    public String getMaritalStatus() { return maritalStatus; }

    public String getPhone() { return phone;}

    public Long getId() {return id;}

}
