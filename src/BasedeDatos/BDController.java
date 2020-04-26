/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BasedeDatos;

/**
 *
 * @author Desa
 */
public class BDController {
    
    public void iniciar(){
 
        BaseDatos bd = new BaseDatos(); //Se instancia la clase del modelo. 
        BDVsita vista = new BDVsita();
        
        boolean estado = false;
        do {
            try {
                String trans = vista.solicitarTransaccion();
                switch (trans) {
                    case "E":
                        vista.solicitaDatosEmp();
                        estado = false;
                        break;
                    case "C":
                        vista.solicitaDatosClient();
                        estado = false;
                        break;
                    case "S":
                        vista.solicitaDatosServicio();
                        estado = false;
                        break;
                    case "K":
                        vista.solicitaDatosContrato();
                        estado = false;
                        break;
                    case "M":
                        vista.solicitarListaMostrar();
                        estado = false;
                        break;                        
                    case "Q":
                        estado = true;
                        break;
                    default:
                        throw new Exception();
                }    
            }
            catch (NullPointerException e){
                vista.muestraMsgerror(BDVsita.error); 
            }
            catch (Exception e) {
                vista.mostrarMsgerror1();
            }
        } while (estado == false); 
    }
}
