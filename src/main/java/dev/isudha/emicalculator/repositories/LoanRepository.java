package dev.isudha.emicalculator.repositories;

import java.util.HashMap;
import java.util.Map;
import dev.isudha.emicalculator.models.Loan;

public class LoanRepository {
    private Map<Long, Loan> loans = new HashMap<>();
    private long count = 0l;

    public Loan save(Loan loan){
        count++;
        loan.setId(count);
        loans.put(count, loan);
        return loan;
    }

    public Loan get(Long id){
        return loans.get(id);
    }

    public Map<Long, Loan> getAllLoans(){
        return loans;
    }

}
