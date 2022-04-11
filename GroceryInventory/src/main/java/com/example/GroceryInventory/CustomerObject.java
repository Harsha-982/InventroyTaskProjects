package com.example.GroceryInventory;

import java.io.Serializable;

public class CustomerObject implements Serializable {
    private String Username;
    private String EmailAddress;

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        this.Username = username;
    }

    public String getEmailAddress() {
        return EmailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.EmailAddress = emailAddress;
    }

}
