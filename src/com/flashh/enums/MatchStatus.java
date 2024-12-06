package com.flashh.enums;

public enum MatchStatus {
    SCHEDULED ("sheduled"),
    IN_PROGRESS ("in progress"),
    FINALIZED ("finalized"),
    CANCELLED ("cancelled");

    private String status;

    MatchStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
