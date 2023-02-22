
package hospital1;
enum Especialidad{ENFERMEROS,RECEPCIONISTAS,LIMPIADORES}
public class NoMedico extends Trabajador {
    // Cada trabajador no médico tiene un área de trabajo asignada y enfermeros, recepcionistas, limpiadores
    
    private String areaTrabajo;
    
    private Especialidad especialidad;
    
    NoMedico(String nombre,int id,double sueldo,String areaTrabajo,Especialidad especialidad){
        super(nombre,id,sueldo);
        this.areaTrabajo=areaTrabajo;
        this.especialidad=especialidad;
    }

    public void setAreaTrabajo(String areaTrabajo) {
        this.areaTrabajo = areaTrabajo;
    }

    public void setespecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public Especialidad getespecialidad() {
        return especialidad;
    }

    public String getAreaTrabajo() {
        return areaTrabajo;
    }

   @Override
   public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("areaTrabajo: ").append(areaTrabajo).append(", ");
    sb.append("especialidad: ").append(especialidad).append("");
   
    return sb.toString();
}
}