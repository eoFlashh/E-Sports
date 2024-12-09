package com.flashh.model;

import com.flashh.enums.CategoryTeam;

import java.util.ArrayList;
import java.util.List;

public class CompetitiveTeam extends Team {
    private List<String> prizesWon = new ArrayList<>();

    public CompetitiveTeam(String name, CategoryTeam category) {
        super(name, category);
        this.prizesWon = new ArrayList<>();
    }

    public void addPrize(String prize, RegionalTournament tournament) {
        String prizeByTournament = prize + " " + tournament.name;
        prizesWon.add(prizeByTournament);
        System.out.println("Prize '" + prize + "' added to " + name + "'s collection.");
    }

    public void listPrizes() {
        if (prizesWon.isEmpty()) {
            System.out.println(name + " has not won any prizes.");
        } else {
            System.out.println(name + "'s Prizes:");
            for (String prize : prizesWon) {
                System.out.println(prize);
            }
        }
    }

    public void listStats() {
        System.out.println("Stats for " + name + ":");
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
        System.out.println("Win Percentage: " + calculateWinPercentage() + "%");
        listTournamentHistory();
        listPrizes();
    }

    @Override
    public String toString() {
        return super.toString() + ", Prizes Won: " + prizesWon;
    }
}
