package programa8;

import java.util.Scanner;

public class Programa8{
    
    public static void main(String[] args){
        
        Scanner sn = new Scanner(System.in);
        double nota1, nota2, nota3, nota4, promedio = 0;
        
        System.out.println("Bienvenido");
        
        System.out.println("Ingresar nota 1er. parcial: ");
        nota1 = sn.nextDouble();
        
        System.out.println("Ingresar nota 2do. parcial: ");
        nota2 = sn.nextDouble();
        
        System.out.println("Ingresar nota 3er. parcial: ");
        nota3 = sn.nextDouble();
        
        System.out.println("Ingresar nota 4to. parcial: ");
        nota4 = sn.nextDouble();
        
        //la nota1 cuenta con el 20%
        //la nota2 cuenta con el 20%
        //la nota3 cuenta con el 30%
        //la nota4 cuenta con el 30%
        
        promedio = (((nota1 * 0.2)+(nota2 * 0.2)+(nota3 * 0.3)+(nota4 * 0.3)));
        
        System.out.println("El promedio es: " + promedio);
        
        if (promedio >= 85){
            System.out.println("Excelente, aprobaste el curso");
        }
        if (promedio >= 80 && 84 >= promedio){
            System.out.println("Muy bueno, aprobaste el curso");
        }
        if (promedio >= 70 && 79 >= promedio){
            System.out.println("Bueno, aprobaste el curso");
        }
        if (promedio >= 60 && 69 >= promedio){
            System.out.println("Regular, aprobaste el curso");
        }
        if (promedio <= 59){
            System.out.println("Repite el curso");
        }
    }
}