/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.MetodosCursos;
import Vista.FRM_MantenimientoCursos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author tecnologiamultimedia
 */
public class Controlador_FRM_MantenimientoCursos implements ActionListener{
    
    FRM_MantenimientoCursos frm_MantenimientoCursos;
    public MetodosCursos metodos;
    public Controlador_FRM_MantenimientoCursos(FRM_MantenimientoCursos frm_MantenimientoCursos)
    {
        this.frm_MantenimientoCursos= frm_MantenimientoCursos;
        metodos = new MetodosCursos();
    } 
    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().equals("Agregar"))
        {
            metodos.agregarCurso(frm_MantenimientoCursos.devolverInformacion());  
            metodos.mostrarInformacion();
            frm_MantenimientoCursos.limpiarCampos();
            frm_MantenimientoCursos.estadoInicial();
        }
        if(e.getActionCommand().equals("Consultar"))
        {
            if(metodos.consultarCurso(frm_MantenimientoCursos.devolverSigla()))
            {
                frm_MantenimientoCursos.mostrarInformacion(metodos.getArregloInformacion());
                frm_MantenimientoCursos.habilitarModificar();
                frm_MantenimientoCursos.habilirEliminar();
            }
            else
            {
                System.out.println("No se encontró el curso");
                frm_MantenimientoCursos.habilitarAgregar();
            }
        }
        if(e.getActionCommand().equals("Modificar"))
        {
         metodos.modificarCurso(frm_MantenimientoCursos.devolverInformacion());
         metodos.mostrarMensaje("El estudiante se modifico correctamente");
         frm_MantenimientoCursos.limpiarCampos();
         frm_MantenimientoCursos.deshabilitarAgregar();
        }
        if(e.getActionCommand().equals("Eliminar"))
        {
         metodos.eliminarCurso(frm_MantenimientoCursos.devolverInformacion());
         metodos.mostrarMensaje("El estudiante se elimino correctamente");
         frm_MantenimientoCursos.posicionInicial();
        }
    }
}
