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
public class Patient {
    private int ID;
    private Team team;
    private Ward ward;
    private ArrayList<Appoiment> appoiments;
    private ArrayList<Doctor> doctors;

    public Patient(int ID, Team team, Ward ward) {
        this.ID = ID;
        this.team = team;
        this.ward = ward;
        this.appoiments = new ArrayList<>();
        this.doctors = new ArrayList<>();
        
        this.team.addPatient(this);
        this.ward.addPatient(this);
    }

    public int getID() {
        return ID;
    }

    public Team getTeam() {
        return team;
    }

    public Ward getWard() {
        return ward;
    }

    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }

    public ArrayList<Appoiment> getAppoiments() {
        return appoiments;
    }
    
    public boolean addDoctor(Doctor doctor){
        if (!this.doctors.contains(doctor)) {
            this.doctors.add(doctor);
            return true;
        }
        return false;
    }
    public boolean addAppoiment(Appoiment appoiment){
        if (!this.appoiments.contains(appoiment)) {
            this.appoiments.add(appoiment);
            return true;
        }
        return false;
    }
    public ArrayList<Integer> getDoctorsId() {
        ArrayList<Integer> doctorsId = new ArrayList<>();// crea una lsita de los ID de los doctores
        for (Appoiment appoiment : this.appoiments) {
            doctorsId.add(appoiment.getDoctor().getID());// lso agrega a la lista segun los appoiments
        }
        return doctorsId;
    }
}
