/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.FRM_FuenteInformacion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author altna
 */
public class Controlador_FRM_FuenteInformacion implements ActionListener {
    FRM_FuenteInformacion fuenteInfo;
    
    public Controlador_FRM_FuenteInformacion(FRM_FuenteInformacion fuenteInfo)
    {
        this.fuenteInfo=new FRM_FuenteInformacion();
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().equals("Aceptar"))
        {
                if(fuenteInfo.archivosPlanosSeleccionado())
            {
                System.out.println("1");
            }
            if(fuenteInfo.baseDatosSeleccionado())
            {
                System.out.println("2");
            }
            if(fuenteInfo.xMLSeleccionado())
            {
                System.out.println("3");
            }
        }
    }
}
