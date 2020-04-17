/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.programacion;

import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class Controller {
    ArrayList<Usuario> usuarios = new ArrayList();

    public Controller() {
        Usuario usuario1 = new Usuario("Erick",123456,1234567890,"Desamparados",12345);
        Usuario usuario2 = new Usuario("Carlos",123456,1234567890,"San Jose",12345);  // creacion de 3 usuarios "base de datos"
        Usuario usuario3 = new Usuario("Alex",123456,1234567890,"Heredia",12345);
        usuarios.add(usuario1);
        usuarios.add(usuario2);
        usuarios.add(usuario3);
    }
    
    public void AgregarUsuario(String nombre, int cedula, int numTarjeta, String direccion, int numeroTel){
        Usuario temp = new Usuario(nombre,cedula,numTarjeta,direccion,numeroTel);
        usuarios.add(temp);
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public String toString() {
        String texto="";
        for(int i=0;i<usuarios.size();i++){
            Usuario temp = usuarios.get(i);
            texto += temp.toString()+"\n";
        }
        return texto;
    }
    
    
    
    
    
}