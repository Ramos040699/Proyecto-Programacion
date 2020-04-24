/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mantenimientoempl;
import java.util.ArrayList;

/**
 *
 * @author ASUS VivoBook
 */
public class Empleado {
    
    //Atributos 
    private int edad;
    private int numTel;
    private int cedula;
    private String nombre;
    private String localizacion;
    
    //Constructores
    public Empleado
        (int edad, int numTel, int cedula, String nombre,
                String Localizacion){
            
            this.edad = edad;
            this.numTel = numTel;
            this.cedula = cedula;
            this.nombre = nombre;
            this.localizacion = Localizacion;
            
        }
        
     public Empleado (){
         
     }   
            
     //Metodos
     
     public int getEdad(){
         return edad;
     }
     
     public void setEdad(int edad){
         this.edad = edad;
     }
  
     
     public int getNumTel(){
         return numTel;
     }
     
     public void setNumTel(int numTel){
         this.numTel = numTel;
     }
     
     public int getCedula(){
         return cedula;
     }
     
     public void setCedula(int cedula){
         this.cedula = cedula;
     }
     
     public String getNombre(){
         return nombre;
     }
     
     public void setNombre(String nombre){
         this.nombre = nombre;
     }
     
     public String getLocalizacion(){
         return localizacion;
     }
     
     public void setLocalizacion(String localizacion){
         this.localizacion = localizacion;
     }
     
     ArrayList <Empleado> pin = new ArrayList();
     
     public void guardaremp(Empleado EMP){
         pin.add(EMP);
     }
     
     
             
}


