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
            
       public double Estabilidad(double lambda, double mu, double k){
           double respuesta = 0;
           respuesta = lambda / (mu * k);
           
           return respuesta;
       }
       ////////Po SISTEMA VACIO
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
    public double factoClientesCola(double lambda, double mu, double k,double n){/////cola n+k
        int fac=1;
    if(n==0){
        fac=1;
    }else{  
         for (int i=1;i<=n+k;i++){
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
    }///Pne
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
    //////////EXACTAMENTE EN COLA///////////
        
      public double ExaClienCola(double lambda, double mu, double k,double n){
        PICM llamada=new PICM();
         double respuesta=0;
         double factorial=0;
         factorial=llamada.facto(lambda, mu, k);
         double elev=0;
         elev=Math.pow(k,(n+k)-k);
         double fra=0;
         fra=lambda/mu;
         double Po=0;
         Po=llamada.SistemaVacio(lambda, mu, k);
         double facn=0;
         facn=llamada.factoClientesCola(lambda, mu, k, n);///cola
           if(n>=k){
               respuesta=((1/(factorial*elev))*(Math.pow(fra,n+k))*Po);
           }else{
               respuesta=((Po/facn)*(Math.pow(fra,n+k)));
           }              
      return respuesta;
      } 
      //////////MAXIMO EN COLA////
      public double MaxClienCola(double lambda, double mu, double k,double n){
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
      elev=Math.pow(k,(n+k)-k);
      facto=llamada.facto(lambda, mu, k);
      double factocli=0;
      factocli=llamada.factoClientesCola(lambda, mu, k, n);
      fra=lambda/mu;
        for(int i =0;i<=n+k;i++){          
          if(i>k){
              fin=((1/(facto*(Math.pow(k,(i)-k))))*(Math.pow(fra,i))*Po);//OJO           
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
          }
          acum=acum+fin;
        }//
         respuesta=acum;////////////OJO
        return respuesta;
    }
    ////AL MENOS EN COLA
     public double AlClienCola(double lambda, double mu, double k,double n){
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
      elev=Math.pow(k,(n+k)-k);
      facto=llamada.facto(lambda, mu, k);
      double factocli=0;
      factocli=llamada.factoClientesCola(lambda, mu, k, n);
      fra=lambda/mu;
        for(int i =0;i<=(n+k)-1;i++){          
          if(i>k){
              fin=((1/(facto*(Math.pow(k,(i)-k))))*(Math.pow(fra,i))*Po);//OJO           
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
          }
          acum=acum+fin;
        }//
         respuesta=1-acum;
        return respuesta;
    }
  /////////////TIEMPO////////////
    //////Tiempo esperado en el sistema: W
     public double TiempoW(double lambda, double mu, double k){
      PICM llamada=new PICM();   
       double respuesta=0;
       double p=0;
       double elev=0;
       double fra=0;
       fra=lambda/mu;
       elev=Math.pow(fra,k);
       p=llamada.SistemaVacio(lambda, mu, k);
       double resta=0;
       double ope=0;
       ope=((k*mu)-lambda);
       resta=k-1;
        int fac=1;
        if(resta==0){
            fac=1;
        }
         else{  
         for (int i=1;i<=resta;i++){
             fac*=i;
          }
        }
        respuesta=((mu*elev*p)/(fac*(Math.pow(ope,2))))+(1/mu);      
       return respuesta;
       } 
     
    public double TiempoWq(double lambda, double mu, double k){
     PICM llamada=new PICM();   
       double respuesta=0;
       double p=0;
       double elev=0;
       double fra=0;
       fra=lambda/mu;
       elev=Math.pow(fra,k);
       p=llamada.SistemaVacio(lambda, mu, k);
       double resta=0;
       double ope=0;
       ope=((k*mu)-lambda);
       resta=k-1;
        int fac=1;
        if(resta==0){
            fac=1;
        }
         else{  
         for (int i=1;i<=resta;i++){
             fac*=i;
          }
        }
        respuesta=((mu*elev*p)/(fac*(Math.pow(ope,2))));      
       return respuesta;
    }
    
   public double TiempoWn(double lambda, double mu, double k){
     PICM llamada=new PICM();   
       double respuesta=0;
       double Wq=0;
       double Pk=0;
       Wq=llamada.TiempoWq(lambda, mu, k);
       Pk=llamada.ProbabilidadKoMas(lambda, mu, k);
       respuesta=Wq/Pk;
       return respuesta;
   }
   ///////////CLIENTES 
     public double ClientesL(double lambda, double mu, double k){
     PICM llamada=new PICM();   
       double respuesta=0;
       double p=0;
       double elev=0;
       double fra=0;
       fra=lambda/mu;
       elev=Math.pow(fra,k);
       p=llamada.SistemaVacio(lambda, mu, k);
       double resta=0;
       double ope=0;
       ope=((k*mu)-lambda);
       resta=k-1;
        int fac=1;
        if(resta==0){
            fac=1;
        }
         else{  
         for (int i=1;i<=resta;i++){
             fac*=i;
          }
        }
        respuesta=(((mu*lambda*elev)/(fac*(Math.pow(ope,2))))*p)+(lambda/mu);      
       return respuesta;
    }
     public double ClientesLq(double lambda, double mu, double k){
     PICM llamada=new PICM();   
       double respuesta=0;
       double p=0;
       double elev=0;
       double fra=0;
       fra=lambda/mu;
       elev=Math.pow(fra,k);
       p=llamada.SistemaVacio(lambda, mu, k);
       double resta=0;
       double ope=0;
       ope=((k*mu)-lambda);
       resta=k-1;
        int fac=1;
        if(resta==0){
            fac=1;
        }
         else{  
         for (int i=1;i<=resta;i++){
             fac*=i;
          }
        }
        respuesta=((mu*lambda*elev*p)/(fac*(Math.pow(ope,2))));      
       return respuesta;
    } 
    public double ClientesLn(double lambda, double mu, double k){
     PICM llamada=new PICM();   
       double respuesta=0;
       double Lq=0;
       double Pk=0;
       Lq=llamada.ClientesLq(lambda, mu, k);
       Pk=llamada.ProbabilidadKoMas(lambda, mu, k);
       respuesta=Lq/Pk;
       return respuesta;
    } 
}
