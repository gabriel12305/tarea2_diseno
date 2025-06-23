package ec.edu.espol;

@SuppressWarnings("all")
public class Cliente extends Usuario{
    private String gmail;

    private GestorMascota gestorM;
    private GestorCitas gestorC;
    //Falta Gestor Incidentes

    public Cliente(String gmail, String nombre, long cedula) {
        super(nombre, cedula);
        this.gmail = gmail;
    }
}
