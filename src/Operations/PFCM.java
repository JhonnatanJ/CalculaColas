/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operations;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 *
 * @author Jhonnatan
 */
public class PFCM {   
       
    public double factorial (double numero) {
        if (numero==0)
        return 1;
        else
        return numero * factorial(numero-1);
    }    
    
    public double SistemaVacio(double k,double m, double mu, double lambda){
        double sum=0;
        double sum2=0;
        double respuesta =0;
        for (int i=0; i<=k-1;i++){
            sum += ((factorial(m)/(factorial(m-i)*factorial(i)))*(Math.pow((lambda/mu),i))); 
        }
        for(double j=k;j<=m;j++){
            sum2 += ((factorial(m)/(factorial(m-j)*factorial(j)*(Math.pow(k,(j-k)))))*(Math.pow((lambda/mu),j)));
        }        
        respuesta = 1/(sum+sum2);
        return respuesta;
    }
    // EXACTAMENTE
    public double ExacNClientesSis(double n, double k, double m, double mu, double lambda){
        double respuesta = 0;
        double aux = 0;
        double P0 = SistemaVacio(k,m,mu,lambda);
        if(n<=k){            
            respuesta = ((P0)*((factorial(m))/(factorial(m-n)*(factorial(n))))*(Math.pow((lambda/mu),n)));
            return respuesta;
        }
        
        if(n>k){
            respuesta = (P0*((factorial(m))/((factorial((m-n)))*(factorial(k))*(Math.pow(k,(n-k)))))*(Math.pow((lambda/mu),n)));
            return respuesta;
        }
                
        return respuesta;
    }
    
    public double ExacNClientesCola(double n, double k, double m, double mu, double lambda){
        double respuesta = 0;
        double aux = 0;
        double P0 = SistemaVacio(k,m,mu,lambda);
        n = n+k;
        if(n<=k){            
            respuesta = ((P0)*((factorial(m))/(factorial(m-n)*(factorial(n))))*(Math.pow((lambda/mu),n)));
            return respuesta;
        }
        
        if(n>k){
            respuesta = (P0*((factorial(m))/((factorial((m-n)))*(factorial(k))*(Math.pow(k,(n-k)))))*(Math.pow((lambda/mu),n)));
            return respuesta;
        }
                
        return respuesta;
    }

    //MAXIMO
    public double MaxNClientesSis(double n, double k, double m, double mu, double lambda){
        double respuesta = 0;
        double aux = 0;
        double P0 = SistemaVacio(k,m,mu,lambda);
        aux += P0;
        for(int i=1;i<=n;i++){
            if(n<=k){            
                aux += ((P0)*((factorial(m))/(factorial(m-n)*(factorial(n))))*(Math.pow((lambda/mu),n)));
            }

            if(n>k){
                aux += (P0*((factorial(m))/((factorial((m-n)))*(factorial(k))*(Math.pow(k,(n-k)))))*(Math.pow((lambda/mu),n)));
            }
        }
        
        respuesta = aux;
        return respuesta;
    }
    public double MaxNClientesCola(double n, double k, double m, double mu, double lambda){
        double respuesta = 0;
        n = n+k;
        double aux = 0;
        double P0 = SistemaVacio(k,m,mu,lambda);
        aux += P0;
        for(int i=1;i<=n;i++){
            if(n<=k){            
                aux += ((P0)*((factorial(m))/(factorial(m-n)*(factorial(n))))*(Math.pow((lambda/mu),n)));
            }

            if(n>k){
                aux += (P0*((factorial(m))/((factorial((m-n)))*(factorial(k))*(Math.pow(k,(n-k)))))*(Math.pow((lambda/mu),n)));
            }
        }        
        respuesta = aux;
        return respuesta;
    }
    
    //AL MENOS
    public double AlmNClientesSis(double n, double k, double m, double mu, double lambda){
        double respuesta = 0;
        double aux = 0;
        double P0 = SistemaVacio(k,m,mu,lambda);
        aux += P0;
        for(int i=1;i<n;i++){
            if(n<=k){            
                aux += ((P0)*((factorial(m))/(factorial(m-n)*(factorial(n))))*(Math.pow((lambda/mu),n)));
            }

            if(n>k){
                aux += (P0*((factorial(m))/((factorial((m-n)))*(factorial(k))*(Math.pow(k,(n-k)))))*(Math.pow((lambda/mu),n)));
            }
        }
        
        respuesta = 1 - aux;
        return respuesta;
    }
    
