package dev.isudha.emicalculator.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import dev.isudha.emicalculator.exceptions.UserPermissionException;
import dev.isudha.emicalculator.models.Loan;
import dev.isudha.emicalculator.models.User;
import dev.isudha.emicalculator.models.UserType;
import dev.isudha.emicalculator.repositories.LoanRepository;

public class LoanService {

    private LoanRepository loanRepository;

    public LoanService(LoanRepository loanRepository){
        this.loanRepository = loanRepository;
    }

    public Loan createLoan(User user, Loan loan){
        if(user.getUserType()!= UserType.ADMIN){
            throw new UserPermissionException("User is not admin, can't create loan");
        }
        double totalLoanInterest = loan.getPrinciple() * loan.getInterestRate()* loan.getTenure();
        double totalPayment = totalLoanInterest + loan.getPrinciple();
        double emiAmount = totalPayment/ (loan.getInterestRate()*12);
        loan.setTotalLoanInterest(totalLoanInterest);
        loan.setTotalPayment(totalPayment);
        loan.setEmiAmount(emiAmount);
        return loanRepository.save(loan);
    }

    public Loan getLoan(Long id){
        return loanRepository.get(id);
    }

    public List<Loan> getAllLoans(User user){
        if(!user.getUserType().equals(UserType.ADMIN)){
            throw new RuntimeException("You are not admin user");
        }
        List<Loan> loans = new ArrayList<>();
        Map<Long, Loan> loansMap = loanRepository.getAllLoans();

        for (Map.Entry<Long, Loan> entry: loansMap.entrySet()){
            loans.add(entry.getValue());
        }
        return loans;
    }

}
