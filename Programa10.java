package programa10;

//calcula el factorial del numero ingresado por el usuario
import java.util.Scanner;

public class Programa10{
    
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese un numero: ");
        long numero = entrada.nextLong();
        
        long factorial = factorial(numero);
        
        System.out.println(numero + "! = " + factorial);
        
    }
    public static long factorial(long n){
        if (n == 0){
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }
}