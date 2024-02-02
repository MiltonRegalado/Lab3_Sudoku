/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3_sudoku;

import javax.swing.JOptionPane;

/**
 *
 * @author suyen
 */
public class dificultad {
    private String[] dificultad = {"Facil","Medio","Dificil"};
    private int difactual;
    
    public void seleccionarDiff(){
        difactual = JOptionPane.showOptionDialog(null, "Seleccione la dificultad del sudoku", "Dificultad", 0, 3, null, dificultad, dificultad[0]);
    }
    public int getDifactual(){
        return difactual;
    }
}
