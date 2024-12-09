package com.flashh.model;

import com.flashh.contracts.IMatch;
import com.flashh.enums.MatchStatus;

import java.util.List;
import java.util.Random;
import java.util.UUID;

public class Match implements IMatch {
    private final UUID id;
    private final List<Team> teams;
    private String result;
    private MatchStatus status;

    public Match(List<Team> teams) {
        if (teams.size() != 2) {
            throw new IllegalArgumentException("A match must have exactly two teams!");
        }
        this.id = UUID.randomUUID();
        this.teams = teams;
        this.status = MatchStatus.SCHEDULED;
    }

    @Override
    public void createMatch() {
        System.out.println("Match between " + teams.get(0).name + " and " + teams.get(1).name + " has been created.");
    }

    @Override
    public void editMatch() {
        System.out.println("Match details updated.");
    }

    @Override
    public void cancelMatch() {
        if (status == MatchStatus.FINALIZED || status == MatchStatus.CANCELLED) {
            System.out.println("Match cannot be canceled. Current status: " + status.getStatus());
            return;
        }
        status = MatchStatus.CANCELLED;
        System.out.println("Match has been canceled.");
    }

    @Override
    public void listMatches() {
        System.out.println("Listing match: " + this.id);
    }

    public void startMatch() {
        if (status != MatchStatus.SCHEDULED) {
            throw new IllegalStateException("Match cannot be started. Current status: " + status.getStatus());
        }
        status = MatchStatus.IN_PROGRESS;
        System.out.println("Match has started between " + teams.get(0).name + " and " + teams.get(1).name + "!");
    }

    public void endMatch() {
        if (status != MatchStatus.IN_PROGRESS) {
            throw new IllegalStateException("Match cannot be ended. Current status: " + status.getStatus());
        }
        status = MatchStatus.FINALIZED;

        Random random = new Random();
        int winnerIndex = random.nextInt(2);
        Team winner = teams.get(winnerIndex);
        Team loser = teams.get(1 - winnerIndex);

        result = "Winner: " + winner.name;

        winner.wins += 1;
        loser.losses += 1;

        System.out.println("Match has ended! " + result);
    }

    public String getResult() {
        return result;
    }

    public UUID getId() {
        return id;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public MatchStatus getStatus() {
        return status;
    }
}