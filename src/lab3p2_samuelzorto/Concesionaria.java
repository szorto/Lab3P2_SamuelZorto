package lab3p2_samuelzorto;

import java.util.ArrayList;

/**
 *
 * @author szorto
 */
public class Concesionaria {
    private String nomb, direccion;
    private ArrayList<Vehiculos> vehi = new ArrayList();
    private ArrayList<Cliente> cli = new ArrayList();
    private int saldo, id;

    public Concesionaria() {
    }

    public Concesionaria(String nomb, int id, String direccion, int saldo) {
        this.nomb = nomb;
        this.id = id;
        this.direccion = direccion;
        this.saldo = saldo;
    }

    public String getNomb() {
        return nomb;
    }

    public void setNomb(String nomb) {
        this.nomb = nomb;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Vehiculos> getVehi() {
        return vehi;
    }

    public void setVehi(ArrayList<Vehiculos> vehi) {
        this.vehi = vehi;
    }

    public ArrayList<Cliente> getCli() {
        return cli;
    }

    public void setCli(ArrayList<Cliente> cli) {
        this.cli = cli;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Concesionaria   " + "nomb: " + nomb + "/ id: " + id + "/ direccion: " + direccion + "/ vehi: " + vehi + "/ cli: " + cli + "/ saldo: " + saldo;
    }
    
    
}
