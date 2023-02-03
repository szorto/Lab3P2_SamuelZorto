package lab3p2_samuelzorto;

/**
 *
 * @author szorto
 */
public class Bici extends Vehiculos{
    protected String desc;
    protected int radio;
    protected boolean bmx;

    public Bici() {
        super();
    }

    public Bici(String desc, int radio, boolean bmx, String color, String marca, String modelo, int anio, int precio, int llantas) {
        super(color, marca, modelo, anio, precio, llantas);
        this.desc = desc;
        this.radio = radio;
        this.bmx = bmx;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public boolean isBmx() {
        return bmx;
    }

    public void setBmx(boolean bmx) {
        this.bmx = bmx;
    }

    @Override
    public String toString() {
        return "Bici{" + "desc=" + desc + ", radio=" + radio + ", bmx=" + bmx + '}';
    }
    
    
}
