
package Examen71;

public class Test {
    
    public static void main(String[] args) {
        
        Viajes vuelo1=new Viajes("Paris", "Londres", "Juan", 3, 5);
        Pasajeros pa1=new Pasajeros("Peter", "Anguila", "24537C", "peter@gmail.com", 24537);
        Pasajeros pa2=new Pasajeros("Albert", "Benito", "63746F", "albert@gmail.com", 63746);
        
        //equals
        System.out.println(pa1.equals(pa2));
        
       
        
        
        
    }
    
}
