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
public class Ward {
    private int ID;
    private ArrayList<Patient> patients;

    public Ward(int ID) {
        this.ID = ID;
        this.patients = new ArrayList<>();
    }
    
    public int getID() {
        return ID;
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
}
