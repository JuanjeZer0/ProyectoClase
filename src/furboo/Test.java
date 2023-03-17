
package furboo;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        
        Futbolista fut1=new Futbolista("Juan", 16, 12, "43668F");
        Futbolista fut2=new Futbolista("Mbappé", 34, 33, "63536D");
        Futbolista fut3=new Futbolista("Ronaldiño", 59, 344, "23234D");
        //equals
        System.out.println("Los futbolistas "+fut1.getNombre()+" y "+fut2.getNombre()+" son iguales? "+fut1.equals(fut2));
        
        //comparación
           Futbolista[] futbolistas = {fut1,fut2,fut3};    //Creamos la tabla
        System.out.println(Arrays.toString(futbolistas)); // La mostramos
        Arrays.sort(futbolistas);
        System.out.println(Arrays.toString(futbolistas));
        
        ComparadorFutbolistaGoles c =new ComparadorFutbolistaGoles();
        Arrays.sort(futbolistas, c);
        System.out.println( Arrays.toString(futbolistas));
  
    
    }
}
