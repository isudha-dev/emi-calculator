package dev.isudha.emicalculator.dtos;

public class CreateLoanReqDto {
    //admin_username, customer_username, principal amount, interest rate and time

    private String customerUsername;
    private String adminUsername;
    private double principal;
    private double rate;
    private int tenure;

    public String getCustomerUsername() {
        return customerUsername;
    }
    public void setCustomerUsername(final String customerUsername) {
        this.customerUsername = customerUsername;
    }
    public String getAdminUsername() {
        return adminUsername;
    }
    public void setAdminUsername(final String adminUsername) {
        this.adminUsername = adminUsername;
    }
    public double getPrincipal() {
        return principal;
    }
    public void setPrincipal(final double principal) {
        this.principal = principal;
    }
    public double getRate() {
        return rate;
    }
    public void setRate(final double rate) {
        this.rate = rate;
    }
    public int getTenure() {
        return tenure;
    }
    public void setTenure(final int tenure) {
        this.tenure = tenure;
    }
}
