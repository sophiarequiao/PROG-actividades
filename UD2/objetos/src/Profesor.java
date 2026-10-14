import java.time.LocalDate;

public class Profesor {
    String nombre;
    String modulo;
    int anyoIncorporacion;

    public Profesor(String nombre, String modulo, int anyoIncorporacion) {
        this.nombre = nombre;
        this.modulo = modulo;
        this.anyoIncorporacion = anyoIncorporacion;
    }

    public Profesor(int anyoIncorporacion, String nombre) {
        this.anyoIncorporacion = anyoIncorporacion;
        this.nombre = nombre;
        modulo = "Programación";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnyoIncorporacion() {
        return anyoIncorporacion;
    }

    public void setAnyoIncorporacion(int anyoIncorporacion) {
        this.anyoIncorporacion = anyoIncorporacion;
    }

    public String getModulo() {
        return modulo;
    }

    public void setModulo(String modulo) {
        this.modulo = modulo;
    }

    public int getAnyos(){
        return LocalDate.now().getYear() - anyoIncorporacion;
    }

    public String toString(){
        return nombre + ", profesor de " + modulo;
    }
}
