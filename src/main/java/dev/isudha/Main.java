package dev.isudha;

import java.util.List;
import dev.isudha.emicalculator.controller.EmiController;
import dev.isudha.emicalculator.controller.LoanController;
import dev.isudha.emicalculator.controller.UserController;
import dev.isudha.emicalculator.dtos.CreateLoanReqDto;
import dev.isudha.emicalculator.dtos.CreateLoanRespDto;
import dev.isudha.emicalculator.dtos.CreateUserReqDto;
import dev.isudha.emicalculator.dtos.CreateUserRespDto;
import dev.isudha.emicalculator.dtos.PayEMIReqDto;
import dev.isudha.emicalculator.dtos.PayEmiRespDto;
import dev.isudha.emicalculator.models.Customer;
import dev.isudha.emicalculator.models.Loan;
import dev.isudha.emicalculator.models.User;
import dev.isudha.emicalculator.models.UserType;
import dev.isudha.emicalculator.repositories.EmiRepo;
import dev.isudha.emicalculator.repositories.LoanRepository;
import dev.isudha.emicalculator.repositories.UserRepo;
import dev.isudha.emicalculator.services.EmiService;
import dev.isudha.emicalculator.services.LoanService;
import dev.isudha.emicalculator.services.UserService;

public class Main {

    public static void main(String[] args) {
        UserRepo userRepo = new UserRepo();
        UserService userService = new UserService(userRepo);
        UserController userController = new UserController(userService);

        CreateUserReqDto reqDto = new CreateUserReqDto("Admin1", UserType.ADMIN);
        CreateUserRespDto respDto = userController.createUser(reqDto);
        User admin = respDto.getUser();

        reqDto = new CreateUserReqDto("Customer1", UserType.CUSTOMER);
        respDto = userController.createUser(reqDto);
        Customer customer = (Customer) respDto.getUser();

        LoanRepository loanRepository = new LoanRepository();
        LoanService loanService = new LoanService(loanRepository);
        LoanController loanController = new LoanController(loanService);

        CreateLoanReqDto reqDto1 = new CreateLoanReqDto();
        reqDto1.setAdminUsername(admin.getUserName());
        reqDto1.setCustomerUsername(customer.getUserName());
        reqDto1.setPrincipal(5000.0);
        reqDto1.setRate(10);
        reqDto1.setTenure(1);

        CreateLoanRespDto respDto1 = loanController.createLoan(admin, reqDto1);
        Loan createdLoan = respDto1.getLoan();

        createdLoan.toString();

        EmiRepo emiRepo = new EmiRepo();
        EmiService emiService = new EmiService(emiRepo);
        EmiController emiController = new EmiController(emiService);

        PayEMIReqDto reqDto2 = new PayEMIReqDto(customer, customer.getAccountNum(), createdLoan.getEmiAmount());
        PayEmiRespDto respDto2 = emiController.makeEmiPayment(reqDto2);
        System.out.println(respDto2.getPaymentStatus());


        List<Loan> loans = loanService.getAllLoans(admin);
        for(Loan loan: loans){
            System.out.println(loan.toString());
        }




    }
}