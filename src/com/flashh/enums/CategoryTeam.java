package com.flashh.enums;

public enum CategoryTeam  {
    AMATEUR("amateur"),
    PROFESSIONAL("professional"),
    MIXED("mixed");

    private final String description;

    CategoryTeam(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
