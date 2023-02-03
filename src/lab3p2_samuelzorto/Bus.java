package lab3p2_samuelzorto;

/**
 *
 * @author szorto
 */
public class Bus extends Vehiculos{
    protected int pasajeros; //menos de 50
    protected String tipo;

    public Bus() {
        super();
    }

    public Bus(int pasajeros, String tipo, String color, String marca, String modelo, int anio, int precio, int llantas) {
        super(color, marca, modelo, anio, precio, llantas);
        this.pasajeros = pasajeros;
        this.tipo = tipo;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Bus{" + "pasajeros=" + pasajeros + ", tipo=" + tipo + '}';
    }
    
    
}
