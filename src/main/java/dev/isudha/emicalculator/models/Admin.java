package dev.isudha.emicalculator.models;

public class Admin extends User{

    public Admin(final String accountNum) {
        super(accountNum, UserType.ADMIN);
    }


}
