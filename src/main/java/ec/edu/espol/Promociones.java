package ec.edu.espol;

public class Promociones {
    private double descuento;

    public Promociones(double descuento) {
        this.descuento = descuento;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        return "Promociones{" +
                "descuento=" + descuento +
                '}';
    }
}