    public double AlmNClientesCola(double n, double k, double m, double mu, double lambda){
        double respuesta = 0;
        n = n+k;
        double aux = 0;
        double P0 = SistemaVacio(k,m,mu,lambda);
        aux += P0;
        for(int i=1;i<n;i++){
            if(n<=k){            
                aux += ((P0)*((factorial(m))/(factorial(m-n)*(factorial(n))))*(Math.pow((lambda/mu),n)));
            }

            if(n>k){
                aux += (P0*((factorial(m))/((factorial((m-n)))*(factorial(k))*(Math.pow(k,(n-k)))))*(Math.pow((lambda/mu),n)));
            }
        }        
        respuesta = 1 - aux;
        return respuesta;
    }
    
    //PROBABILIDAD DE ESPERAR
    public double ProbEsperar(double n, double k, double m, double mu, double lambda){
        double respuesta = 0;
        double sum = 0;
        double P0 = SistemaVacio(k,m,mu,lambda);
        sum += P0;
        for(int i=1;i<=(k-1);i++){
            if(n<=k){            
                sum += ((P0)*((factorial(m))/(factorial(m-n)*(factorial(n))))*(Math.pow((lambda/mu),n)));
            }

            if(n>k){
                sum += (P0*((factorial(m))/((factorial((m-n)))*(factorial(k))*(Math.pow(k,(n-k)))))*(Math.pow((lambda/mu),n)));
            }
        }
        
        respuesta = 1 - sum;
        
        return respuesta;
    }
    
    //PROBABILIDAD DE NO ESPERAR
    public double ProbNoEsperar(double n, double k, double m, double mu, double lambda){
        double respuesta;
        double espera = ProbEsperar(n,k,m,mu,lambda);
        respuesta = 1 - espera;
        
        return respuesta;
    }

    //CLIENTES
    public double ClientesL(double k, double m, double mu, double lambda){
        double respuesta = 0;
        double sum=0,sum2=0, sum3=0;
        for(int i=0;i<=(k-1);i++){
            sum += (i*(ExacNClientesSis(i,k,m,mu,lambda)));
        }
        
        for(double j=k;j<=m;j++){
            sum2 += ((j-k)*(ExacNClientesSis(j,k,m,mu,lambda)));
        }
        
        for(double h=0;h<=(k-1);h++){
            sum3 += ExacNClientesSis(h,k,m,mu,lambda);
        }
        sum3 = k*(1-sum3);
        
        respuesta = sum + sum2 + sum3;
        
        return respuesta;
    }
    
    public double ClientesLq(double k, double m, double mu, double lambda){
        double respuesta = 0;
        double sum = 0;
        
        for(double i=k;i<=m;i++){
            sum += ((i-k)*(ExacNClientesSis(i,k,m,mu,lambda)));
        }        
        respuesta = sum;        
        return respuesta;
    }
    
    public double ClientesLn(double k, double m, double mu, double lambda) {
        double respuesta = 0;
        respuesta = ((ClientesLq(k,m,mu,lambda))/(ProbEsperar(k,k,m,mu,lambda)));       
        
        return respuesta;
    }
    
    
    //TIEMPO
    public double TiempoWq(double k, double m, double mu, double lambda){
        double respuesta = 0;
        
        respuesta = ((ClientesLq(k,m,mu,lambda))/((m-(ClientesL(k,m,mu,lambda)))*lambda));
                
        return respuesta;
    }
    
    public double TiempoW(double k, double m, double mu, double lambda){
        double respuesta = 0;
                
        respuesta = ((TiempoWq(k,m,mu,lambda))+ (1/mu));
        
        return respuesta;
    }
    
    public double TiempoWn(double k, double m, double mu, double lambda){
        double respuesta = 0;
        
        respuesta = ((TiempoWq(k,m,mu,lambda))/(ProbEsperar(k,k,m,mu,lambda)));        
        
        return respuesta;
    }
}

