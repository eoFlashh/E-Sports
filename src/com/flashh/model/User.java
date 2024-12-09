package com.flashh.model;

import com.flashh.enums.UserLevel;

import java.time.LocalDateTime;
import java.util.UUID;

public abstract class User {
    protected UUID id;
    protected String name;
    protected String email;
    protected String password;
    protected UserLevel level;
    protected LocalDateTime creationDate;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", level=" + level +
                ", creationDate=" + creationDate +
                '}';
    }

    public User(String name, String email, String password, UserLevel level) {
        if (name == null || email == null || password == null || level == null){
            throw new NullPointerException();
        }
        this.id = UUID.randomUUID();
        this.name = name;
        this.email = email;
        this.password = password;
        this.level = level;
        this.creationDate = LocalDateTime.now();
    }
}
