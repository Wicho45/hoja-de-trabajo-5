package programa9;

import java.util.Scanner;

public class Programa9{
    
    public static void main(String[] args){
        
        Scanner sn = new Scanner(System.in);
        
        //peso1 = peso entre 9.8 y 10.2
        //peso2 = peso mayor a 10.2 
        //peso3 = peso menor a 9.8
        //piezas = cantidad total de piezas
        
        int peso1 = 0, peso2 = 0, peso3 = 0, piezas = 0;
        
        System.out.println("Ingrese el peso de la pieza (ingresar 0 para salir): ");
        double pieza = sn.nextDouble();
        
        while(pieza !=0){
            piezas++;
            
            if (pieza >= 9.8 && pieza <= 10.2){
                peso1++;
            }
            else if (pieza > 10.2){
                peso2++;
            }
            else if (pieza < 9.8){
                peso3++;
            }
            System.out.println("Ingrese el peso de la pieza (ingresar 0 para salir): ");
            pieza = sn.nextDouble();
        }
        System.out.println("Cantidad de piezas con peso entre 9.8 Kg y 10.2 Kg: " + peso1);
        System.out.println("Cantidad de piezas con mas de 10.2 Kg: " + peso2);
        System.out.println("Cantidad de piezas con menos de 9.8 Kg: " + peso3);
        System.out.println("Cantidad total de piezas: " + piezas);
    }
}