/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BasedeDatos;

import javax.swing.JOptionPane;

/**
 *
 * @author Desa
 */
public class BDVsita {
    
    BaseDatos basedatos = new BaseDatos();
    
    public static final String error="Debe ingresar una opcion";
    
    public void solicitaDatosEmp(){
        String datos = JOptionPane.showInputDialog("Digite el id del empleado")
                     + ", " +JOptionPane.showInputDialog("Digite el nombre del empleado")
                     + ", " + JOptionPane.showInputDialog("Digite el numero de cedula del empleado")
                     + ", " + JOptionPane.showInputDialog("Digite el telefono del empleado")
                     + ", " + JOptionPane.showInputDialog("Digite el estado del empleado")
                     + ", " + JOptionPane.showInputDialog("Digite el servicio del empleado")
                     + ", " + JOptionPane.showInputDialog("Digite la edad del empleado");
        
        /*datosEmp.setIdE(JOptionPane.showInputDialog("Digite el id del empleado"));
        datosEmp.setNombE(JOptionPane.showInputDialog("Digite el nombre del empleado"));
        datosEmp.setCedE(JOptionPane.showInputDialog("Digite el numero de cedula del empleado"));
        datosEmp.setTeleE(JOptionPane.showInputDialog("Digite el telefono del empleado"));
        datosEmp.setEstadocE(JOptionPane.showInputDialog("Digite el estado del empleado"));
        datosEmp.setServisE(JOptionPane.showInputDialog("Digite el servicio del empleado"));
        datosEmp.setEdadE(JOptionPane.showInputDialog("Digite la edad del empleado"));*/
        
        basedatos.agregarEmpleado(datos);            
    }

    public void solicitaDatosClient(){
        String datos = JOptionPane.showInputDialog("Digite el id del cliente")
                     + ", " + JOptionPane.showInputDialog("Digite el nombre del cliente")
                     + ", " + JOptionPane.showInputDialog("Digite el numero de cedula del cliente")
                     + ", " + JOptionPane.showInputDialog("Digite el telefono del cliente")
                     + ", " + JOptionPane.showInputDialog("Digite el numero de tarjeta del cliente")
                     + ", " + JOptionPane.showInputDialog("Digite la direccion del domicilio del cliente")
                     + ", " + JOptionPane.showInputDialog("Digite la edad del cliente");
        
        /*datosEmp.setIdC(JOptionPane.showInputDialog("Digite el id del cliente"));
        datosEmp.setNombC(JOptionPane.showInputDialog("Digite el nombre del cliente"));
        datosEmp.setCedC(JOptionPane.showInputDialog("Digite el numero de cedula del cliente"));
        datosEmp.setTeleC(JOptionPane.showInputDialog("Digite el telefono del cliente"));
        datosEmp.setNumtarjC(JOptionPane.showInputDialog("Digite el numero de tarjeta del cliente"));
        datosEmp.setDireC(JOptionPane.showInputDialog("Digite la direccion del domicilio del cliente"));
        datosEmp.setEdadC(JOptionPane.showInputDialog("Digite la edad del cliente"));*/
        
        basedatos.agregarCliente(datos);            
    }
    
    public void solicitaDatosServicio(){
        String datos = JOptionPane.showInputDialog("Digite el id del Servicio")
                     + ", " + JOptionPane.showInputDialog("Digite el nombre del Servicio");
        
        /*datosEmp.setIdS(JOptionPane.showInputDialog("Digite el id del Servicio"));
        datosEmp.setNombS(JOptionPane.showInputDialog("Digite el nombre del Servicio"));*/
        basedatos.agregarServicio(datos);            
    }

    public void solicitaDatosContrato(){
        String datos = JOptionPane.showInputDialog("Digite el id del Contrato")
                     + ", " + JOptionPane.showInputDialog("Digite el nombre del Contrato")
                     + ", " + JOptionPane.showInputDialog("Digite el tipo del Contrato")
                     + ", " + JOptionPane.showInputDialog("Digite la fecha del Contrato");
        
        /*datosEmp.setIdCon(JOptionPane.showInputDialog("Digite el id del Contrato"));
        datosEmp.setNombCon(JOptionPane.showInputDialog("Digite el nombre del Contrato"));
        datosEmp.setTipoCon(JOptionPane.showInputDialog("Digite el tipo del Contrato"));
        datosEmp.setFechaFCon(JOptionPane.showInputDialog("Digite la fecha del Contrato"));*/
        
        basedatos.agregarContrato(datos);            
    }

    public void solicitarListaMostrar(){
        String lista = "";
        String opc = JOptionPane.showInputDialog("Cual lista de Datos quiere revisar " + "\n"
                        + "E para Lista de Empleados" + "\n"
                        + "C para Lista de Clientes" + "\n"
                        + "S para Lista de Servicios" + "\n"
                        + "K para Lista de Contratos" + "\n"
                        + "Q para salir" + "\n").trim().toUpperCase();
        
        switch (opc) {
            case "E":
                lista = basedatos.mostrarEmpleado();
                JOptionPane.showMessageDialog(null, lista);
                break;
            case "C":
                lista = basedatos.mostrarCliente();
                JOptionPane.showMessageDialog(null, lista);
                break;
            case "S":
                lista = basedatos.mostrarServicio();                
                JOptionPane.showMessageDialog(null, lista);
                break;               
            case "K":
                lista = basedatos.mostrarContrato();
                JOptionPane.showMessageDialog(null, lista);
                break;
            default:
                break;
        }
    }    
    
    
    public String solicitarTransaccion(){
        String operacion = JOptionPane.showInputDialog("Ingrese la transaccion que desea realizar: " + "\n"
                        + "E para Agregar un Empleado" + "\n"
                        + "C para Agregar un Cliente" + "\n"
                        + "S para Agregar un Servicio" + "\n"
                        + "K para Agregar un Contrato" + "\n"
                        + "M para Mostrar Datos" + "\n"                
                        + "Q para salir" + "\n").trim().toUpperCase();
        return operacion;
    }
    
    public void muestraMsgerror(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje);
    } 
    public void mostrarMsgerror1(){
        JOptionPane.showMessageDialog(null, "Error en el procesamiento.");
    }      
    
    
}
