/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MantenimientosServicios1;


/**
 *
 * @author schav
 */
public class ControllerServicios {
 public void iniciar(){
      Servicios envia;
     envia = new Servicios();
      MantServicios mant = new MantServicios(); 
      
      mant.mostrarvista();
      
      /*if (ident.equals("G")){ 
        envia.setID(ID);
        envia.setNombreServicios(Nombre);
           
        envia.guardaremp(envia);
      }else {
        envia.mostraremp();
      }*/
             
     }    
}
