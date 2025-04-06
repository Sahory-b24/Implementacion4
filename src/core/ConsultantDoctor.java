/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

/**
 *
 * @author Sahory Blanco
 */
public class ConsultantDoctor extends Doctor{
    private Team leaderOf;

    public ConsultantDoctor(Team leaderOf, int ID, Team team) {
        super(ID, team);
        this.leaderOf = leaderOf;
    }
    
}
