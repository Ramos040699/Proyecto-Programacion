/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MantenimientoEmpl;

import javax.swing.JOptionPane;

/**
 *
 * @author ASUS VivoBook
 */
public class ControladorEmp {
    
   public void iniciar(int edad, int numTel, int cedula, String nombre, String localizacion){
      Empleado prueba = new Empleado();
      prueba.setEdad(edad);
      prueba.setNumTel(numTel);
      prueba.setCedula(cedula);
      prueba.setNombre(nombre);
      prueba.setLocalizacion(localizacion);
      
      prueba.guardaremp(prueba);
      
      
      
   }
       
       
       
   
    
}
    
   