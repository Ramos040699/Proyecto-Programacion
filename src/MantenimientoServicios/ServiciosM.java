/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MantenimientoServicios;
import java.util.ArrayList;

/**
 *
 * @author schav
 */
public class ServiciosM {
    
    //Atributos 
    private int ID;
    private int NumEmpleado;
    private String Nombre;
    private String Servicio;
    
    public ServiciosM
        (int ID, int NumEmpleado , String Nombre, String Servicio){
            
            this.ID = ID;
            this.NumEmpleado = NumEmpleado;
            this.Nombre = Nombre;
            this.Servicio = Servicio;
        }
    public ServiciosM(){
         
    }   
     
     public int getID(){
         return ID;
     }
     
     public void setID(int ID){
         this.ID = ID;
     }
  
     
     public int getNumEmpleados(){
         return NumEmpleado;
     }
     
     public void setNumEmpleado(int NumEmpleado){
         this.NumEmpleado = NumEmpleado;
     }
     
          
     public String getNombre(){
         return Nombre;
     }
     
     public void setNombre(String Nombre){
         this.Nombre = Nombre;
     }

    public String getServicio() {
        return Servicio;
    }

    public void setServicio(String Servicio) {
        this.Servicio = Servicio;
    }
    ArrayList <ServiciosM> list = new ArrayList();
     
     public void guardaremp(ServiciosM SerM){
         list.add(SerM);
     }
     public String mostraremp(){
         int i = 0;
         String datos = "";
         do {
          String temp = list.get(i).toString();
          datos = datos + "\n" + temp;
          
          i++;        
         } while(i<=list.size());
         
         return datos;
        
     }    

}