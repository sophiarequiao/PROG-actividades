public class Equipo {
    private String nombre;
    private int anyoFundacion;
    private Jugador jugador1;
    private Jugador jugador2;
    private Jugador jugador3;

    public Equipo(String nombre, int anyoFundacion, Jugador jugador1, Jugador jugador2, Jugador jugador3) {
        this.nombre = nombre;
        this.anyoFundacion = anyoFundacion;
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.jugador3 = jugador3;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnyoFundacion() {
        return anyoFundacion;
    }

    public void setAnyoFundacion(int anyoFundacion) {
        this.anyoFundacion = anyoFundacion;
    }

    public Jugador getJugador1() {
        return jugador1;
    }

    public void setJugador1(Jugador jugador1) {
        this.jugador1 = jugador1;
    }

    public Jugador getJugador2() {
        return jugador2;
    }

    public void setJugador2(Jugador jugador2) {
        this.jugador2 = jugador2;
    }

    public Jugador getJugador3() {
        return jugador3;
    }

    public void setJugador3(Jugador jugador3) {
        this.jugador3 = jugador3;
    }

    public int getAnyoCentenario(){
        return this.anyoFundacion + 100;
    }

    public String getDetalles(){
        return "El equipo " + this.nombre + " tiene los siguientes jugadores: " +
                "- " + this.jugador1.getNombre() + ", con dorsal " + this.jugador1.getDorsal() + " y " + this.jugador1.getExperiencia() + " años de experiencia" +
                "- " + this.jugador2.getNombre() + ", con dorsal " + this.jugador2.getDorsal() + " y " + this.jugador2.getExperiencia() + " años de experiencia" +
                "- " + this.jugador3.getNombre() + ", con dorsal " + this.jugador3.getDorsal() + " y " + this.jugador3.getExperiencia() + " años de experiencia";
    }
}
