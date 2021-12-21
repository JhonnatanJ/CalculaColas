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
public class PFCS {
    /////////Po//////////
    public double SistemaVacio(double m, double mu, double lambda){
        PFCS factor=new PFCS();
        double factorial=1;
        double acum=0;
        double respuesta=0;
         double fin=0;
        double fra=0;
        double a=factor.pobfac(m, mu, lambda);
        fra=lambda/mu;
        for (int i=0;i<=m;i++){
            double fc=0;
            fc=m-i;
            if(i==0){
                for(int j=1;j<=m;j++){

                factorial *=j;
                }
                    //factorial=(m-1)*m;
            }else{
                if(i==m || fc==1){
                 factorial=1;
                }else{  
                        factorial=1;
                        for(int k=1;k<=fc;k++){

                        factorial *=k;
                        }
                       //factorial=(fc-1)*fc; 
                }                
            }        
            fin=((a)/factorial)*(Math.pow(fra,i));  
            acum=acum+fin;
        }//
        respuesta=1/acum;
        return respuesta;
    }   
    
    public double pobfac(double m, double mu, double lambda){
        int fac=1;
        if(m==0){
            fac=1;
        }else{  
             for (int i=1;i<=m;i++){
                 fac*=i;
              }
        }   
        return fac;
    }
    /////SISTEMA Pe/////
    public double SistemaOcupado(double m, double mu, double lambda){
        PFCS factor=new PFCS();
        double respuesta=0;
        double vacio=0;
        vacio=factor.SistemaVacio(m, mu, lambda);
        respuesta=1-vacio;
        return respuesta;
    }
    //////////////////////PROBABILIDAD EN EL SISTEMA////////////////////////}
    ///EXACTAMENTE
    public double NclientExac(double n,double m, double mu, double lambda){
        PFCS factor=new PFCS();
        double respuesta=0;
        double fra=0;
        double p=0;
        double mfac=0;
        double factorial=1;

        fra=lambda/mu;
        p=factor.SistemaVacio(m, mu, lambda);
        mfac=factor.pobfac(m, mu, lambda);

             double fc=0;
            fc=m-n;
            if(n==0){
                for(int j=1;j<=m;j++){         
                factorial *=j;
                }
                    //factorial=(m-1)*m;
            }else{
                if(n==m || fc==1){
                 factorial=1;
                }else{  
                        factorial=1;
                        for(int k=1;k<=fc;k++){          
                        factorial *=k;
                        }
                       //factorial=(fc-1)*fc; 
                }                
            }   
        respuesta=((mfac/factorial)*(Math.pow(fra,n)))*p;
    return respuesta;
    }
    ////MAXIMO
    public double NclientMax(double n,double m, double mu, double lambda){
        PFCS factor=new PFCS();
        double factorial=1;
        double acum=0;
        double respuesta=0;
        double fin=0;
        double fra=0;
        double p=0;
        p=factor.SistemaVacio(m, mu, lambda);
        double a=factor.pobfac(m, mu, lambda);
        fra=lambda/mu;
        for (int i=0;i<=n;i++){
            double fc=0;
            fc=m-i;
            if(i==0){
                for(int j=1;j<=m;j++){

                factorial *=j;
                }
                    //factorial=(m-1)*m;
            }else{
                if(i==m || fc==1){
                 factorial=1;
                }else{  
                        factorial=1;
                        for(int k=1;k<=fc;k++){

                        factorial *=k;
                        }
                       //factorial=(fc-1)*fc; 
                }                
            }        
            fin=(((a)/factorial)*(Math.pow(fra,i)))*p;  
            acum=acum+fin;
        }//
        respuesta=acum;
        return respuesta;
    }
     ///AL MENOS///
    public double NclientAL(double n,double m, double mu, double lambda){
        PFCS factor=new PFCS();
        double factorial=1;
        double acum=0;
        double respuesta=0;
        double fin=0;
        double fra=0;
        double p=0;
        p=factor.SistemaVacio(m, mu, lambda);
        double a=factor.pobfac(m, mu, lambda);
        fra=lambda/mu;
        for (int i=0;i<n;i++){
            double fc=0;
            fc=m-i;
            if(i==0){
                for(int j=1;j<=m;j++){

                factorial *=j;
                }
                    //factorial=(m-1)*m;
            }else{
                if(i==m || fc==1){
                 factorial=1;
                }else{  
                        factorial=1;
                        for(int k=1;k<=fc;k++){

                        factorial *=k;
                        }
                       //factorial=(fc-1)*fc; 
                }                
            }        
            fin=(((a)/factorial)*(Math.pow(fra,i)))*p;  
            acum=acum+fin;
        }//
         respuesta=1-acum;
         return respuesta;
    }
     //////////////////////PROBABILIDAD EN COLA////////////////////
     ///EXACTAMENTE COLA
    public double NclientExacCola(double n,double m, double mu, double lambda){
        PFCS factor=new PFCS();
        double respuesta=0;
        double fra=0;
        double p=0;
        double mfac=0;
        double factorial=1;
        n=n+1;
        fra=lambda/mu;
        p=factor.SistemaVacio(m, mu, lambda);
        mfac=factor.pobfac(m, mu, lambda);

             double fc=0;
            fc=m-n;
            if(n==0){
                for(int j=1;j<=m;j++){         
                factorial *=j;
                }
                    //factorial=(m-1)*m;
            }else{
                if(n==m || fc==1){
                 factorial=1;
                }else{  
                        factorial=1;
                        for(int k=1;k<=fc;k++){          
                        factorial *=k;
                        }
                       //factorial=(fc-1)*fc; 
                }                
            }   
        respuesta=((mfac/factorial)*(Math.pow(fra,n)))*p;
        return respuesta;
    }
    ///MAXIMO COLA
    public double NclientMaxCola(double n,double m, double mu, double lambda){
        PFCS factor=new PFCS();
        double factorial=1;
        double acum=0;
        double respuesta=0;
        double fin=0;
        double fra=0;
        double p=0;
        p=factor.SistemaVacio(m, mu, lambda);
        double a=factor.pobfac(m, mu, lambda);
        fra=lambda/mu;
        for (int i=0;i<=n+1;i++){
            double fc=0;
            fc=m-i;
            if(i==0){
                for(int j=1;j<=m;j++){

                factorial *=j;
                }
                    //factorial=(m-1)*m;
            }else{
                if(i==m || fc==1){
                 factorial=1;
                }else{  
                        factorial=1;
                        for(int k=1;k<=fc;k++){

                        factorial *=k;
                        }
                       //factorial=(fc-1)*fc; 
                }                
            }        
            fin=(((a)/factorial)*(Math.pow(fra,i)))*p;  
            acum=acum+fin;
        }//
        respuesta=acum;
        return respuesta;
     }
     ////AL MENOS COLA
    public double NclientALCola(double n,double m, double mu, double lambda){
        PFCS factor=new PFCS();
        double factorial=1;
        double acum=0;
        double respuesta=0;
        double fin=0;
        double fra=0;
        double p=0;
        p=factor.SistemaVacio(m, mu, lambda);
        double a=factor.pobfac(m, mu, lambda);
        fra=lambda/mu;
        for (int i=0;i<=n;i++){
            double fc=0;
            fc=m-i;
            if(i==0){
                for(int j=1;j<=m;j++){

                factorial *=j;
                }
                    //factorial=(m-1)*m;
            }else{
                if(i==m || fc==1){
                 factorial=1;
                }else{  
                        factorial=1;
                        for(int k=1;k<=fc;k++){

                        factorial *=k;
                        }
                       //factorial=(fc-1)*fc; 
                }                
            }        
            fin=(((a)/factorial)*(Math.pow(fra,i)))*p;  
            acum=acum+fin;
        }//
        respuesta=1-acum;
        return respuesta;
    }
    ///////////TIEMPO//////////
    public double TiempoW(double m,double lambda, double mu){
        PFCS factor=new PFCS();
        double respuesta=0;
        double Wq=0;
        Wq=factor.TiempoWq(m, lambda, mu);
        respuesta= Wq+(1/mu);

        return respuesta;
    }
    
