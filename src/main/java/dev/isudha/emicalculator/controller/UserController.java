package dev.isudha.emicalculator.controller;

import dev.isudha.emicalculator.dtos.CreateLoanRespDto;
import dev.isudha.emicalculator.dtos.CreateUserReqDto;
import dev.isudha.emicalculator.dtos.CreateUserRespDto;
import dev.isudha.emicalculator.dtos.PayEMIReqDto;
import dev.isudha.emicalculator.dtos.PayEmiRespDto;
import dev.isudha.emicalculator.models.User;
import dev.isudha.emicalculator.services.UserService;

public class UserController {

    private UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    public CreateUserRespDto createUser(CreateUserReqDto reqDto){

        User user =userService.createuser(reqDto.getName(), reqDto.getType());
        CreateUserRespDto respDto = new CreateUserRespDto(user);
        return respDto;

    }


}
