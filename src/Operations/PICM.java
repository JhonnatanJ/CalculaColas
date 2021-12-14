/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operations;

/**
 *
 * @author Jhonnatan
 */
public class PICM {
            
       public double Estabilidad(double lambda, double mu, int numServidores){
           double respuesta = 0;
           respuesta = lambda / (mu * numServidores);
           
           return respuesta;
       }
        
        
      
    
}
