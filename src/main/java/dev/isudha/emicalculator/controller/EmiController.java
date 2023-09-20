package dev.isudha.emicalculator.controller;

import dev.isudha.emicalculator.dtos.PayEMIReqDto;
import dev.isudha.emicalculator.dtos.PayEmiRespDto;
import dev.isudha.emicalculator.models.Emi;
import dev.isudha.emicalculator.services.EmiService;

public class EmiController {
    private EmiService emiService;

    public EmiController(EmiService emiService){
        this.emiService = emiService;
    }


    public PayEmiRespDto makeEmiPayment(PayEMIReqDto reqDto){
        Emi emi = emiService.createEmi(reqDto.getCustomer(), reqDto.getAccountNum(), reqDto.getAmount());
        PayEmiRespDto respDto = new PayEmiRespDto(emi.getEmiPaymentStatus());
        return respDto;
    }

}
