package hoteles;

public class Hotel extends Alojamiento{
    private int estrellas;
    private boolean dasayunoIncluido;

    public Hotel() {
    }

    public Hotel(String nombre, double precioPorNoche, String ciudad, int estrellas, boolean dasayunoIncluido) {
        super(nombre, precioPorNoche, ciudad);
        this.estrellas = estrellas;
        this.dasayunoIncluido = dasayunoIncluido;
    }

    public Hotel(String nombre, double precioPorNoche, String ciudad, int estrellas) {
        super(nombre, precioPorNoche, ciudad);
        this.estrellas = estrellas;
        this.dasayunoIncluido = false;
    }

    public boolean isDasayunoIncluido() {
        return dasayunoIncluido;
    }

    public void setDasayunoIncluido(boolean dasayunoIncluido) {
        this.dasayunoIncluido = dasayunoIncluido;
    }

    public int getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(int estrellas) {
        this.estrellas = estrellas;
    }

    @Override
    public String toString() {
        return super.toString() + " (hotel de " + this.estrellas + "estrellas)";
    }

}
