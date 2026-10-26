package hoteles;

public class Alojamiento {
    private String nombre;
    private double precioPorNoche;
    private String ciudad;

    public Alojamiento() {
    }

    public Alojamiento(String nombre, double precioPorNoche, String ciudad) {
        this.nombre = nombre;
        this.precioPorNoche = precioPorNoche;
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public double getPrecioPorNoche() {
        return precioPorNoche;
    }

    public void setPrecioPorNoche(double precioPorNoche) {
        this.precioPorNoche = precioPorNoche;
    }

    public double calcularPrecio(int noches){
        return this.precioPorNoche*noches;
    }

    @Override
    public String toString() {
        return nombre + ", en " + ciudad;
    }
}
