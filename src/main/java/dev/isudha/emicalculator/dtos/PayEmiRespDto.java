package dev.isudha.emicalculator.dtos;

import dev.isudha.emicalculator.models.EmiPaymentStatus;

public class PayEmiRespDto {
    private EmiPaymentStatus paymentStatus;

    public PayEmiRespDto(final EmiPaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public EmiPaymentStatus getPaymentStatus() {
        return paymentStatus;
    }
    public void setPaymentStatus(final EmiPaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
}
