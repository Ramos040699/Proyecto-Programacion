/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MantenEmpleados;

/**
 *
 * @author ASUS VivoBook
 */
public class Registro {
    String nombre;
    int cedula;
    int edad;
    String localizacion;
    int numTel;

    public Registro(String nombre, int cedula, int edad, String localizacion, int numTel) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.localizacion = localizacion;
        this.numTel = numTel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int numTarjeta) {
        this.edad = numTarjeta;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public int getNumTel() {
        return numTel;
    }

    public void setNumTel(int numTelefono) {
        this.numTel = numTelefono;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
