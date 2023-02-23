
package hospital2;
enum Especialidad{CARDIOLOGO,PEDIATRA,CIRUJANOS}
public abstract class Medico extends TrabajadorHospital {
    private int numeroColegiado;
    private int numeroPacientes;
    private int numeroPacientesAtendidos;
    private Especialidad especialidad;
    
    Medico(String nombre,int id,double sueldo,int numeroColegiado,int numeroPacientes,int numeroPacientesAtendidos,Especialidad especialidad){
        super(nombre,id,sueldo);
        this.numeroColegiado=numeroColegiado;
        this.numeroPacientes=numeroPacientes;
        this.numeroPacientesAtendidos=numeroPacientesAtendidos;
        this.especialidad=especialidad;
    }
    
    public void setnumeroColegiado(int numeroColegiado){this.numeroColegiado=numeroColegiado;}
    public int getnumeroColegiado(){return numeroColegiado;}
    
    public void setnumeroPacientes(int numeroPacientes){this.numeroPacientes=numeroPacientes;}
    public int numeroPacientes(){return numeroPacientes;}
    
    public void setnumeroPacientesAtendidos(int numeroPacientesAtendidos){this.numeroPacientesAtendidos=numeroPacientesAtendidos;}
    public int getnumeroPacientesAtendidos(){return numeroPacientesAtendidos;}

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }
    public Especialidad getEspecialidad() {
        return especialidad;
    }
    
    
    
}
