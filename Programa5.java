package programa5;
// el siguiente programa realiza la simulacion de login, cuando las credenciales son correctas 
// el programa avanza, de lo contrario da error de inicio de sesion
import java.util.Scanner;

public class Programa5{
    
    public static void main(String[] args){
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Ingrese usuario");
        String username = s.nextLine();
        
        System.out.println("Ingrese contrasenia");
        String password = s.nextLine();
        
        if (username.equals("admin") && password.equals("admin")){
            System.out.println("Inicio de sesion exitoso");
            
            Scanner entrada = new Scanner(System.in);
        float var1, var2, var3, var4, resultado, resultado2 = 0;
        int opc;
        
        do{ 
        System.out.println("\t---Figuras geometricas---");
        System.out.println("--- 1. Esfera");
        System.out.println("--- 2. Paralepipedo ");
        System.out.println("--- 3. Cono");
        System.out.println("--- 4. Cilindro");
        System.out.println("--- 5. Salir");
        
        System.out.println("Seleccione una opcion");
        opc = entrada.nextInt();
        
        switch(opc){
            case 1 -> {
                System.out.println("Ingrese el radio: ");
                var2 = entrada.nextFloat();
                
                resultado = (float) (4 * Math.PI * var2 * var2);
                resultado2 = (float) ((4 * Math.PI * var2 * var2 * var2));
                
                System.out.println("Area = " + resultado);
                System.out.println("Volumen =" + resultado2);
                break;
                
            }
            
            case 2 -> {
                System.out.println("Ingrese la altura: ");
                var1 = entrada.nextFloat();
                
                System.out.println("Ingresar el largo: ");
                var3 = entrada.nextFloat();
                
                System.out.println("Ingresar el ancho ");
                var4 = entrada.nextFloat();
                
                resultado = (float) ((2) * ((var1 * var3) + (var3 * var4) + (var1 * var4)));
                resultado2 = (float) (var1 * var3 * var4);
                
                System.out.println("Area = " + resultado);
                System.out.println("Volumen =" + resultado2);
                break;
            }
            
            case 3 -> {
                System.out.println("Ingrese la altura: ");
                var1 = entrada.nextFloat();
                
                System.out.println("Ingresar el radio: ");
                var2 = entrada.nextFloat();
                
                float numero1 = var1;
                float numero2 = var2;
                float cuadrado = (float) Math.pow(numero1, 2);
                float cuadrado2 = (float) Math.pow(numero2, 2);
                
                resultado = (float) ((Math.PI * var2) * (var2 + Math.sqrt(cuadrado + cuadrado2)));
                resultado2 = (float) ((Math.PI * var2 * var2 * var1) / (3));
                
                System.out.println("Area = " + resultado);
                System.out.println("Volumen =" + resultado2);
                break;
            }
            
            case 4 -> {
                System.out.println("Ingrese el radio: ");
                var2 = entrada.nextFloat();
                
                System.out.println("Ingrese la altura: ");
                var1 = entrada.nextFloat();
                
                resultado = (float) ((2 * Math.PI * var2) * (var2 + var1));
                resultado2 = (float) (Math.PI * var2 * var2 * var1);
                
                System.out.println("Area = " + resultado);
                System.out.println("Volumen = " + resultado2);
                break;
            }
            
            case 5 -> {
                System.out.println("Gracias por usar el programa");
                break;
            }
            
            default -> {
                System.out.println("La opcion no existe");
                break;
            }
            
             
            }
        
        }while (opc < 5);
        } else {
            System.out.println("Error al iniciar sesion");
        }
        
    }
    
    
}