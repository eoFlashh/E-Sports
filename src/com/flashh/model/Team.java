package com.flashh.model;

import com.flashh.enums.CategoryTeam;
import com.flashh.contracts.ITeam;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public abstract class Team implements ITeam {
    public UUID id;
    public String name;
    public CategoryTeam category;
    public List<Player> players = new ArrayList<>();
    public int wins;
    public int losses;
    public List<String> tournamentHistory = new ArrayList<>();

    public Team(String name, CategoryTeam category) {
        this.name = name;
        this.category = category;
        this.id = UUID.randomUUID();
        this.wins = 0;
        this.losses = 0;
    }

    public void addPlayer(Player player) {
        System.out.println("Player has been added");
        players.add(player);
    }

    public void removePlayer(Player player) {
        System.out.println("Player has been removed");
        players.remove(player);
    }

    public double calculateWinPercentage() {
        int totalGames = wins + losses;
        if (totalGames == 0) return 0;
        return ((double) wins / totalGames) * 100;
    }

    public void listPlayers() {
        for (Player player : players) {
            System.out.println(player);
        }
    }

    public void listTournamentHistory() {
        if (tournamentHistory.isEmpty()) {
            System.out.println(name + " has not participated in any tournaments.");
        } else {
            System.out.println(name + "'s Tournament History:");
            for (String tournament : tournamentHistory) {
                System.out.println(tournament);
            }
        }
    }

    public void addTournamentToHistory(String tournamentName) {
        tournamentHistory.add(tournamentName);
        System.out.println("Tournament " + tournamentName + " added to " + name + "'s history.");
    }

    @Override
    public void createTeam() {
        System.out.println("Team " + name + " has been created.");
    }

    @Override
    public void editTeam() {
        System.out.println("Team " + name + " has been edited.");
    }

    @Override
    public void deleteTeam() {
        System.out.println("Team " + name + " has been deleted.");
    }

    @Override
    public void listTeams() {
        System.out.println("Team " + name + ", Category: " + category.getDescription());
    }

    @Override
    public String toString() {
        return "Team{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category=" + category +
                ", players=" + players +
                ", wins=" + wins +
                ", losses=" + losses +
                ", tournamentHistory=" + tournamentHistory +
                '}';
    }
}
