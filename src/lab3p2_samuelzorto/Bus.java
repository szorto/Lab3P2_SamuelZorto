package lab3p2_samuelzorto;

/**
 *
 * @author szorto
 */
public class Bus extends Vehiculos {

    protected int pasajeros; //menos de 50
    protected String tipo;

    public Bus() {
        super();
    }

    public Bus(int pasajeros, String tipo, String color, String marca, String modelo, int anio, int precio, int llantas) {
        super(color, marca, modelo, anio, precio, llantas);

        this.pasajeros = pasajeros;
        if(pasajeros > 50){
            this.tipo = "En ruta";
        }else if(pasajeros > 0){
            this.tipo = "Rapidito";
        }
        
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
        if(pasajeros > 50){
            this.tipo = "En ruta";
        }else if(pasajeros > 0){
            this.tipo = "Rapidito";
        }
    }

    @Override
    public String toString() {
        return "Bus{" + "pasajeros=" + pasajeros + ", tipo=" + tipo + '}';
    }

}
