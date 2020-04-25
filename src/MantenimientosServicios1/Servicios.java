/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MantenimientosServicios1;

import java.util.ArrayList;

/**
 *
 * @author schav
 */
public class Servicios {
     
    //Atributos 
    private int ID;
    private String NombreServicios;
    
    public Servicios
        (int ID, String NombreServicios){
            
            this.ID = ID;
            this.NombreServicios = NombreServicios;
        }
    public Servicios(){
         
    }    

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombreServicios() {
        return NombreServicios;
    }

    public void setNombreServicios(String Nombre) {
        this.NombreServicios = Nombre;
    }

    
    ArrayList <Servicios> list = new ArrayList();
     
     public void guardaremp(Servicios Servi){
         list.add(Servi);
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
