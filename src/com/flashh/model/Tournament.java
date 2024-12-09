package com.flashh.model;

import com.flashh.enums.TournamentType;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public abstract class Tournament {
    protected UUID id;
    protected String name;
    protected TournamentType type;
    protected Set<Team> participants = new HashSet<>();
    protected List<Match> matches;
    protected String rules;

    public abstract void addTeam(Team team);
    public abstract void removeTeam(Team team);
    public abstract void startTournament();
    public abstract void endTournament();
    public abstract void listTeams();

    @Override
    public String toString() {
        return "Tournament{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", participants=" + participants +
                ", matches=" + matches +
                ", rules='" + rules + '\'' +
                '}';
    }

    public Tournament(String name, TournamentType type, String rules) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.type = type;
        this.rules = rules;
    }
    public String getname(){
        return name;
    }
}