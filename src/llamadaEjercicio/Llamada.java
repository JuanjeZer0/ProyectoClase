
package llamadaEjercicio;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import static java.time.temporal.ChronoUnit.MINUTES;
enum zona{ESPAÑA,AFRICA,EEUU,UCRANIA,RUSIA}
public class Llamada implements Comparable{
    

    /*Implementar la clase Llamada, que guardará los siguientes datos: número de teléfono del
cliente, número del interlocutor, atributo booleano que indique si la llamada es saliente, fecha y hora
del inicio de la llamada y del fin, atributo enumerado que indique la zona del interlocutor (suponer
cinco zonas con tarifas distintas) y tabla de constantes con las tarifas de las zonas en céntimos de
euro/minuto.*/
       
    private int numtelf;
    private int interlocutor;
    private boolean saliente;
    private LocalDateTime fechaHoraInicio;
    private LocalDateTime fechaHoraFinal;
    private zona zona;
    private double tabla[]={6,2,3,6.5,8};
    
    Llamada(int numtelf,int interlocutor,boolean saliente,LocalDateTime fechaHoraInicio,zona zona,LocalDateTime fechaHoraFinal,double tabla[]){
        this.fechaHoraFinal=fechaHoraFinal;
        this.fechaHoraInicio=fechaHoraInicio;
        this.numtelf=numtelf;
        this.tabla=tabla;
        this.saliente=saliente;
        this.interlocutor=interlocutor;
        this.zona=zona;
    }
        
    //gets
    
    public zona getZona() {
        return zona;
    }

    public LocalDateTime getFechaHoraFinal() {
        return fechaHoraFinal;
    }

    public LocalDateTime getFechaHoraInicio() {
        return fechaHoraInicio;
    }

    public int getNumtelf() {
        return numtelf;
    }

    public double[] getTabla() {
        return tabla;
    }

    public int getInterlocutor() {
        return interlocutor;
    }
    
    public boolean getSaliente() {
        return saliente;
    }
            
    //sets
    
    public void setZona(zona zona) {
        this.zona = zona;
    }

    public void setNumtelf(int numtelf) {
        this.numtelf = numtelf;
    }

    public void setSaliente(boolean saliente) {
        this.saliente = saliente;
    }

    public void setInterlocutor(int interlocutor) {
        this.interlocutor = interlocutor;
    }

    public void setFechaHoraFinal(LocalDateTime fechaHoraFinal) {
        this.fechaHoraFinal = fechaHoraFinal;
    }

    public void setFechaHoraInicio(LocalDateTime fechaHoraInicio) {
        this.fechaHoraInicio = fechaHoraInicio;
    }

    public void setTbala(double[] tarifa) {
        this.tabla = tabla;
    }
    
    
    //métodos
    
    long duracion(){
        return fechaHoraInicio.until(fechaHoraFinal,ChronoUnit.MINUTES);
    }
    
    public double tarifa(){
        duracion();
        double sol=0;
        if(!saliente){
            sol=0;
        }else{
            switch(zona){case AFRICA:
                sol=tabla[0]*duracion();
                break;
                case EEUU:
                    sol=tabla[1]*duracion();
                    break;
                    case ESPAÑA:
                        sol=tabla[2]*duracion();
                        break;
                        case RUSIA:
                            sol=tabla[3]*duracion();
                            break;
                            case UCRANIA:
                                sol=tabla[4]*duracion();
                            break;
            }
            
        }
        return sol;
    }

    @Override
    public String toString() {
        return "Llamada{" + "numtelf=" + numtelf + ", interlocutor=" + interlocutor + ", saliente=" + saliente + ", fechaHoraInicio=" + fechaHoraInicio + ", fechaHoraFinal=" + fechaHoraFinal + ", zona=" + zona + ", tabla=" + tabla +", duración="+duracion()+" , coste="+tarifa()+ '}';
    }
    
    
    @Override
    public int compareTo(Object o) {
        int res;
        Llamada otraLlamada=(Llamada)o;
        if (getNumtelf() < otraLlamada.getNumtelf()) {
           res = -1;
        }else if(getNumtelf() > otraLlamada.getNumtelf()){ 
           res = 1;
        }else{
           res=0;
    }
           return res;
        
    }
    
            
    
    
    

    
}
