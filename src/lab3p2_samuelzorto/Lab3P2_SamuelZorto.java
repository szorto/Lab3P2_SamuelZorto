package lab3p2_samuelzorto;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab3P2_SamuelZorto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner entrad = new Scanner(System.in);
        ArrayList<Cliente> cli = new ArrayList();
        ArrayList<Concesionaria> con = new ArrayList();
        
        boolean rep = true;
        
        
        do{
            System.out.println("Ingrese la opcion que desea elegir:\n"
                    + "[1] CRUD Concesionaria\n"
                    + "[2] CRUD Clientes\n"
                    + "[3] CRUD Vehiculos\n"
                    + "[4] Compra/Venta de vehiculos pedido por el cliente");
            int menunu = entrada.nextInt();
            switch(menunu){
                case 1:
                    System.out.print("Ingrese el nombre: ");
                    String nomb = entrad.nextLine();
                    System.out.print("Ingrese la direccion: ");
                    String dir = entrad.nextLine();
                    System.out.print("Ingrese su $$$: ");
                    int sald = entrada.nextInt();
                    int id = con.size();
                    con.add(new Concesionaria(nomb, id, dir, sald));
                    System.out.println(con);
                    break;
                    
                    
                case 2:
                    break;
                    
                    
                case 3:
                    break;
                    
                    
                case 4:
                    break;
            }
            
        }while(rep);
        
    }
    
}
