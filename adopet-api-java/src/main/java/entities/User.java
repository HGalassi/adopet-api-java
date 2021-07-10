package entities;

public class User {

    private final String name;
    private final String lastName;
    private final int age;
    private final String address;

    public User(String name, String lastName, int age, String address) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
    }

    public String getFullName(String name, String lastName) {
        return name.concat(" ".concat(lastName));
    }

    public void addFullName(String name, String lastName) {
        name.concat(" ".concat(lastName));
    }
}
