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
    }
    
    public int getID() {
        return ID;
    }
    
    
}
