package lab3p2_samuelzorto;

/**
 *
 * @author szorto
 */
public class Carro extends Vehiculos{
    protected int puertas, velocidad;
    protected String descripcion;

    public Carro() {
        super();
    }

    public Carro(int puertas, int velocidad, String descripcion, String color, String marca, String modelo, int anio, int precio, int llantas) {
        super(color, marca, modelo, anio, precio, llantas);
        this.puertas = puertas;
        this.velocidad = velocidad;
        this.descripcion = descripcion;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Carro{" + "puertas=" + puertas + ", velocidad=" + velocidad + ", descripcion=" + descripcion + '}';
    }
    
    
}
