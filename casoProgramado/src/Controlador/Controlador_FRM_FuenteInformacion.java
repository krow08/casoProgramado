/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.FRM_FuenteInformacion;
import Vista.FRM_MenuPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author altna
 */
public class Controlador_FRM_FuenteInformacion implements ActionListener {
    FRM_FuenteInformacion fuenteInfo;
    FRM_MenuPrincipal menu;
    Controlador_FRM_MenuPrincipal controladorMenu;
    public Controlador_FRM_FuenteInformacion(FRM_FuenteInformacion fuenteInfo)
    {
       this.fuenteInfo=fuenteInfo;
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().equals("Aceptar"))
        {
            menu =new FRM_MenuPrincipal();
            menu.setVisible(true);
        }
        if(e.getActionCommand().equals("Salir"))
        {
           System.exit(0);
        }
    }
}
