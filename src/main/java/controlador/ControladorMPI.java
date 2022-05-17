/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.ModeloMPI;
import vista.VistaMPI1;

/**
 *
 * @author clustervpjr
 */
public class ControladorMPI implements ActionListener{
    public static VistaMPI1 fp = null;
    public ControladorMPI(VistaMPI1 fp){
        this.fp = fp;
        inicializar();
    }
    private void inicializar(){
        this.fp.btnCompilar.addActionListener(this);
        this.fp.btnEjec.addActionListener(this);
        this.fp.setVisible(true);
        this.fp.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(this.fp.btnCompilar)){
            fp.txtArea.setText("");
        }
    }
    
}
