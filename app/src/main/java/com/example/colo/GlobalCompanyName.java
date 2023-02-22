package com.example.colo;

import android.app.Application;

public class GlobalCompanyName extends Application {


    private String loginEmail;
    private String loginPassword;
    private String globalCompanyName;

    public String getGlobalCompanyName() {
        return globalCompanyName;
    }

    public void setGlobalCompanyName(String companyName) {
        this.globalCompanyName = companyName;
    }


    public String getloginEmail() {
        return loginEmail;
    }

    public void setloginEmail(String email) {
        this.loginEmail = email;
    }


    public String getloginPassword() {
        return loginPassword;
    }

    public void setloginPassword(String password) {
        this.loginPassword = password;
    }

}
