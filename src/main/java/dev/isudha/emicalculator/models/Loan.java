package dev.isudha.emicalculator.models;

import java.util.List;

public class Loan extends BaseModel{
    private String customerUsername;
    private String adminUsername;
    private double principle;
    private double interestRate;
    private int year;
    private int tenure;

    private double totalLoanInterest;
    private double totalPayment;

    private double emiAmount;

    private List<Emi> paidEMIs;

    public Loan(){

    }
    public Loan(final String customerUsername, final String adminUsername, final double principle, final double interestRate, final int year, final int tenure) {
        this.customerUsername = customerUsername;
        this.adminUsername = adminUsername;
        this.principle = principle;
        this.interestRate = interestRate;
        this.year = year;
        this.tenure = tenure;
    }
    public double getTotalLoanInterest() {
        return totalLoanInterest;
    }
    public void setTotalLoanInterest(final double totalLoanInterest) {
        this.totalLoanInterest = totalLoanInterest;
    }
    public double getTotalPayment() {
        return totalPayment;
    }
    public void setTotalPayment(final double totalPayment) {
        this.totalPayment = totalPayment;
    }
    public double getEmiAmount() {
        return emiAmount;
    }
    public void setEmiAmount(final double emiAmount) {
        this.emiAmount = emiAmount;
    }
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
    public double getPrinciple() {
        return principle;
    }
    public void setPrinciple(final double principle) {
        this.principle = principle;
    }
    public double getInterestRate() {
        return interestRate;
    }
    public void setInterestRate(final double interestRate) {
        this.interestRate = interestRate;
    }
    public int getYear() {
        return year;
    }
    public void setYear(final int year) {
        this.year = year;
    }
    public int getTenure() {
        return tenure;
    }
    public void setTenure(final int tenure) {
        this.tenure = tenure;
    }
    public List<Emi> getPaidEMIs() {
        return paidEMIs;
    }
    public void setPaidEMIs(final List<Emi> paidEMIs) {
        this.paidEMIs = paidEMIs;
    }
    @Override public String toString() {
        return "Loan{" +
            "customerUsername='" + customerUsername + '\'' +
            ", adminUsername='" + adminUsername + '\'' +
            ", principle=" + principle +
            ", interestRate=" + interestRate +
            ", year=" + year +
            ", tenure=" + tenure +
            ", totalLoanInterest=" + totalLoanInterest +
            ", totalPayment=" + totalPayment +
            ", emiAmount=" + emiAmount +
            '}';
    }

    /*
    Adminuser
	CustomerUser
	Principal
	InterestRate
	Year
	Tenure
	TotalRepayment
List<EMI> paidEMIs

     */

}
