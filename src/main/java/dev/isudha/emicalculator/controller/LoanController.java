package dev.isudha.emicalculator.controller;

import java.util.List;
import dev.isudha.emicalculator.dtos.CreateLoanReqDto;
import dev.isudha.emicalculator.dtos.CreateLoanRespDto;
import dev.isudha.emicalculator.models.Loan;
import dev.isudha.emicalculator.models.User;
import dev.isudha.emicalculator.services.LoanService;

public class LoanController {

    private LoanService loanService;

    public LoanController(LoanService loanService){
        this.loanService = loanService;
    }

    public CreateLoanRespDto createLoan(User user, CreateLoanReqDto reqDto){

        Loan loan = new Loan();
        loan.setAdminUsername(reqDto.getAdminUsername());
        loan.setCustomerUsername(reqDto.getCustomerUsername());
        loan.setPrinciple(reqDto.getPrincipal());
        loan.setYear(reqDto.getTenure());
        loan.setInterestRate(reqDto.getRate());
        Loan createdLoan = loanService.createLoan(user, loan);

        return new CreateLoanRespDto(createdLoan);
    }

    public List<Loan> getAllLoans(User user){
        return loanService.getAllLoans(user);
    }


}
