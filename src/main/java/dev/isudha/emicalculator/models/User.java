package dev.isudha.emicalculator.models;

public abstract class User extends BaseModel{
    private String userName;
    private String name;
    private UserType userType;
    public User(final String userName, final UserType userType) {
        this.userName = userName;
        this.userType = userType;
    }

    public String getUserName() {
        return userName;
    }
    public void setUserName(final String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }
    public void setName(final String name) {
        this.name = name;
    }
    public UserType getUserType() {
        return userType;
    }
    public void setUserType(final UserType userType) {
        this.userType = userType;
    }
}
