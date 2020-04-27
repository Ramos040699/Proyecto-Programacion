/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MantenEmpleados;

import java.util.ArrayList;
import proyecto.programacion.Usuario;

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

    public ArrayList<Registro> getRegistro() {
        return registro;
    }

    public void setRegistro(ArrayList<Registro> registro) {
        this.registro = registro;
    }
    
    
         
     ArrayList <Registro> registro = new ArrayList();
     
     public void guardaremp(String nombre, int cedula, int edad, String localizacion, int numeroTel){
         Registro emp = new Registro(nombre,cedula,edad,localizacion,numeroTel);         
         registro.add(emp);
         System.out.print(registro.get(0));
     }     
    
    @Override
    public String toString() {
        String texto="";
        for(int i=0;i<registro.size();i++){
            Registro temp = registro.get(i);
            texto += temp.toString()+"\n";
        }
        return texto;
        }
    
     
}
