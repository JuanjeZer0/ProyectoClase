
package Socios;

import java.util.Arrays;

public class Test {
    
     public static void main(String[] args) {
        Socio s1 = new Socio(3, "Manuel", "11-07-2002");
        Socio s2 = new Socio(1, "Noelia", "21-11-2001");
        Socio s3 = new Socio(5, "Julio", "10-09-1999");
        //int resultado = s1.compareTo(s2);
        //System.out.println(resultado);
    
        Socio[] socios = {s1,s2,s3};    //Creamos la tabla
        System.out.println(Arrays.toString(socios)); // La mostramos
        Arrays.sort(socios);    // La ordenamos por su orden natural (Comparable)
        System.out.println(Arrays.toString(socios)); // La mostramos
        ComparaSocioConNombre c = new ComparaSocioConNombre(); // Creamos el objeto comparador
        Arrays.sort(socios,c);  // La ordenamos por el comprarador de nombres (Comparator)
        System.out.println(Arrays.toString(socios)); // La mostramos
    }
    
}
