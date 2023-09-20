package dev.isudha.emicalculator.services;

import dev.isudha.emicalculator.models.Customer;
import dev.isudha.emicalculator.models.Emi;
import dev.isudha.emicalculator.models.EmiPaymentStatus;
import dev.isudha.emicalculator.repositories.EmiRepo;

public class EmiService {

    private EmiRepo emiRepo;

    public EmiService(EmiRepo emiRepo){
        this.emiRepo = emiRepo;
    }

    public Emi createEmi(Customer customer, String loanId, double amount){
        Emi emi;
        if(customer.getAccountNum() != loanId){
            emi = new Emi(loanId, amount, EmiPaymentStatus.FAILED);
        } else {
            emi = new Emi(loanId, amount, EmiPaymentStatus.PAID);
        }
        return emiRepo.save(emi);
    }

    public Emi getEmi(Long id){
        return emiRepo.get(id);
    }

}
