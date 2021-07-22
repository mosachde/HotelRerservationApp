package model;

import java.util.regex.Pattern;

public class Customer {

    private String firstName;
    private String lastName;
    private  String email;
    private final String emailRegex = "^(.+)@(.+)$";
    private final Pattern pattern = Pattern.compile(emailRegex);

    public Customer(String firstName, String lastName, String email) throws IllegalArgumentException {
        if(!pattern.matcher(email).matches()){
            throw new IllegalArgumentException(" Error, INVALID_EMAIL");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;

    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
