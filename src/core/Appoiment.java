/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

/**
 *
 * @author Sahory Blanco
 */
public class Appoiment {
    private Doctor doctor;
    private Patient patient;

    public Appoiment(Doctor doctor, Patient patient) {
        this.doctor = doctor;
        this.patient = patient;
        
        this.doctor.addAppoiment(this);
        this.patient.addAppoiment(this);
    }

    public Doctor getDoctor() {
        return doctor;
    }
    
    
}
