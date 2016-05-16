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
public class Controlador_FRM_FuenteInformacion {
    FRM_FuenteInformacion fuenteInfo;
    
    public Controlador_FRM_FuenteInformacion(FRM_FuenteInformacion fuenteInfo)
    {
        this.fuenteInfo=new FRM_FuenteInformacion();
    }
    
    public void seleccion()
    {
        if(fuenteInfo.archivosPlanosSeleccionado())
        {
            
        }
        if(fuenteInfo.baseDatosSeleccionado())
        {
            
        }
        if(fuenteInfo.xMLSeleccionado())
        {
            
        }
    }
}
