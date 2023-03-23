
package archivo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Archivo {

    public static void main(String[] args) {
        // Crear el archivo de texto con números aleatorios
        File archivo = new File("numeros.txt");
        try {
            java.io.PrintWriter salida = new java.io.PrintWriter(archivo);
            for (int i = 0; i < 10; i++) {
                double numero = Math.random() * 100;
                salida.println(numero);
            }
            salida.close();
        } catch (FileNotFoundException e) {
            System.out.println("No se pudo crear el archivo.");
            System.exit(0);
        }
        
        // Abrir el archivo para lectura y leer línea por línea
        try {
            Scanner entrada = new Scanner(archivo);
            double suma = 0;
            while (entrada.hasNextLine()) {
                String linea = entrada.nextLine();
                double numero = Double.parseDouble(linea);
                suma += numero;
            }
            entrada.close();
            System.out.println("La suma de todos los números es: " + suma);
        } catch (FileNotFoundException e) {
            System.out.println("No se pudo abrir el archivo para lectura.");
            System.exit(0);
        }
    }
}


