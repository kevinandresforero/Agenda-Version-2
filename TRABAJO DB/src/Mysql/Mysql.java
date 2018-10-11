/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mysql;

import agenda.datos.DBContactos;
import agenda.datos.DBSeleccionados;
import agenda.datos.logica.Contacto;
import agenda.datos.logica.Seleccionados;


public class Mysql {


    public static void main(String[] args) {
        
        DBContactos dbcontactos= new DBContactos();
        Contacto[] contactos= dbcontactos.getContactos();
        DBSeleccionados dbseleccionados= new DBSeleccionados();
        Seleccionados[] Seleccionados= dbseleccionados.getSeleccionados();
        
        
         System.out.println(  "Agenda" );
        for(Contacto contacto : contactos)
        {
            System.out.println("Nombre: "+contacto.getNombre() + " " + contacto.getApellido());
            
        }
        System.out.println(  "Citas" );
        for(Seleccionados seleccionados : Seleccionados)
        {
            System.out.println("Nombre: "+seleccionados.getNombre1() + " " + seleccionados.getApellido1());
            
        }
         
    }
    
}
