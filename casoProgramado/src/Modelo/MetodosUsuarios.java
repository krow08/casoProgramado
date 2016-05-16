/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Jesse Fabian
 */
public class MetodosUsuarios {
    
    private ArrayList <Usuario> arrayUsuarios;
    String arregloInformacionConsultada[];
    
    public MetodosUsuarios()
    {
        arrayUsuarios=new ArrayList <Usuario>();
        arregloInformacionConsultada=new String[3];
    }
    
    public void agregarUsuario(String informacion[])
    {
    Usuario temporal=new Usuario(informacion[0],informacion[1],informacion[2]);  
    arrayUsuarios.add(temporal);
    }
    
    public void mostrarInformacion()
    {
        for(int contador=0;contador<arrayUsuarios.size();contador++)
        {
            System.out.println(arrayUsuarios.get(contador).getInformacion());
        
        }
    
    }
    public boolean consultarUsuario(String nombreUsuario)
    {
        boolean existe=false;
        
        for(int contador=0;contador<arrayUsuarios.size();contador++)
        {
            if(arrayUsuarios.get(contador).getNombreUsuario().equals(nombreUsuario))
            {
                arregloInformacionConsultada[0]=arrayUsuarios.get(contador).getNombre();
                arregloInformacionConsultada[1]=arrayUsuarios.get(contador).getNombreUsuario();
                existe=true;
            }
        
        }
        return existe;
    
    }
    
    
    public void modificarUsuario(String arreglo[])
    {
        for(int contador=0;contador<arrayUsuarios.size();contador++)
        {
            if(arrayUsuarios.get(contador).getNombreUsuario().equals(arreglo[1]))
            {
                arrayUsuarios.get(contador).setNombre(arreglo[0]);
                arrayUsuarios.get(contador).setNombreUsuario(arreglo[1]);
            }
        }
    }
    public void eliminarUsuario(String arreglo[])
    {
        for(int contador=0;contador<arrayUsuarios.size();contador++)
        {
            if(arrayUsuarios.get(contador).getNombreUsuario().equals(arreglo[1]))
            {
                arrayUsuarios.remove(contador);
            }
        }
    }
    
    
    public void mensaje(String mensaje)
    {
       JOptionPane.showMessageDialog(null,mensaje);
    }
    
    public String[] getArregloInformacion()
    {
        return this.arregloInformacionConsultada;
    }
}
