package lab3p2_samuelzorto;

import java.util.ArrayList;

/**
 *
 * @author szorto
 */
public class Cliente {
    private String id, nomb;
    private ArrayList<Vehiculos> vehi = new ArrayList();
    private int saldo;

    public Cliente() {
    }

    public Cliente(String id, String nomb, int saldo) {
        this.id = id;
        this.nomb = nomb;
        this.saldo = saldo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNomb() {
        return nomb;
    }

    public void setNomb(String nomb) {
        this.nomb = nomb;
    }

    public ArrayList<Vehiculos> getVehi() {
        return vehi;
    }

    public void setVehi(ArrayList<Vehiculos> vehi) {
        this.vehi = vehi;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nomb=" + nomb + ", vehi=" + vehi + ", saldo=" + saldo + '}';
    }
    
    
}
