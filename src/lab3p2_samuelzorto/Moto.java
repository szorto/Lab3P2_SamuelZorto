package lab3p2_samuelzorto;

/**
 *
 * @author szorto
 */
public class Moto extends Vehiculos{
    protected int desplaza;
    protected boolean electric;

    public Moto() {
        super();
    }

    public Moto(int desplaza, boolean electric, String color, String marca, String modelo, int anio, int precio, int llantas) {
        super(color, marca, modelo, anio, precio, llantas);
        this.desplaza = desplaza;
        this.electric = electric;
    }

    public int getDesplaza() {
        return desplaza;
    }

    public void setDesplaza(int desplaza) {
        this.desplaza = desplaza;
    }

    public boolean isElectric() {
        return electric;
    }

    public void setElectric(boolean electric) {
        this.electric = electric;
    }

    @Override
    public String toString() {
        return "Moto{" + "desplaza=" + desplaza + ", electric=" + electric + '}';
    }
    
    
}
