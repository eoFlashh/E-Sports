package com.flashh.model;

import java.util.UUID;

public class Statistics {
    private UUID userId;
    private int matchesPlayed;
    private int wins;
    private int losses;
    private int playtime;
    private int ranking;

    public Statistics(UUID userId) {
        this.userId = userId;
        this.matchesPlayed = 0;
        this.wins = 0;
        this.losses = 0;
        this.playtime = 0;
        this.ranking = 0;
    }

    public void calculateWinRate() {
        if (matchesPlayed == 0) {
            System.out.println("No matches played yet.");
            return;
        }
        double winRate = (double) wins / matchesPlayed * 100;
        System.out.println("Win rate: " + winRate + "%");
    }

    public void updateStats(int playedMatches, int wonMatches, int lostMatches, int playtime) {
        this.matchesPlayed += playedMatches;
        this.wins += wonMatches;
        this.losses += lostMatches;
        this.playtime += playtime;
        this.ranking = (int) ((wins * 1.5) - (losses * 0.5) + (playtime * 0.1));
    }

    public void compareRanking(Statistics otherStats) {
        if (this.ranking > otherStats.ranking) {
            System.out.println("This user has a higher ranking.");
        } else if (this.ranking < otherStats.ranking) {
            System.out.println("The other user has a higher ranking.");
        } else {
            System.out.println("Both users have the same ranking.");
        }
    }

    public void listTopPlayers() {
        System.out.println("Listing top players based on ranking...");
    }

    @Override
    public String toString() {
        return "Statistics{" +
                "userId=" + userId +
                ", matchesPlayed=" + matchesPlayed +
                ", wins=" + wins +
                ", losses=" + losses +
                ", playtime=" + playtime +
                ", ranking=" + ranking +
                '}';
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public int getMatchesPlayed() {
        return matchesPlayed;
    }

    public void setMatchesPlayed(int matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public int getPlaytime() {
        return playtime;
    }

    public void setPlaytime(int playtime) {
        this.playtime = playtime;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }
}
