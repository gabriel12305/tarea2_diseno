package ec.edu.espol;

public abstract class Usuario {
    private String nombre;
    private long cedula;

    public Usuario(String nombre, long cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public long getCedula() {
        return cedula;
    }
}
