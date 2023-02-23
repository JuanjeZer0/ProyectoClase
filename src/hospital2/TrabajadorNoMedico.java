
package hospital2;
enum Especialidad{ENFERMEROS,RECEPCIONISTAS,LIMPIADORES}

public abstract class TrabajadorNoMedico extends TrabajadorHospital {
    
    private String areaTrabajo;
    private Especialidad especialidad;
    
    TrabajadorNoMedico(String nombre,int id,double sueldo,String areaTrabajo,Especialidad especialidad){
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
  
}
