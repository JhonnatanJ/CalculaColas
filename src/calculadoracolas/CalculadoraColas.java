/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoracolas;

import Operations.PFCS;
import Operations.PICS;
import java.util.Scanner;

/**
 *
 * @author Jhonnatan
 */
public class CalculadoraColas {

    Scanner in = new Scanner(System.in);
    PICS pics = new PICS();
    PFCS pfcs = new PFCS();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        CalculadoraColas calcula = new CalculadoraColas();
        int opc=0;
        
        do{
            System.out.println("");
            System.out.println("==============================================================");
            System.out.println("==============================================================");
            System.out.println("");
            System.out.println("OPCIONES DE COLA");
            System.out.println("1. PICS ");
            System.out.println("2. PICM ");
            System.out.println("3. PFCS ");
            System.out.println("4. PFCM ");
            System.out.println("5. Salir");
            System.out.print("Escoja una opción:  ");        
            opc = in.nextInt();

            switch(opc){
                case 1:
                    System.out.println("");
                    System.out.println("--------------------------------------------------------");
                    System.out.println("                    PICS");
                    System.out.println("--------------------------------------------------------");
                    System.out.println("");
                    calcula.PICS();

                    System.out.println("\n--------------------------------------------------------");
                    System.out.println("--------------------------------------------------------");
                    System.out.println("");
                    //calcula.Costos();
                    
                break;
                case 2:
                    //PICM();
                    System.out.println("");
                    System.out.println("--------------------------------------------------------");
                    System.out.println("                    PICM");
                    System.out.println("--------------------------------------------------------");
                    System.out.println("");
                    calcula.PFCS();
                break;
                case 3:
                    //PFCS();
                    System.out.println("");
                    System.out.println("--------------------------------------------------------");
                    System.out.println("                    PFCS");
                    System.out.println("--------------------------------------------------------");
                    System.out.println("");
                    calcula.PFCS();

                case 5:
                    System.exit(0);

                default:
                        System.out.println("Opcion no existe");
            }
            System.out.println("");
            System.out.println("==============================================================");
            System.out.println("==============================================================");
            System.out.println("");
        }while( opc != 5);
    }
    
      
    
    
    public void PICS(){
        double lambda=0, mu=0,n;
        
        System.out.println("INGRESE LOS VALORES EN HORAS");
        System.out.print("Ingrese lambda: ");
        lambda = in.nextDouble();
        System.out.print("Ingrese mu: ");
        mu = in.nextDouble();
        System.out.print("Ingrese N clientes : ");
        n=in.nextDouble();
        
        System.out.println("");
        System.out.println("==============================================================");
        System.out.println("");
        
        System.out.print("Estabilidad: " + pics.Estabilidad(lambda, mu)+"\n");
        System.out.println("");
        System.out.println("--------------------------------------------------------");
        System.out.println("                    PROPABILIDADES");
        System.out.println("--------------------------------------------------------");
        System.out.println("");
        System.out.println("--------------------------------------------------------");
        System.out.println(" PROPABILIDAD EN EL SISTEMA");
        System.out.println("--------------------------------------------------------");
        System.out.println("");
        System.out.print("Sistema Vacio - Po: " + pics.SistemaVacio(lambda, mu) + "\n");
        System.out.println("");
        System.out.println("Sistema Ocupado- p: " + pics.SistemaOcupado(lambda, mu)+ "\n");
        System.out.println("");
        System.out.println("N de usuarios en el Sistema (al menos) "+n);
        System.out.println(pics.Nclientes(lambda, mu,n)+ "\n");
        System.out.println("");
        System.out.println("N de usuarios en el Sistema (Maximo) "+n);
        System.out.println(pics.NclientesMax(lambda, mu,n)+ "\n");
        System.out.println("");
        System.out.println("N de usuarios en el Sistema (Exactamente) "+n);
        System.out.println(pics.NclientesExac(lambda, mu,n)+ "\n");
        System.out.println("");
        System.out.println("--------------------------------------------------------");
        System.out.println(" PROPABILIDAD EN COLA");
        System.out.println("--------------------------------------------------------");
        System.out.println("");
        System.out.println("N de usuarios en Cola (al menos) "+n);
        System.out.println(pics.NclientesAlCola(lambda, mu,n)+ "\n");
        System.out.println("");
        System.out.println("N de usuarios en Cola (Maximo) "+n);
        System.out.println(pics.NclienteMaxCola(lambda, mu,n)+ "\n");
        System.out.println("");
        System.out.println("N de usuarios en Cola (Exactamente) "+n);
        System.out.println(pics.NclientesExacCola(lambda, mu,n)+ "\n");
        System.out.println("");
        System.out.println("--------------------------------------------------------");
        System.out.println("                    TIEMPOS");
        System.out.println("--------------------------------------------------------");
        System.out.println(""); 
        System.out.println("Tiempo Esperado en el Sistema - W ");
        System.out.println("");
        System.out.println(pics.TiempoW(lambda, mu)+ "\n");
        System.out.println("Tiempo Esperado en Cola - Wq ");
        System.out.println("");
        System.out.println(pics.TiempoWq(lambda, mu)+ "\n");
        System.out.println("Tiempo esperado en Cola para colas no vacias - Wn ");
        System.out.println(""); 
        System.out.println(pics.TiempoWn(lambda, mu)+ "\n");
        System.out.println("");
        System.out.println("--------------------------------------------------------");
        System.out.println("                    CLIENTES");
        System.out.println("--------------------------------------------------------");
        System.out.println(""); 
        System.out.println("Numero de Clientes en el Sistema- L "); 
        System.out.println(pics.ClientesL(lambda, mu)+ "\n");
        System.out.println(""); 
        System.out.println("Numero de Clientes en la Cola - Lq "); 
        System.out.println(pics.ClientesLq(lambda, mu)+ "\n");
        System.out.println("");
        System.out.println("Numero de Clientes en Cola no Vacia - Ln "); 
        System.out.println(pics.ClientesL(lambda, mu)+ "\n");
        System.out.println("");
        
    }    
    
    public void PFCS(){
        int opc = 0;
        double m=0;
         double lambda=0, mu=0,n;
        
        System.out.println("Numero de Poblacion Finita");
        System.out.println("1. SI");
        System.out.println("2. NO");
        System.out.println("Escoja una opción");
        opc = in.nextInt();
        switch(opc){
            case 1:
                System.out.println("--------------------------------------------------------");
                System.out.println("                    PFCS");
                System.out.println("--------------------------------------------------------");
                System.out.println("");
                System.out.println("Introdusca el numero de poblacion finita ");
                m  =in.nextDouble();
                 System.out.println("INGRESE LOS VALORES EN HORAS");
                 System.out.print("Ingrese lambda: ");
                 lambda = in.nextDouble();
                 System.out.print("Ingrese mu: ");
                 mu = in.nextDouble();
                 System.out.print("Ingrese N clientes : ");
                 n=in.nextDouble();
                 System.out.println("");  
                System.out.println("--------------------------------------------------------");
                System.out.println("                    PROBABILIDAD");
                System.out.println("--------------------------------------------------------");
                System.out.println("");
                System.out.println("Probabilidad de Sistema Vacio - Po "); 
                System.out.println(pfcs.SistemaVacio(m, mu, lambda) +"\n");
                System.out.println("");   
                System.out.println("Probabilidad de Sistema Ocupado - Pe ");
                System.out.println(pfcs.SistemaOcupado(m, mu, lambda) +"\n");
                System.out.println("");  
                System.out.println("--------------------------------------------------------");
                System.out.println(" PROBABILIDAD EN EL SISTEMA ");
                System.out.println("--------------------------------------------------------");
                System.out.println("");
                System.out.println("N de usuarios en el Sistema (Exacto) ");
                System.out.println(pfcs.NclientExac(n, m, mu, lambda)+"\n");
                System.out.println(""); 
                System.out.println("N de usuarios en el Sistema (Maximo) ");
                System.out.println(pfcs.NclientMax(n, m, mu, lambda)+"\n");
                System.out.println("");
                System.out.println("N de usuarios en el Sistema (Al Menos) ");
                System.out.println(pfcs.NclientAL(n, m, mu, lambda)+"\n");
                System.out.println("");
                System.out.println("--------------------------------------------------------");
                System.out.println(" PROBABILIDAD EN COLA ");
                System.out.println("--------------------------------------------------------");
                System.out.println("");  
                System.out.println("");
                System.out.println("N de usuarios en Cola (al menos) "+n);
                System.out.println(pfcs.NclientALCola(n, m, mu, lambda)+"\n");
                System.out.println("");
                System.out.println("N de usuarios en Cola (Maximo) "+n);
                System.out.println(pfcs.NclientMaxCola(n, m, mu, lambda)+ "\n");
                System.out.println("");
                System.out.println("N de usuarios en Cola (Exactamente) "+n);
                System.out.println(pfcs.NclientExacCola(n, m, mu, lambda)+ "\n");
                System.out.println("");
                System.out.println("--------------------------------------------------------");
                System.out.println("                    TIEMPOS");
                System.out.println("--------------------------------------------------------");
                System.out.println(""); 
                System.out.println("Tiempo Esperado en el Sistema - W ");
                System.out.println("");
                System.out.println(pfcs.TiempoW(m, lambda, mu)+ "\n");
                System.out.println("Tiempo Esperado en Cola - Wq ");
                System.out.println("");
                System.out.println(pfcs.TiempoWq(m, lambda, mu)+ "\n");
                System.out.println("Tiempo esperado en Cola para colas no vacias - Wn ");
                System.out.println(""); 
                System.out.println(pfcs.TiempoWn(m, lambda, mu)+ "\n");
                System.out.println("");
                System.out.println("--------------------------------------------------------");
                System.out.println("                    CLIENTES");
                System.out.println("--------------------------------------------------------");
                System.out.println(""); 
                System.out.println("Numero Esperado de Clientes en el Sistema- L "); 
                System.out.println(pfcs.ClientesL(m, lambda, mu)+ "\n");
                System.out.println(""); 
                System.out.println("Numero Esperado de Clientes en la Cola - Lq "); 
                System.out.println(pfcs.ClientesColaLq(m,lambda, mu)+ "\n");
                System.out.println("");
                System.out.println("Numero Esperado de Clientes en Cola no Vacia - Ln "); 
                System.out.println(pfcs.ClientesLn(m, lambda, mu)+ "\n");
                System.out.println("");
            break;    
                
            case 2:
                System.exit(0);
            break;
            
            default:
                System.out.println("Opcion no existe");
        }
    }
}
