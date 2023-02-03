package lab3p2_samuelzorto;

/**
 *
 * @author szorto
 */
public class Vehiculos {
    protected String color, marca, modelo;
    protected int anio, precio, llantas;

    public Vehiculos() {
    }

    public Vehiculos(String color, String marca, String modelo, int anio, int precio, int llantas) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.precio = precio;
        this.llantas = llantas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getLlantas() {
        return llantas;
    }

    public void setLlantas(int llantas) {
        this.llantas = llantas;
    }

    @Override
    public String toString() {
        return "Vehiculos{" + "color=" + color + ", marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + ", precio=" + precio + ", llantas=" + llantas + '}';
    }
    
    
}
