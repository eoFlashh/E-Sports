package com.flashh.model;

import com.flashh.enums.TournamentType;

public class RegionalTournament extends Tournament {
    private String region;

    public RegionalTournament(String name, String rules, String region) {
        super(name, TournamentType.REGIONAL, rules);
        this.region = region;
    }

    @Override
    public void addTeam(Team team) {
        participants.add(team);
        System.out.println("Team added to the regional tournament.");
    }

    @Override
    public void removeTeam(Team team) {
        participants.remove(team);
        System.out.println("Team removed from the regional tournament.");
    }

    @Override
    public void startTournament() {
        if (!participants.isEmpty()) {
            System.out.println("Starting regional tournament: " + name);
        } else {
            System.out.println("Cannot start tournament. No teams registered.");
        }
    }

    @Override
    public void endTournament() {
        System.out.println("Regional tournament " + name + " has ended.");
        for (Team team : participants) {
            team.addTournamentToHistory(name);
        }
    }

    @Override
    public void listTeams() {
        if (!(participants == null)) {
            System.out.println("Teams in the tournament:");
            for (Team team : participants) {
                System.out.println(team.name);
            }
        } else {
            System.out.println("No teams registered yet.");
        }
    }
}
