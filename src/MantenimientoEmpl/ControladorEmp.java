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
      Empleado EMP = new Empleado();
      EMP.setEdad(edad);
      EMP.setNumTel(numTel);
      EMP.setCedula(cedula);
      EMP.setNombre(nombre);
      EMP.setLocalizacion(localizacion);
      
      EMP.guardaremp(EMP);
      
      
      
   }
       
       
       
   
    
}
    
   