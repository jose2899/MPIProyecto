/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import controlador.ControladorMPI;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.management.Query;
import java.lang.Process;


/**
 *
 * @author clustervpjr
 */
public class ModeloMPI{
    
      public String getLine(Process leer){
            String salida = null;
            InputStreamReader entrada = null;
            BufferedReader cmdInput = null;
            String agg = "";
            String uni = "";
            int i = 1;
            try {
                entrada =  new InputStreamReader(leer.getInputStream());
                cmdInput = new BufferedReader(entrada);
                String compr = cmdInput.readLine();
                    while (compr != null) {
                            agg += compr +"\n";
                            compr = cmdInput.readLine();
                            i++;
                    }           
            } catch (IOException err) {
                err.getStackTrace();
            }
            return agg;
        
        }

    public Process run(String command){
        Process nucl = null;
        try {
            String[] commands = {"bash", "-c",command};
            Runtime r = Runtime.getRuntime();
            nucl = r.exec(commands);
            
        } catch (IOException err) {
            err.getStackTrace();
        }
         return nucl;
    }
    
}
