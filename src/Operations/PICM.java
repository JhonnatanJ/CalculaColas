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
        
    public double factorial (double numero) {
        if (numero==0)
        return 1;
        else
        return numero * factorial(numero-1);
    }    
    
    public double Estabilidad(double lambda, double mu, double k){
        double respuesta = 0;
        respuesta = lambda / (mu * k);

        return respuesta;
    }    
    
       //////Po SISTEMA VACIO
    public double SistemaVacio(double lambda, double mu, double k){
        PICM llamada=new PICM();
    double respuesta=0;
    double acum=0;
    double frac=0;
    double fin=0;
    double multiplic=0;
    multiplic=llamada.mult(lambda, mu, k);
    frac=lambda/mu;
    double factorial=0;
        for(int i=0;i<=k-1;i++){
            if((i==0)||(i==1)){
               factorial=1;           
            }else{
                factorial=1;
                 for(int j=1;j<=i;j++){          
                   factorial *=j;
                 }           
              }          
           fin = (1/factorial)* (Math.pow(frac,i));
           acum=acum+fin;
        }
    respuesta=1/(acum+multiplic);
    return respuesta;
    }//
    public double mult(double lambda, double mu, double k){
      PICM llamada=new PICM();
    double respuesta=0;
    double fra=0;
    double factorial=0;
    factorial=llamada.facto(lambda, mu, k);
    fra=lambda/mu;
    respuesta= (1/factorial)*((Math.pow(fra,k))*((k*mu)/((k*mu)-lambda)));
    
    return respuesta;
    }
    public double facto(double lambda, double mu, double k){
        int fac=1;
    if(k==0){
        fac=1;
    }else{  
         for (int i=1;i<=k;i++){
             fac*=i;
          }
        }   
     return fac;
    }
    public double factoClientes(double lambda, double mu, double k,double n){
        int fac=1;
    if(n==0){
        fac=1;
    }else{  
         for (int i=1;i<=n;i++){
             fac*=i;
          }
        }   
     return fac;
    }
    ///La probabilidad de que un usuario que llega tenga que esperar, probabilidad de que haya k o
    //más usuarios en el sistema
    //////Pk
    public double ProbabilidadKoMas(double lambda, double mu, double k){
      PICM llamada=new PICM();
      double Pk=0;
      double Po=0;
      Po=llamada.SistemaVacio(lambda, mu, k);
      Pk=llamada.mult(lambda, mu, k);
      double respuesta=0;
           respuesta=Pk*Po;
    
        return respuesta;
    }
    public double UsuarioNoEspera(double lambda, double mu, double k){
      PICM llamada=new PICM();
      double respuesta=0;
      double Pk=0;
      Pk=llamada.ProbabilidadKoMas(lambda, mu, k);
      respuesta=1-Pk;
    return respuesta;
    }
    /////////PROBABILIDADES/////
    ////EXACTAMENTE DENTRO DEL SISTEMA
    public double ExacClienSis(double lambda, double mu, double k,double n){
      PICM llamada=new PICM();
      double respuesta=0;
      double factorial=0;
      factorial=llamada.facto(lambda, mu, k);
      double elev=0;
      elev=Math.pow(k,n-k);
      double fra=0;
      fra=lambda/mu;
      double Po=0;
      Po=llamada.SistemaVacio(lambda, mu, k);
      double facn=0;
      facn=llamada.factoClientes(lambda, mu, k, n);
        if(n>k){
            respuesta=((1/(factorial*elev))*(Math.pow(fra,n))*Po);
        }else{
            respuesta=((Po/facn)*(Math.pow(fra,n)));
        }   
      return respuesta;
    }
    /////MAXIMO EN EL SISTEMA
    public double MaxClienSis(double lambda, double mu, double k,double n){
      PICM llamada=new PICM();
      double respuesta=0;
      double Po=0;
      Po=llamada.SistemaVacio(lambda, mu, k);
      double factorial=1;
      double fra=0;
      double fin=0;
      double acum=0;
      double elev=0;
      double facto=0;
      elev=Math.pow(k,n-k);
      facto=llamada.facto(lambda, mu, k);
      fra=lambda/mu;
        for(int i =0;i<=n;i++){          
          if(n>k){
              respuesta=((1/(facto*elev))*(Math.pow(fra,n))*Po);//OJO
          }else{
               if((i==0)||(i==1)){
               factorial=1;
              }else{
                  factorial=1;
                  for(int j=1;j<=i;j++){
                     factorial*=j;
                  }                 
              }
              fin= ((Po/factorial)*(Math.pow(fra,i)));
              acum=acum+fin;
          }
        }//
        respuesta=acum;////////////OJO
        return respuesta;
    }    
    /////AL MENOS EN EL SISTEMA 
    public double AlClienSis(double lambda, double mu, double k,double n){
      PICM llamada=new PICM();
      double respuesta=0;
      double fin=0;
      double fra=0;
      double Po=0;
      double acum=0;
       fra=lambda/mu;
      Po=llamada.SistemaVacio(lambda, mu, k);
      double factorial=1;
       for(int i =0;i<n;i++){   
        if((i==0)||(i==1)){
               factorial=1;
              }else{
                  factorial=1;
                  for(int j=1;j<=i;j++){
                     factorial*=j;
                  }                 
              }
              fin= ((Po/factorial)*(Math.pow(fra,i)));
              acum=acum+fin;                    
       }
    respuesta=1-acum;
    return respuesta;
    }
}
