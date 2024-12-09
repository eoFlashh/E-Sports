package com.flashh.main;

import com.flashh.enums.CategoryTeam;
import com.flashh.enums.UserLevel;
import com.flashh.model.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        try{
            Player player1 = new Player("Jv", "ojvzinn@gmail.com", "123", UserLevel.BASIC);
            Player player2 = new Player("Balab", "balabegf@gmail.com", "1234", UserLevel.ADVANCED);

            CompetitiveTeam team1 = new CompetitiveTeam("Luminosity", CategoryTeam.PROFESSIONAL);
            CompetitiveTeam team2 = new CompetitiveTeam("SK gaming", CategoryTeam.AMATEUR);

            System.out.println("");
            team1.addPlayer(player1);
            team2.addPlayer(player2);

            System.out.println("");
            RegionalTournament ESL = new RegionalTournament("ESL", "Bla bla bla", "EUA");
            ESL.addTeam(team1);
            ESL.addTeam(team2);

            System.out.println("");
            ESL.listTeams();

            System.out.println("");
            Match match = new Match(List.of(team1, team2));
            match.createMatch();

            System.out.println("");
            match.startMatch();
            match.endMatch();

            System.out.println("");
            System.out.println("Match result: " + match.getResult());
            ESL.endTournament();

            System.out.println("");
            team1.addPrize("Gold Medal - Regional Championship", ESL);
            team2.addPrize("Silver Medal - Regional Championship", ESL);

            System.out.println("");
            team1.listPrizes();
            team2.listPrizes();

            System.out.println("");
            team1.listTournamentHistory();
            team2.listTournamentHistory();

            System.out.println("");
            team1.listStats();
            System.out.println();
            team2.listStats();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
