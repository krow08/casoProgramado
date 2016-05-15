/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import Modelo.MetodosEstudiantes;
import Vista.FRM_MantenimientoEstudiantes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author tecnologiamultimedia
 */
public class Controlador_FRM_MantenimientoEstudiantes implements ActionListener{
    
    
    public MetodosEstudiantes metodos;
    FRM_MantenimientoEstudiantes mantenimientoEstudiantes;
    
    public Controlador_FRM_MantenimientoEstudiantes(FRM_MantenimientoEstudiantes mantenimientoEstudiantes)
    {
        this.mantenimientoEstudiantes=mantenimientoEstudiantes;
        metodos = new MetodosEstudiantes();
     
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().equals("Consultar") || e.getActionCommand().equals("ConsultaRapida"))
        {
            buscar();
        }
        if(e.getActionCommand().equals("Agregar"))
        {
            metodos.agregarEstudiante(mantenimientoEstudiantes.devolverInformacion());
            metodos.mostrarInformacion();    
            mantenimientoEstudiantes.posicionInicial();
           
 
        }
        if(e.getActionCommand().equals("Modificar"))
        {
         metodos.modificarEstudiante(mantenimientoEstudiantes.devolverInformacion());
         metodos.mostrarMensaje("El estudiante se modifico correctamente");
         mantenimientoEstudiantes.desabilirAgregar();
         mantenimientoEstudiantes.posicionInicial();
        }
        if(e.getActionCommand().equals("Eliminar"))
        {
         metodos.eliminarEstudiante(mantenimientoEstudiantes.devolverInformacion());
         metodos.mostrarMensaje("El estudiante se elimino correctamente");
         mantenimientoEstudiantes.desabilirAgregar();
         mantenimientoEstudiantes.posicionInicial();
        }
    
    }
    public void buscar()
    {
            if(metodos.consultarEstudiante(mantenimientoEstudiantes.devolverCedula()))
            {
                mantenimientoEstudiantes.mostrarInformacion(metodos.getArregloInformacion());
                mantenimientoEstudiantes.habilirModificar();
                mantenimientoEstudiantes.habilirEliminar();
               
            }
            else
            {
                metodos.mostrarMensaje("El estudiante consultado no se encontró");
                mantenimientoEstudiantes.habilirAgregar();
            }
    }
   
    
}
