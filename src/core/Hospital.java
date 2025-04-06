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
    public Ward getWard(int wardID){
        for (Ward ward : this.wards) {
            if (ward.getID() == wardID) {
                return ward;
            }
        }
        return null;
    }
    public Patient getPatient(int patientID){
        for (Team team : this.teams) {
            for (Patient patient : team.getPatients()) {
                if (patient.getID() == patientID) {
                    return patient;
                }
            }
 
        }
        return null;
    }
    public void addTeam(int idTeam, int idConsultantDoctor){
        Team team = new Team(idTeam);
        ConsultantDoctor consultantDoctor = new ConsultantDoctor(idConsultantDoctor,team); 
        this.teams.add(team);
        
    }
    public boolean addJuniorDoctor(Team team, int doctorID){
        JuniorDoctor juniorDoctor = new JuniorDoctor(doctorID, team);
        return true;
    }

    public boolean addWard(int wardID) {
        this.wards.add(new Ward(wardID));
        return true;
    }
    public boolean addPatient(Ward ward, Team team, int patientID){
        Patient patient = new Patient(patientID, team, ward);
        return true;
    }

    

    public boolean assignAppoiment(Patient patient, int doctorIDPlus) {
        int teamID = patient.getTeam().getID();
        Doctor doctor = this.getDoctor(teamID + doctorIDPlus);
        Appoiment appoiment = new Appoiment(doctor, patient);
//        doctor.addAppoiment(appoiment);
//        patient.addAppoiment(appoiment);
        return true;
    }
    public boolean assignPatientDoctor(Patient patient, int doctorIDPlus) {
        int teamID = patient.getTeam().getID();
        Doctor doctor = this.getDoctor(teamID + doctorIDPlus);
        
        doctor.addPatient(patient);
        patient.addDoctor(doctor);
        
        return true;
    }
    public void numberDoctorsPatient() {
        for (Ward ward : this.wards) {
            for (Patient patient : ward.getPatients()) {
                int index = patient.getDoctors().size();
                System.out.println("Patient "+ patient.getID()+" has "+ index + " doctors");
            }
        }
    }

    public void numberPatientsTeam() {
        for (Team team : this.teams) {
                int index = team.getPatients().size();
                System.out.println("team "+ team.getID()+" has "+ index + " patients");
        }
    }

    public void relationAppoiments() {
        for (Ward ward : this.wards) {
            for (Patient patient : ward.getPatients()) {
                int index = patient.getAppoiments().size();
                System.out.println("Patient "+ patient.getID()+" has "+ index +" Appoimnets");
                if (index > 0) {
                    ArrayList<Integer> doctoresID = patient.getDoctorsId();
                    for (Integer docID : doctoresID) {
                        System.out.println("Patient "+ patient.getID()+ " has an appoiment with the doctor "+ docID);
                    }
                }
            }
        }
    }
}
