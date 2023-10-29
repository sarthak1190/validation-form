package com.formvalidate.validationform.Entities;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class LoginData {
    
    @NotBlank(message = "Username can't be empty !!")
    @Size(min = 3, max = 12, message = "Username must be in between 3-12 characters !!")
    private String userName;

    @Email(regexp = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$")
    private String email;
    private String password;
    @AssertTrue(message = "Must agree terms and conditions.")
    private boolean agreed;
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public boolean isAgreed() {
        return agreed;
    }
    public void setAgreed(boolean agreed) {
        this.agreed = agreed;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    @Override
    public String toString() {
        return "LoginData [userName=" + userName + ", email=" + email + ", password=" + password + "]";
    }

    
}
