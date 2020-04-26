/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BasedeDatos;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

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
    
    //Atributos de EMPLEADOS
    private String idE       = "";    
    private String nombE     = "";
    private String cedE      = "";
    private String teleE     = "";
    private String estadocE  = "";
    private String servisE   = "";
    private String edadE     = "";

    
    //Atributos de Clientes
    private String idC       = "";       
    private String nombC     = "";
    private String cedC      = "";
    private String teleC     = "";
    private String numtarjC  = "";
    private String direC     = "";
    private String edadC     = "";

    
    //Atributos de Servicios
    private String idS       = "";       
    private String nombS     = "";

    
    //Atributos de Contratos
    private String idCon     = "";    
    private String nombCon   = "";
    private String tipoCon   = "";
    private String fechaFCon = "";
    
    
    /**
     * Constructor predeterminado
     */
    public BaseDatos(){

    }   
    
    
    
    public void agregarEmpleado(String empleado){
        listaEmpleados.add(empleado);
        JOptionPane.showMessageDialog(null, "Los datos se guardaron exitosamente");
    }
    public void agregarCliente(String cliente){
        listaClientes.add(cliente);
        JOptionPane.showMessageDialog(null, "Los datos se guardaron exitosamente");        
    }
    public void agregarServicio(String servicio){       
        listaServicios.add(servicio);
        JOptionPane.showMessageDialog(null, "Los datos se guardaron exitosamente");        
    }
    public void agregarContrato(String contrato){
        listaContratos.add(contrato);
        JOptionPane.showMessageDialog(null, "Los datos se guardaron exitosamente");        
    }
    public String mostrarEmpleado(){
        String empdatos = "";
        int c = 0;
        do{
          String temp = listaEmpleados.get(c);
          empdatos = empdatos + "\n" + temp;
          c++;          
        }while (c<listaEmpleados.size());
        
        return empdatos;
    }
    public String mostrarCliente(){
        String clidatos = "";
        int c = 0;
        do{
          String temp = listaClientes.get(c);
          clidatos = clidatos + "\n" + temp;
          c++;          
        }while (c<listaClientes.size());
        
        return clidatos;
    }
    public String mostrarServicio(){
        String serdatos = "";
        int c = 0;
        do{
          String temp = listaServicios.get(c);
          serdatos = serdatos + "\n" + temp;
          c++;
        }while (c<listaServicios.size());      
        
        return serdatos;
    }
    public String mostrarContrato(){
        String condatos = "";
        int c = 0;
        do{
          String temp = listaContratos.get(c);
          condatos = condatos + "\n" + temp;
          c++;          
        }while (c<listaContratos.size());
        
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

    public String getIdE() {
        return idE;
    }

    public void setIdE(String idE) {
        this.idE = idE;
    }

    public String getNombE() {
        return nombE;
    }

    public void setNombE(String nombE) {
        this.nombE = nombE;
    }

    public String getCedE() {
        return cedE;
    }

    public void setCedE(String cedE) {
        this.cedE = cedE;
    }

    public String getTeleE() {
        return teleE;
    }

    public void setTeleE(String teleE) {
        this.teleE = teleE;
    }

    public String getEstadocE() {
        return estadocE;
    }

    public void setEstadocE(String estadocE) {
        this.estadocE = estadocE;
    }

    public String getServisE() {
        return servisE;
    }

    public void setServisE(String servisE) {
        this.servisE = servisE;
    }

    public String getEdadE() {
        return edadE;
    }

    public void setEdadE(String edadE) {
        this.edadE = edadE;
    }

    public String getIdC() {
        return idC;
    }

    public void setIdC(String idC) {
        this.idC = idC;
    }

    public String getNombC() {
        return nombC;
    }

    public void setNombC(String nombC) {
        this.nombC = nombC;
    }

    public String getCedC() {
        return cedC;
    }

    public void setCedC(String cedC) {
        this.cedC = cedC;
    }

    public String getTeleC() {
        return teleC;
    }

    public void setTeleC(String teleC) {
        this.teleC = teleC;
    }

    public String getNumtarjC() {
        return numtarjC;
    }

    public void setNumtarjC(String numtarjC) {
        this.numtarjC = numtarjC;
    }

    public String getDireC() {
        return direC;
    }

    public void setDireC(String direC) {
        this.direC = direC;
    }

    public String getEdadC() {
        return edadC;
    }

    public void setEdadC(String edadC) {
        this.edadC = edadC;
    }

    public String getIdS() {
        return idS;
    }

    public void setIdS(String idS) {
        this.idS = idS;
    }

    public String getNombS() {
        return nombS;
    }

    public void setNombS(String nombS) {
        this.nombS = nombS;
    }

    public String getIdCon() {
        return idCon;
    }

    public void setIdCon(String idCon) {
        this.idCon = idCon;
    }

    public String getNombCon() {
        return nombCon;
    }

    public void setNombCon(String nombCon) {
        this.nombCon = nombCon;
    }

    public String getTipoCon() {
        return tipoCon;
    }

    public void setTipoCon(String tipoCon) {
        this.tipoCon = tipoCon;
    }

    public String getFechaFCon() {
        return fechaFCon;
    }

    public void setFechaFCon(String fechaFCon) {
        this.fechaFCon = fechaFCon;
    }

    
    
}
