package programa6;

//Hace las operaciones de a + b y c * d 
//restringiendo los datos a numeros enteros

import java.util.Scanner;

public class Programa6{
    
    public static void main(String[] args){
        
        Scanner sn = new Scanner(System.in);
        
        //Usar int para restringir el tipo de dato a entero
        
        System.out.println("Ingrese el 1er. numero: ");
        int a = sn.nextInt();
        
        System.out.println("Ingresar 2do. numero");
        int b = sn.nextInt();
        
        System.out.println("Ingrese el 3er. numero: ");
        int c = sn.nextInt();
        
        System.out.println("Ingrese el 4to. numero");
        int d = sn.nextInt();
        
        int suma = (a + b);
        int producto = (c * d);
        
        System.out.println("La suma del 1er. numero + el 2do. numero = " + suma);
        System.out.println("El producto del 3er. numero * el 4to. numero = " + producto);
        
    }
}