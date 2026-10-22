public class Curso {
    private String nombre;
    private int anyo;
    private Alumno alumno;
    private Profesor profesor;

    public Curso(String nombre, Profesor profesor, Alumno alumno, int anyo) {
        this.nombre = nombre;
        this.profesor = profesor;
        this.alumno = alumno;
        this.anyo = anyo;
    }

    public Curso() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public String toString() {
        return nombre + " - Alumno:" + this.alumno.getNombre() +
                " - Profesor: " + this.profesor.getNombre() +
                " - Media: " + this.alumno.getMedia();
    }
}
