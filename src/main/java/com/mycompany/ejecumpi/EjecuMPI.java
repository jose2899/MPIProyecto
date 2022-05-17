/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejecumpi;

import java.io.IOException;

/**
 *
 * @author clustervpjr
 */
public class EjecuMPI {

    public static void main(String[] args) {
        try {
	String cmd = "halt"; //Comando de apagado en linux
	Runtime.getRuntime().exec(cmd); 
        } catch (IOException ioe) {
	System.out.println (ioe);
}
    }

    public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
