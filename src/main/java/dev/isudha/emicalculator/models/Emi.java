package dev.isudha.emicalculator.models;

public class Emi extends BaseModel{
    private String loanId;
    private double emiAmount;
    private EmiPaymentStatus emiPaymentStatus;

    public Emi(final String loanId, final double emiAmount, final EmiPaymentStatus emiPaymentStatus) {
        this.loanId = loanId;
        this.emiAmount = emiAmount;
        this.emiPaymentStatus = emiPaymentStatus;
    }
    public String getLoanId() {
        return loanId;
    }
    public void setLoanId(final String loanId) {
        this.loanId = loanId;
    }
    public double getEmiAmount() {
        return emiAmount;
    }
    public void setEmiAmount(final double emiAmount) {
        this.emiAmount = emiAmount;
    }
    public EmiPaymentStatus getEmiPaymentStatus() {
        return emiPaymentStatus;
    }
    public void setEmiPaymentStatus(final EmiPaymentStatus emiPaymentStatus) {
        this.emiPaymentStatus = emiPaymentStatus;
    }
}
