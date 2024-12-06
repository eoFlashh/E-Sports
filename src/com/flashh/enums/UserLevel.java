package com.flashh.enums;

public enum UserLevel {
    BASIC ("basic"),
    ADVANCED ("advanced"),
    ADMIN ("admin");

    private String status;

    UserLevel(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
