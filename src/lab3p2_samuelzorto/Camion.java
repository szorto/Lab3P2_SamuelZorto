package lab3p2_samuelzorto;

/**
 *
 * @author szorto
 */
public class Camion extends Vehiculos{
    protected int maxCarga, altura;
    protected boolean retro;

    public Camion() {
        super();
    }

    public Camion(int maxCarga, int altura, boolean retro, String color, String marca, String modelo, int anio, int precio, int llantas) {
        super(color, marca, modelo, anio, precio, llantas);
        this.maxCarga = maxCarga;
        this.altura = altura;
        this.retro = retro;
    }

    public int getMaxCarga() {
        return maxCarga;
    }

    public void setMaxCarga(int maxCarga) {
        this.maxCarga = maxCarga;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public boolean isRetro() {
        return retro;
    }

    public void setRetro(boolean retro) {
        this.retro = retro;
    }

    @Override
    public String toString() {
        return "Camion{" + "maxCarga=" + maxCarga + ", altura=" + altura + ", retro=" + retro + '}';
    }
    
    
}
