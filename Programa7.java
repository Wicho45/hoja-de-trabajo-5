package programa7;

// crea una matriz de n*m y la computadora agrega los numeros 
import java.util.Scanner;

import java.util.Random;

public class Programa7{
    
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de filas: ");
        int n = entrada.nextInt();
        
        System.out.println("Ingrese la cantidad de columnas: ");
        int m = entrada.nextInt();
        
        int[][] matriz = new int[n][m];
        
        Random random = new Random();
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++){
                matriz[i][j] = random.nextInt(999)+1;
            }
        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        
        entrada.close();
    }
}