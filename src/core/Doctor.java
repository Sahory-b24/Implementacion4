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
public abstract class Doctor {
    protected int ID;
    protected Team team;
    protected ArrayList<Appoiment> appoiments;
    protected ArrayList<Patient> patients;

    public Doctor(int ID, Team team) {
        this.ID = ID;
        this.team = team;
        this.appoiments = new ArrayList<>();
        this.appoiments = new ArrayList<>();
    }

    public int getID() {
        return ID;
    }
    
    public boolean addAppoiment(Appoiment appoiment){
        if (!this.appoiments.contains(appoiment)) {
            this.appoiments.add(appoiment);
            return true;
        }
        return false;
    }
    public boolean addPatient(Patient patient){
        if (!this.patients.contains(patient)) {
            this.patients.add(patient);
            return true;
        }
        return false;
    }
}
