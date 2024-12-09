package com.flashh.model;

import com.flashh.enums.UserLevel;

import java.util.List;

public class Admin extends User {
    private String professionalEmail;
    private int accessLevel;
    private List<Team> moderatedTeams;
    private List<Tournament> moderatedTournaments;

    public Admin(String name, String email, String password, UserLevel level, String professionalEmail, int accessLevel) {
        super(name, email, password, level);
        this.professionalEmail = professionalEmail;
        this.accessLevel = accessLevel;
    }

    public void createTournament(Tournament tournament) {
        System.out.println("Tournament " + tournament.name + " created.");
    }

    public void deleteTournament(Tournament tournament) {
        System.out.println("Tournament " + tournament.name + " deleted.");
    }

    public void banUser(User user) {
        System.out.println("User " + user.name + " banned.");
    }

    public void editTournamentRules(Tournament tournament, String newRules) {
        tournament.rules = newRules;
        System.out.println("Tournament rules updated.");
    }

    @Override
    public String toString() {
        return "Admin{" +
                "name='" + name + '\'' +
                ", professionalEmail='" + professionalEmail + '\'' +
                ", accessLevel=" + accessLevel +
                "} " + super.toString();
    }
}
