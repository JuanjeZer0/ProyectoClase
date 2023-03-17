
package furboo;

public class Futbolista {
    //dni,nombre, edad y número de goles.
    
    private String nombre;
    private String dni;
    private int edad;
    private int numGoles;
    
    Futbolista(String nombre,int edad,int numGoles,String dni){
        this.dni=dni;
        this.edad=edad;
        this.nombre=nombre;
        this.numGoles=numGoles;
    }

    //gets
    public int getNumGoles() {
        return numGoles;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public int getEdad() {
        return edad;
    }
    
    //sets

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumGoles(int numGoles) {
        this.numGoles = numGoles;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    //métodos
    
    @Override
    public boolean equals(Object otro){
        boolean res = false;
        
        Futbolista Otro=(Futbolista)otro;
        
        if(this.getDni()==Otro.getDni()){
           res=true; 
        }
        return res;
    }
    
    @Override
    public String toString(){
        return "El nombre del futbolista es "+this.getNombre()+",el dn es "+this.getDni()+",su edad es "+this.getDni()+" y su número de goles "+this.getNumGoles();
    }
 
    @Override
    public int compare(Object o1, Object o2) {
          int resultado;
     Futbolista fut1 = (Futbolista) o1;
     Futbolista fut2 = (Futbolista) o2;
    if (fut1.getDni().charAt(0)< fut2.getDni().charAt(0)){ 
        resultado = -1; 
    }else if(fut1.getDni()> fut2.getDni()){ 
        resultado = 1; 
    }else{ 
        resultado = 0;
}  // return resultado;
    return ((fut1) o1).getDni().compareTo(((fut2) o2).getDni());
    }
    
    
}
