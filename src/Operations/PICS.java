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
public class PICS {
    
    public double Estabilidad(double lambda, double mu){
        double respuesta = 0;
        respuesta = lambda/mu;
        
        return respuesta;
    }
  
    public double SistemaVacio(double lambda, double mu){
        double respuesta = 0;
        respuesta = 1-(lambda/mu);

        return respuesta;
    } 
}