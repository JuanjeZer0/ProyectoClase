
package Socios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Socio implements Comparable{
    
      int id;
    String nombre;
    LocalDate fechaNacimiento;
    public Socio(int id, String nombre, String fechaNacimiento) {
    this.id = id;
    this.nombre = nombre;
    //establecemos el formato español para las fechas:
    DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    this.fechaNacimiento = LocalDate.parse(fechaNacimiento, f);
    }
    int edad() {
    return (int) fechaNacimiento.until(LocalDate.now(), ChronoUnit.YEARS);
    }
    @Override
    public int compareTo(Object otro) {
    int resultado;
    Socio otroSocio = (Socio) otro;
    if (id < otroSocio.id){ //this va antes que otroSocio
    resultado = -1; //o cualquier número negativo
    }else if(id > otroSocio.id){ //this va después que otroSocio
    resultado = 1; //o cualquier número positivo
    }else{ //this es igual que otroSocio
    resultado = 0;
    }
    return resultado;
    }
        @Override
        public String toString() {

    return "\nId: " + id + " Nombre: " + nombre + " Edad: " + edad();
    }
    
}
