package com.flashh.model;

import com.flashh.enums.UserLevel;

public class Player extends User {

    public Player(String name, String email, String password, UserLevel level) {
        super(name, email, password, level);
    }

    public void setName(String name) {
        super.name = name;
    }

    public String getName() {
        return super.name;
    }

    public void setEmail(String email) {
        super.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPassword(String password) {
        super.password = password;
    }

    public String getPassword() {
        return password;
    }
}
