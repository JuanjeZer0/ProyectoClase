
package Socios;

import java.util.Comparator;

public class ComparaSocioConNombre implements Comparator{

    private int resultado;
    
     @Override
    public int compare(Object o1, Object o2) {
     Socio otroSocio = (Socio) o1;
     Socio otroSocio2 = (Socio) o2;
    if (otroSocio.nombre < otroSocio2.nombre){ //this va antes que otroSocio
    resultado = -1; //o cualquier número negativo
        }else if(otroSocio.nombre > otroSocio2.nombre){ //this va después que otroSocio
    resultado = 1; //o cualquier número positivo
        }else{ //this es igual que otroSocio
    resultado = 0;
    }
    //return resultado;
    return ((Socio) o1).nombre.compareTo(((Socio) o2).nombre);
    }
   
}
    

