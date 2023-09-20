package dev.isudha.emicalculator.models;

public class Customer extends User{
    private String accountNum;

    public Customer(String name, String accountNum){
        super(name, UserType.CUSTOMER);
        this.accountNum = accountNum;
    }

    public String getAccountNum() {
        return accountNum;
    }
    public void setAccountNum(final String accountNum) {
        this.accountNum = accountNum;
    }
}
