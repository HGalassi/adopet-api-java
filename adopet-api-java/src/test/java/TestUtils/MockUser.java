package TestUtils;

public class MockUser{

    private final String name;
    private final String lastName;
    private final int age;
    private final String address;
    private final String neighbourhood;
    private final String city;
    private final String state;
    private final String rg;
    private final String cpf;
    private final String profission;
    private final String maritalStatus;
    private final String phone;
    private final String cellPhone;

    public MockUser(UserBuilderTest builder) {
        this.name = builder.name;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.address = builder.address;
        this.neighbourhood = builder.neighbourhood;
        this.city = builder.city;
        this.state = builder.state;
        this.rg = builder.rg;
        this.cpf = builder.cpf;
        this.profission = builder.profission;
        this.maritalStatus = builder.maritalStatus;
        this.phone = builder.phone;
        this.cellPhone = builder.cellPhone;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getNeighbourhood() {
        return neighbourhood;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getRg() {
        return rg;
    }

    public String getCpf() {
        return cpf;
    }

    public String getProfission() {
        return profission;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public String getPhone() {
        return phone;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public static class UserBuilderTest{
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

        public MockUser build() {
            MockUser user =  new MockUser(this);
            return user;
        }

        public UserBuilderTest name(String name){
            this.name = name;
            return this;
        }

        public UserBuilderTest lastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        public UserBuilderTest age(int age){
            this.age = age;
            return this;
        }

        public UserBuilderTest address(String address){
            this.address = address;
            return this;
        }

        public UserBuilderTest neighbourhood(String neighbourhood){
            this.neighbourhood = neighbourhood;
            return this;
        }
        public UserBuilderTest city(String city){
            this.city = city;
            return this;
        }
        public UserBuilderTest state(String state){
            this.state = state;
            return this;
        }

        public UserBuilderTest rg(String rg){
            this.rg = rg;
            return this;
        }

        public UserBuilderTest cpf(String cpf){
            this.cpf = cpf;
            return this;
        }

        public UserBuilderTest profission(String profission){
            this.profission = profission;
            return this;
        }

        public UserBuilderTest maritalStatus(String maritalStatus){
            this.maritalStatus = maritalStatus;
            return this;
        }

        public UserBuilderTest phone(String phone){
            this.phone = phone;
            return this;
        }

        public UserBuilderTest cellPhone(String cellPhone){
            this.cellPhone = cellPhone;
            return this;
        }

    }
}
