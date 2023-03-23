
package deportista;

import java.util.Scanner;

public class Deportista {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el nombre del deportista:");
        String nombre = scanner.next();
        
        System.out.print("Ingrese la edad del deportista:");
        int edad = scanner.nextInt();
        
        System.out.print("Ingrese la estatura del deportista en metros:");
        double estatura = scanner.nextDouble();
        
        System.out.println("Los datos del deportista son:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Estatura: " + estatura + " m");
        
        scanner.close();
    }
}


