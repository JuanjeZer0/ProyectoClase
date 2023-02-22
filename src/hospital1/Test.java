
package hospital1;

public class Test {
    public static void main(String[] args) {
        
        Trabajador trabajadores=new Trabajador("Pepe", 34, 2300);
        Medico Medicos=new Medico("Aurelio", 34, 1380, 35, 12, 6,Especialidad.ENFERMEROS);
        NoMedico NoMedicos=new NoMedico("Alfred", 55, 4000,"Planta B", Especialidad.LIMPIADORES);
        
        System.out.println(trabajadores);
        System.out.println("-----------");
        System.out.println(Medicos);
        System.out.println("-----------");
        System.out.println(NoMedicos);
        System.out.println("-----------");
    }
}
