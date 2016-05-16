/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.MetodosUsuarios;
import Vista.FRM_MantenimientoUsuario;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Jesse Fabian
 */
public class Controlador_FRM_MantenimientoUsuarios implements ActionListener {

    FRM_MantenimientoUsuario mantenimientoUsuarios;
    MetodosUsuarios metodos;
    
    public Controlador_FRM_MantenimientoUsuarios(FRM_MantenimientoUsuario mantenimientoUsuarios)
    {
        this.mantenimientoUsuarios=mantenimientoUsuarios;
        metodos=new MetodosUsuarios();
    }
    
    
   public void actionPerformed(ActionEvent e)
   {
     if(e.getActionCommand().equals("Consultar") || e.getActionCommand().equals("ConsultaRapida"))
        {
           buscar();
        }
       
        if(e.getActionCommand().equals("Agregar"))
        {
            metodos.agregarUsuario(mantenimientoUsuarios.devolverInformacion());
            metodos.mostrarInformacion();     
            metodos.mensaje("El usuario ha sido registrado exitosamente");
            mantenimientoUsuarios.resetearInterfaz();
        }
        if(e.getActionCommand().equals("Modificar"))
        {
           metodos.modificarUsuario(mantenimientoUsuarios.devolverInformacion());
           metodos.mensaje("Los datos han sido modificados exitosamente");
           mantenimientoUsuarios.resetearInterfaz(); 
        }
        if(e.getActionCommand().equals("Eliminar"))
        {
            metodos.eliminarUsuario(mantenimientoUsuarios.devolverInformacion());
            metodos.mensaje("El usuario ha sido eliminado exitosamente");
            mantenimientoUsuarios.resetearInterfaz();
        }   
   }
    public void buscar()
    {
            if(metodos.consultarUsuario(mantenimientoUsuarios.devolverNombreUsuario()))
            {
                mantenimientoUsuarios.mostrarInformacion(metodos.getArregloInformacion());
                
            }
            else
            {
                metodos.mensaje("El usuario no ha sido encontrado");
              //  mantenimientoUsuarios.habilitarBotones();
            }
    }
}
