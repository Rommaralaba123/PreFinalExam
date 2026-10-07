/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 * 
 */
public class Player {
    public String PlayerID;
    public String name;
    public String TeamName;
    public double score;

    // Primary 4-argument constructor
    public Player(String PlayerID, String name, String TeamName, double score) {
        this.PlayerID = PlayerID;
        this.name = name;
        this.TeamName = TeamName;
        this.score = score;
    }

    
    public Player(String PlayerID, String name, double score) {
        this(PlayerID, name, "N/A", score);
    }

    
    public String getPlayerID() { return PlayerID; }
    public String getName() { return name; }
    public String getTeamName() { return TeamName; }
    public double getScore() { return score; }

  
    public void display() {
        System.out.printf("%-10s %-15s %-15s %-10.1f%n", PlayerID, name, TeamName, score);
    }
}