    public double TiempoWq(double m,double lambda, double mu){
        PFCS factor=new PFCS();
        double respuesta=0;
        double L=0;
        double Lq=0;
        Lq=factor.ClientesColaLq(m, lambda, mu);
        L=factor.ClientesL(m, lambda, mu);
        respuesta= Lq/((m-L)*lambda);  
        return respuesta;
     }
    
    public double TiempoWn(double m,double lambda, double mu){
        PFCS factor=new PFCS();
        double respuesta=0;
        double Pe=0;
        double Wq=0;
        Wq=factor.TiempoWq(m, lambda, mu);
        Pe=factor.SistemaOcupado(m, mu, lambda);
        respuesta=Wq/Pe;

        return respuesta;
     }
    
    //////////CLIENTES///////
    public double ClientesL(double m,double lambda, double mu){
        PFCS factor=new PFCS();
        double p=0;
        p=factor.SistemaVacio(m, mu, lambda);
        double respuesta=0;
        double fra=0;
        fra=mu/lambda;

        respuesta=m-fra*(1-p);
         return respuesta;
    }  
    
    public double ClientesColaLq(double m,double lambda, double mu){
        PFCS factor=new PFCS();
        double p=0;
        p=factor.SistemaVacio(m, mu, lambda);
        double respuesta=0;
        respuesta=m-((lambda+mu)/lambda) *(1-p);   
        return respuesta;
    }
    public double ClientesLn(double m,double lambda, double mu){
        PFCS factor=new PFCS();
        double Pe=0;
        double Lq=0;
        double respuesta=0;
        Pe=factor.SistemaOcupado(m, mu, lambda);
        Lq=factor.ClientesColaLq(m, lambda, mu);
        respuesta= Lq/Pe;
        return respuesta;
    }
}
