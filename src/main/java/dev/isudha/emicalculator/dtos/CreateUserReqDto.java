package dev.isudha.emicalculator.dtos;

import dev.isudha.emicalculator.models.UserType;

public class CreateUserReqDto {
    private String name;
    private UserType type;

    public CreateUserReqDto(final String name, final UserType type) {
        this.name = name;
        this.type = type;
    }
    public String getName() {
        return name;
    }
    public void setName(final String name) {
        this.name = name;
    }
    public UserType getType() {
        return type;
    }
    public void setType(final UserType type) {
        this.type = type;
    }
}
