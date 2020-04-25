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
 
        BaseDatos calc = new BaseDatos(); //Se instancia la clase del modelo. 
        BDVsita cv = new BDVsita();
        
        /*boolean estado = false;
        do {
            try {
                cv.solicitarPrimerNumero(); //le decimos a la Vista que solicite el primer numero y se lo pase al controller
                cv.solicitarSegundoNumero(); //le decimos a la Vista que solicite el segundo numero y se lo pase al controller

                String operacion = cv.solicitarOperacion(); //le decimos a la Vista que solicite la operacion y la retorne
                switch (operacion) {
                    case "S":
                        cv.mostrarResultado(calc.suma());
                        estado = false;
                        break;
                    case "R":
                        cv.mostrarResultado(calc.resta());
                        estado = false;
                        break;

                    default:
                        throw new Exception();
                }
            }
            catch (NullPointerException e){
                cv.mostrarMensajePersonalizado(CalculadoraView.ERROR_VACIO); //se usa CalculadoraView.ERROR_VACIO y no cv.ERROR_VACIO por se varible estatica
            }
            catch (Exception e) {
                cv.mostrarMensajeErrorGeneral(); //este error se muestra x ej al dividir 2 entre 0
            }
        } while (estado == false); */
    }
}
