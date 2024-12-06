package com.flashh.enums;

public enum TournamentType {
    REGIONAL ("regional"),
    INTERNATIONAL ("international"),
    FRIENDLY ("friendly"),
    ELIMINATORY ("eliminatory");

    private String status;

    TournamentType(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
