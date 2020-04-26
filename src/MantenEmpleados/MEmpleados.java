/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MantenEmpleados;

import java.util.ArrayList;

/**
 *
 * @author ASUS VivoBook
 */
public class MEmpleados {

    
    //Atributos 
    private int edad;
    private int numTel;
    private int cedula;
    private String nombre;
    private String localizacion;
    
    //Constructores
    public MEmpleados
        (int edad, int numTel, int cedula, String nombre,
                String Localizacion){
            
            this.edad = edad;
            this.numTel = numTel;
            this.cedula = cedula;
            this.nombre = nombre;
            this.localizacion = Localizacion;
            
        }
        
     public MEmpleados (){
         
     }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumTel() {
        return numTel;
    }

    public void setNumTel(int numTel) {
        this.numTel = numTel;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }
    
         
     ArrayList <MEmpleados> pin = new ArrayList();
     
     public void guardaremp(MEmpleados EMP){
         pin.add(EMP);
     }

    @Override
    public String toString() {
         int i = 0;
         String datos = "";
         do {
          String temp = pin.get(i).toString();
          datos = datos + "\n" + temp;
          
          i++;        
         } while(i<=pin.size());
         
         return datos; //To change body of generated methods, choose Tools | Templates.
    }
 
     
     
     /*public String mostraremp(){
         int i = 0;
         String datos = "";
         do {
          String temp = pin.get(i).toString();
          datos = datos + "\n" + temp;
          
          i++;        
         } while(i<=pin.size());
         
         return datos;
        
     } */   
     
}
