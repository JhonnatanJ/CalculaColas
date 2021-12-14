/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoracolas;

import Operations.PICS;
import java.util.Scanner;

/**
 *
 * @author Jhonnatan
 */
public class CalculadoraColas {

    Scanner in = new Scanner(System.in);
    PICS pics = new PICS();
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
                    calcula.Costos();
                    
                break;
                case 2:
                    //PICM();
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
        double lambda=0, mu=0;
        
        System.out.println("INGRESE LOS VALORES EN HORAS");
        System.out.print("Ingrese lambda: ");
        lambda = in.nextFloat();
        System.out.print("Ingrese mu: ");
        mu = in.nextFloat();
        
        System.out.println("");
        System.out.println("==============================================================");
        System.out.println("");
        
        System.out.print("Estabilidad: " + pics.Estabilidad(lambda, mu)+"\n");
        System.out.print("Sistema Vacio - Po: " + pics.SistemaVacio(lambda, mu) + "\n");
        System.out.println("");
        System.out.println("--------------------------------------------------------");
        System.out.println("                    TIEMPOS");
        System.out.println("--------------------------------------------------------");
        System.out.println("");   
        
    }    
    
    public void Costos(){
        int opc = 0;
        
        System.out.println("Necesita Costos?");
        System.out.println("1. SI");
        System.out.println("2. NO");
        System.out.println("Escoja una opción");
        opc = in.nextInt();
        switch(opc){
            case 1:
                System.out.println("--------------------------------------------------------");
                System.out.println("                    COSTOS");
                System.out.println("--------------------------------------------------------");
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
