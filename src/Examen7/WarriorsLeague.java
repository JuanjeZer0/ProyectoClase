
package Examen7;

public class WarriorsLeague {
    
    public static void main(String[] args) {
        
        Mago mago1=new Mago("Powerbazinga", 2, 4, 12, "Vara de la Locura");
        Mago mago2=new Mago("CR7", 23, 12, 23, "Mata Dioses");
        Arquero arquero1=new Arquero("NexxuzHD", 14, 2, 45, "El Legendario");
        Guerrero guerrero1=new Guerrero("Rubiuh", 2, 4, 23, "Espadón de Artorias");
        
        
        mago1.atacar();
        mago1.defender();
        mago2.atacar();
        mago2.defender();
        
        arquero1.atacar();
        arquero1.defender();
        
        guerrero1.atacar();
        guerrero1.defender();
        
        //comparacion entre los magos
        System.out.println("¿Los magos son iguales? "+mago1.equals(mago2));        
    
        //toString
        System.out.println(mago1);
        
    }
    
}
