package ec.edu.espol;

public class Administrador extends Usuario {

    public Administrador(String nombre, long cedula) {
        super(nombre, cedula);
    }

    public void gestionarPromociones(Promociones promo) {
        System.out.println("Gestión de promociones: " + promo);
    }

    public void gestionarPersonal(Personal personal) {
        System.out.println("Gestión de personal: " + personal);
    }

    public void gestionarCitas(GestorCitas gestor) {
        System.out.println("Gestión de citas: " + gestor);
    }

    @Override
    public String toString() {
        return "Administrador{" +
                "nombre='" + getNombre() + '\'' +
                ", cedula=" + getCedula() +
                '}';
    }
}
