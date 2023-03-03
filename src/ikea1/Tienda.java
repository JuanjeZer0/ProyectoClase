
package ikea1;

public class Tienda {
    
     private Producto[] productos;
     private int cantProductos;

     
    public Tienda(int cantidadMaximaProductos) {
        productos = new Producto[cantidadMaximaProductos];
        cantProductos = 0;
    }
    
    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }

    public int getcantProductos() {
        return cantProductos;
    }

    public void setcantProductos(int cantProductos) {
        this.cantProductos = cantProductos;
    }

    public Producto[] getProductos() {
        return productos;
    }
    
    public void agregarProducto(Producto productos){
         if (cantProductos < productos.length) {
            productos[cantProductos] = productos;
            cantProductos++;
    }
}
    
    
}
