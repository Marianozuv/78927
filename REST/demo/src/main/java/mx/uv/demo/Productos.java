package mx.uv.demo;

public class Productos {

    Integer cantidad;
    String nombre;
    public Productos(String nombre, Integer cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }
    

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
   
    public Integer getCantidad() {
        return cantidad;
    }
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
    
}
