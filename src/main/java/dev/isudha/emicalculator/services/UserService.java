package dev.isudha.emicalculator.services;

import java.util.Random;
import dev.isudha.emicalculator.models.Admin;
import dev.isudha.emicalculator.models.Customer;
import dev.isudha.emicalculator.models.Loan;
import dev.isudha.emicalculator.models.User;
import dev.isudha.emicalculator.models.UserType;
import dev.isudha.emicalculator.repositories.LoanRepository;
import dev.isudha.emicalculator.repositories.UserRepo;

public class UserService {

    private UserRepo userRepo;

    public UserService(UserRepo userRepo){
        this.userRepo = userRepo;
    }

    public User createuser(String name, UserType type){
        User user;
        if(type.equals(UserType.CUSTOMER)){
            String username = name+"Cust123";
            String acctNum = name+"Account123";
            user = new Customer(username, acctNum);
        } else {
            String username = name+"Admin123";
            user = new Admin(username);
        }
        return userRepo.save(user);
    }

    public User getUser(Long id){
        return userRepo.get(id);
    }

}
