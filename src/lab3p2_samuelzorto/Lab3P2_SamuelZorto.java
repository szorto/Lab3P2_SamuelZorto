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

        do {
            System.out.println("Ingrese la opcion que desea elegir:\n"
                    + "[1] CRUD Concesionaria\n"
                    + "[2] CRUD Clientes\n"
                    + "[3] CRUD Vehiculos\n"
                    + "[4] Compra/Venta de vehiculos pedido por el cliente");
            int menunu = entrada.nextInt();
            switch (menunu) {
                case 1:
                    System.out.println("Que desea hacer: \n"
                            + "[1] Agregar\n"
                            + "[2] Eliminar\n"
                            + "[3] Modificar");
                    int que = entrada.nextInt();
                    switch (que) {
                        case 1:
                            System.out.println("");
                            System.out.print("Ingrese el nombre: ");
                            String nomb = entrad.nextLine();
                            System.out.print("Ingrese la direccion: ");
                            String dir = entrad.nextLine();
                            System.out.print("Ingrese su $$$: ");
                            int sald = entrada.nextInt();
                            int id = 0;
                            for (Concesionaria c : con) {
                                if (c.getId() >= id) {
                                    id = c.getId() + 1;
                                }
                            }
                            con.add(new Concesionaria(nomb, id, dir, sald));
                            System.out.println(con.get(con.size()-1));
                            System.out.println("");
                            break;
                            
                        case 2:
                            for (Concesionaria c : con) {
                                System.out.println(c);
                            }
                            
                            System.out.print("Ingrese el id del cliente que desea eliminar: ");
                            int eli = entrada.nextInt();
                            con.remove(eli);
                            break;
                    }

                    break;

                case 2:
                    System.out.println("Que desea hacer: \n"
                            + "[1] Agregar\n"
                            + "[2] Eliminar");
                    int quu = entrada.nextInt();
                    switch (quu) {
                        case 1:
                            System.out.println("");
                            System.out.println("Ingrese el nombre: ");
                            String nombb = entrad.nextLine();
                            System.out.println("Ingrese su $$$: ");
                            int sal = entrada.nextInt();
                            int id = 0;
                            for (Cliente c : cli) {
                                if (c.getId() >= 0) {
                                    id = c.getId() + 1;
                                }
                            }
                            cli.add(new Cliente(id, nombb, sal));
                            System.out.println(cli);
                            System.out.println("");
                            break;
                            
                        case 2:
                            for (Cliente c : cli) {
                                System.out.println(c);
                            }
                            
                            System.out.print("Ingrese el id del cliente que desea eliminar: ");
                            int eli = entrada.nextInt();
                            cli.remove(eli);
                            break;
                    }

                    break;

                case 3:
                    break;

                case 4:
                    break;
            }

        } while (rep);

    }

}
