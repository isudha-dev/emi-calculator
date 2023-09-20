package dev.isudha.emicalculator.dtos;

import dev.isudha.emicalculator.models.Loan;

public class CreateLoanRespDto {
    private Loan loan;

    public CreateLoanRespDto(final Loan loan) {
        this.loan = loan;
    }

    public Loan getLoan() {
        return loan;
    }
    public void setLoan(final Loan loan) {
        this.loan = loan;
    }
}
