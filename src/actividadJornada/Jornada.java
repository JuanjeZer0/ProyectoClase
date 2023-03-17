
package actividadJornada;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Jornada implements Comparable{
    
    private String dni;
    private LocalDate fecha;
    private LocalTime hEntrada;
    private LocalTime hSalida;

    
    Jornada(String dni,LocalDate fecha,LocalTime hEntrada,LocalTime hSalida){
        this.dni=dni;
        this.fecha=fecha;
        this.hEntrada=hEntrada;
        this.hSalida=hSalida;

    }

    //gets

    public String getDni() {
        return dni;
    }

    public LocalTime gethEntrada() {
        return hEntrada;
    }

    public LocalTime gethSalida() {
        return hSalida;
    }

    public LocalDate getFecha() {
        return fecha;
    }
    
    //sets

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void sethSalida(LocalTime hSalida) {
        this.hSalida = hSalida;
    }

    public void sethEntrada(LocalTime hEntrada) {
        this.hEntrada = hEntrada;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
   
    int tiempoTrabajado() {
        return (int) hEntrada.until(hSalida, ChronoUnit.MINUTES);
    }
    
    //toString
     public String toString() {
        return "\nDNI: " + dni + " fecha: " + fecha
                + " minutos trabajados: " + tiempoTrabajado();
    }
     
     //compareTo
    @Override
    public int compareTo(Object ob) {
        int res = dni.compareTo(((Jornada) ob).dni); //cast directo
        if (res == 0) {
            res = fecha.compareTo(((Jornada) ob).fecha);
        }
        return res;
    }

   
}
    
    

