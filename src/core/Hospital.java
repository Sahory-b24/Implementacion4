/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import java.util.ArrayList;

/**
 *
 * @author Sahory Blanco
 */
public class Hospital {
    private ArrayList <Team> teams;
    private ArrayList <Ward> wards;

    public Hospital() {
        this.teams = new ArrayList<>();
        this.wards = new ArrayList<>();
    }

    
    public Team getTeam(int teamID){
        for (Team team : this.teams) {
            if (team.getID() == teamID) {
                return team;
            }
        }
        return null;
    }
    public Doctor getDoctor(int doctorID){
        for (Team team :  this.teams) {
            for (Doctor doctor : team.getDoctors()) {
                if (doctor.getID() == doctorID) {
                    return doctor;
                }
            }
        }
        return null;
    }
}
