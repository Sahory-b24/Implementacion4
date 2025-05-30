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
public class Team {
    private int ID;
    private ConsultantDoctor teamLeader;
    private ArrayList<Doctor> doctors;
    private ArrayList<Patient> patients;

    public Team(int ID) {
        this.ID = ID;
        this.teamLeader = teamLeader;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
        
    }

    public int getID() {
        return ID;
    }

    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }
    
    public boolean addPatient(Patient patient){
        if (!this.patients.contains(patient)) {
            this.patients.add(patient);
            return true;
        }
        return false;
    }
    public boolean addDoctor(Doctor doctor){
        if (!this.doctors.contains(doctor)) {
            this.doctors.add(doctor);
            return true;
        }
        return false;
    }
}
