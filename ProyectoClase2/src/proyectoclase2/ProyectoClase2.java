/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoclase2;

/**
 *
 * @author pc
 */
public class ProyectoClase2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
          //llama a la clse ByGonza
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ByGonza();
            }
        });//Aqui termina la llamada!
    }
    
}
