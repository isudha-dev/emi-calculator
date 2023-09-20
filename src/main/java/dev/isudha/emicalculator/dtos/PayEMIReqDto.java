package dev.isudha.emicalculator.dtos;

import dev.isudha.emicalculator.models.Customer;

public class PayEMIReqDto {
    private Customer customer;
    private String accountNum;
    private double amount;

    public PayEMIReqDto( Customer customer, String accountNum, double amount) {
        this.customer = customer;
        this.accountNum = accountNum;
        this.amount = amount;
    }

    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(final Customer customer) {
        this.customer = customer;
    }
    public String getAccountNum() {
        return accountNum;
    }
    public void setAccountNum(final String accountNum) {
        this.accountNum = accountNum;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(final double amount) {
        this.amount = amount;
    }
}
