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
        respuesta = Math.round(respuesta*100.0)/100.0;
        return respuesta;
    }
  
    public double SistemaVacio(double lambda, double mu){
        double respuesta = 0;
        respuesta = 1-(lambda/mu);
        respuesta = Math.round(respuesta*100.0)/100.0;
        return respuesta;
    } 
    
    public double SistemaOcupado(double lambda, double mu){
        double respuesta=0;
        respuesta= lambda/mu;
        respuesta = Math.round(respuesta*100.0)/100.0;
        return respuesta;
    }
    
    /////////////////PROBABILIDAD EN EL SISTEMA/////////////////
    public double Nclientes(double lambda, double mu,double n){
        PICS vacio = new PICS();
        double respuesta=0;
        double p=0;
        double fra=0;
        fra=lambda/mu;
        double res=0;
        double acum=0;
        p=vacio.SistemaVacio(lambda, mu);   
        for(int i=0;i<n;i++){   ////            
            res=p*(Math.pow(fra,i)); 
            acum=acum+res;
        }
        respuesta=1-acum;
        respuesta = Math.round(respuesta*100.0)/100.0;////
        return respuesta;
    }
    
    public double NclientesMax(double lambda, double mu,double n){
        PICS vacio = new PICS();
        double respuesta=0;
        double p=0;
        double fra=0;
        fra=lambda/mu;
        double res=0;
        double acum=0;
        p=vacio.SistemaVacio(lambda, mu);   
        for(int i=0;i<=n;i++){               
            res=p*(Math.pow(fra,i)); 
            acum=acum+res;
        }
        respuesta=acum;   
        respuesta = Math.round(respuesta*100.0)/100.0;
         return respuesta;
    }
    
    public double NclientesExac(double lambda, double mu,double n){
        PICS vacio = new PICS();
        double respuesta=0;
        double p=0;
        p=vacio.SistemaVacio(lambda, mu);   
        double fra=0;
        fra=lambda/mu;
        respuesta=p*(Math.pow(fra,n));
        respuesta = Math.round(respuesta*100.0)/100.0;
        return respuesta;
    }
    
    
    
    ////////PROBABILIDAD EN COLA////////
    public double NclientesAlCola(double lambda, double mu,double n){
        PICS vacio = new PICS();
        double respuesta=0;
        double p=0;
        double fra=0;
        fra=lambda/mu;
        double res=0;
        double acum=0;
        p=vacio.SistemaVacio(lambda, mu);   
        for(int i=0;i<=n;i++){             
            res=p*(Math.pow(fra,i)); 
            acum=acum+res;
        }
        respuesta=1-acum;
        respuesta = Math.round(respuesta*100.0)/100.0;
        return respuesta;
    }
    
    public double NclienteMaxCola(double lambda, double mu,double n){
        PICS vacio = new PICS();
         double respuesta=0;
        double p=0;
        double fra=0;
        fra=lambda/mu;
        double res=0;
        double acum=0;
        p=vacio.SistemaVacio(lambda, mu);   
        for(int i=0;i<=n+1;i++){               
            res=p*(Math.pow(fra,i)); 
            acum=acum+res;
        }
        respuesta=acum;       
        respuesta = Math.round(respuesta*100.0)/100.0;
         return respuesta;
    }
    
    public double NclientesExacCola(double lambda, double mu,double n){
        PICS vacio = new PICS();
        double respuesta=0;
        double p=0;
        p=vacio.SistemaVacio(lambda, mu);   
        double fra=0;
        fra=lambda/mu;
        respuesta=p*(Math.pow(fra,n+1));
        respuesta = Math.round(respuesta*100.0)/100.0;
        return respuesta;
    }
    
    //              TIEMPO 
    
    public double TiempoW(double lambda, double mu){
        double respuesta=0;
        respuesta=1/(mu-lambda);

        return respuesta;
    }
    
    public double TiempoWq(double lambda, double mu){
        double respuesta=0;
        respuesta=(lambda)/(mu*(mu-lambda));
        respuesta = Math.round(respuesta*100.0)/100.0;
        return respuesta;
     }
    
    public double TiempoWn(double lambda, double mu){
        double respuesta=0;
        respuesta=1/(mu-lambda);

        return respuesta;
    }
    
    //              CLIENTES    
    public double ClientesL(double lambda, double mu){
        double respuesta=0;
        respuesta=(lambda)/(mu-lambda);
        respuesta = Math.round(respuesta*100.0)/100.0;
        return respuesta;
    }
    
    public double ClientesLq(double lambda, double mu){
        double respuesta=0;
        respuesta=((lambda)*(lambda))/(mu*(mu-lambda));
        respuesta = Math.round(respuesta*100.0)/100.0;
        return respuesta;
    }
    
    public double ClientesLn(double lambda, double mu){
        double respuesta=0;
        respuesta=(lambda)/(mu-lambda);
        respuesta = Math.round(respuesta*100.0)/100.0;
        return respuesta;
    }
}