
package empresaMensajeria;

public class Repartidor {
    /*
    Nombre
Identificador único
Vehículo asignado (bicicleta, motocicleta o camión)
Estado de disponibilidad (por defecto "Disponible")
    */
    
    private String nombre;
    private int id;
    private enum vehiculo{BICICLETA, MOTOCICLETA,CAMION};
    private vehiculo vehiculo;
    private String estado;
    
    
    Repartidor(String nombre,int id,vehiculo vehiculo,String estado){
        this.nombre=nombre;
        this.id=id;
        this.vehiculo=vehiculo;
        this.estado=estado;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public vehiculo getvehiculo() {
        return vehiculo;
    }

    public void setvehiculo(vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String getestado() {
        return estado;
    }

    public void setestado(String estado) {
        this.estado = estado;
    }
    
    
    
    }
