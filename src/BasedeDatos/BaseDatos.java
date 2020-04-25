/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BasedeDatos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Desa
 */
public class BaseDatos {
    
    /*List<Empleado> listaEmpleados = new ArrayList<>();
    List<Usuario> listaClientes = new ArrayList<>();
    List<ServiciosM> listaServicios = new ArrayList<>();
    List<Contratos> listaContratos = new ArrayList<>();*/
    
    List<String> listaEmpleados = new ArrayList<>();
    List<String> listaClientes = new ArrayList<>();
    List<String> listaServicios = new ArrayList<>();
    List<String> listaContratos = new ArrayList<>();
    
    public void agregarEmpleado(String empleado){
        listaEmpleados.add(empleado);
    }
    public void agregarCliente(String empleado){
        listaEmpleados.add(empleado);
    }
    public void agregarServicio(String empleado){
        listaEmpleados.add(empleado);
    }
    public void agregarContrato(String empleado){
        listaEmpleados.add(empleado);
    }
    public String mostrarEmpleado(String empleado){
        String empdatos = "";
        int c = 0;
        do{
          String temp = listaEmpleados.get(c);
          empdatos = empdatos + "\n" + temp;
        }while (c<=listaEmpleados.size());
        
        return empdatos;
    }
    public String mostrarCliente(String empleado){
        String clidatos = "";
        int c = 0;
        do{
          String temp = listaClientes.get(c);
          clidatos = clidatos + "\n" + temp;
        }while (c<=listaClientes.size());
        
        return clidatos;
    }
    public String mostrarServicio(String empleado){
        String serdatos = "";
        int c = 0;
        do{
          String temp = listaServicios.get(c);
          serdatos = serdatos + "\n" + temp;
        }while (c<=listaServicios.size());
        
        return serdatos;
    }
    public String mostrarContrato(String empleado){
        String condatos = "";
        int c = 0;
        do{
          String temp = listaContratos.get(c);
          condatos = condatos + "\n" + temp;
        }while (c<=listaContratos.size());
        
        return condatos;
    }
    

    public void setListaEmpleados(List<String> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public List<String> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<String> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public List<String> getListaServicios() {
        return listaServicios;
    }

    public void setListaServicios(List<String> listaServicios) {
        this.listaServicios = listaServicios;
    }

    public List<String> getListaContratos() {
        return listaContratos;
    }

    public void setListaContratos(List<String> listaContratos) {
        this.listaContratos = listaContratos;
    }

    
}
