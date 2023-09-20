package dev.isudha.emicalculator.dtos;

import dev.isudha.emicalculator.models.User;

public class CreateUserRespDto {
    private User user ;

    public CreateUserRespDto(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }
    public void setUser(final User user) {
        this.user = user;
    }
}
