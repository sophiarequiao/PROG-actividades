public class Producto {
    String nombre;
    double precio;
    int stock;

    public Producto(){
    }

    public Producto(String nombre, double precio, int stock){
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public double getPrecio(){
        return precio;
    }

    public void setPrecio(double precio){
        this.precio = precio;
    }

    public int getStock(){
        return stock;
    }

    public void setStock(int stock){
        this.stock = stock;
    }

    public double getPrecioConImpuesto(double impuesto){
        return precio * (1 + impuesto/100);
    }

    public double getPrecioTotalStock(){
        return precio * stock;
    }

    public void aumentarStock(int cantidad){
        stock += cantidad;
    }

    public void disminuirStock(int cantidad){
        stock -= cantidad;
    }

    public String toString(){
        return nombre + ", " + precio + "€, total en almacén: " + stock;
    }
}
