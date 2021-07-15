package dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserDto {

    @JsonProperty
    private String name;
    @JsonProperty
    private String lastName;
    @JsonProperty
    private int age;
    @JsonProperty
    private String address;
    @JsonProperty
    private String neighbourhood;
    @JsonProperty
    private String city;
    @JsonProperty
    private String state;
    @JsonProperty
    private String rg;
    @JsonProperty
    private String cpf;
    @JsonProperty
    private String profission;
    @JsonProperty
    private String maritalStatus;
    @JsonProperty
    private String phone;
    @JsonProperty
    private String cellPhone;

    public UserDto(String name, String lastName, int age, String address, String neighbourhood, String city, String state, String rg, String cpf,
                   String profission, String maritalStatus, String phone, String cellPhone) {
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
    }

    public UserDto(){};
}
