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
        // mira, yo escuche ahi que hay que tener un arraylist con todos lo vehiculos, pero YO, no me quiero complicar. Ahi si quiero boorar de una concesionaria, no se como hacerlo entontrarla en la global, y vice versa. si me corre, me funciona

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
                            System.out.println(con.get(con.size() - 1));
                            System.out.println("");
                            break;

                        case 2:
                            System.out.println("");
                            for (Concesionaria c : con) {
                                System.out.println(c);
                            }

                            System.out.print("Ingrese el id de la concesionaria que desea eliminar: ");
                            int eli = entrada.nextInt();
                            for (Concesionaria c : con) {
                                if (c.getId() == eli) {
                                    con.remove(eli);
                                }
                            }

                            break;

                        case 3:
                            System.out.println("");
                            for (Concesionaria c : con) {
                                System.out.println(c);
                            }
                            System.out.print("Ingrese el id de la concesionaria que desea modificar: ");
                            int elii = entrada.nextInt();
                            System.out.print("Cambie la direccion: ");
                            String dess = entrad.nextLine();
                            for (Concesionaria c : con) {
                                if (c.getId() == elii) {
                                    c.setDireccion(dess);
                                }
                            }
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
                            for (Cliente c : cli) {
                                if (c.getId() == eli) {
                                    cli.remove(eli);
                                }
                            }
                            break;
                    }

                    break;

                case 3:
                    for (Concesionaria c : con) {
                        System.out.println(c);
                    }
                    System.out.print("Ingrese la id de la concesionaria que desea elegir: ");
                    int ide = entrada.nextInt();
                    int pos = 0;
                    for (Concesionaria c : con) {
                        if (c.getId() == ide) {
                            System.out.println("");
                            System.out.println("Que desea hacer: \n"
                                    + "[1] Agregar\n"
                                    + "[2] Modificar\n"
                                    + "[3] Eliminar");
                            int no = entrada.nextInt();
                            switch (no) {
                                case 1:
                                    System.out.print("Ingrese el color: ");
                                    String color = entrad.nextLine();
                                    System.out.print("Ingrese la marca: ");
                                    String marca = entrad.nextLine();
                                    System.out.print("Ingrese el modelo: ");
                                    String modelo = entrad.nextLine();
                                    System.out.print("Ingrese el año de fabricación: ");
                                    int anio = entrada.nextInt();
                                    System.out.print("Ingrese precio: ");
                                    int precio = entrada.nextInt();
                                    System.out.print("Ingrese la cantidad de llantas: ");
                                    int llantas = entrada.nextInt();

                                    if (llantas == 2) {
                                        System.out.println("Elija una de las opciones:\n"
                                                + "[1] Motocicleta\n"
                                                + "[2] Bicicleta");
                                        int asd = entrada.nextInt();
                                        switch (asd) {
                                            case 1:
                                                System.out.print("Ingrese el desplazamiento del motor: ");
                                                int des = entrad.nextInt();
                                                System.out.print("Es electrico [s/n]: ");
                                                char elec = entrada.next().charAt(0);
                                                boolean el;
                                                switch (elec) {
                                                    case 's', 'S':
                                                        el = true;
                                                        break;
                                                    default:
                                                        el = false;
                                                        break;
                                                }
                                                c.getVehi().add(new Moto(des, el, color, marca, modelo, anio, precio, llantas));
                                                break;

                                            case 2:
                                                System.out.print("Ingrese descripcion: ");
                                                String desc = entrad.nextLine();
                                                System.out.print("Ingrese el radio de rueda: ");
                                                int rad = entrada.nextInt();
                                                System.out.print("Su bicileta es mbx [s/n]: ");
                                                char bm = entrada.next().charAt(0);
                                                boolean bmx;
                                                switch (bm) {
                                                    case 's', 'S':
                                                        bmx = true;
                                                        break;
                                                    default:
                                                        bmx = false;
                                                        break;
                                                }
                                                c.getVehi().add(new Bici(desc, rad, bmx, color, marca, modelo, anio, precio, llantas));
                                                break;
                                        }
                                    } else if (llantas == 4) {
                                        System.out.print("Ingrese la cantidad de puertas: ");
                                        int puertas = entrada.nextInt();
                                        System.out.print("Ingrese la descripcion del motor: ");
                                        String desc = entrad.nextLine();
                                        System.out.print("Ingrese la velicdad maxima: ");
                                        int vel = entrada.nextInt();
                                        c.getVehi().add(new Carro(puertas, vel, desc, color, marca, modelo, anio, precio, llantas));
                                    } else if (llantas > 4) {
                                        System.out.println("Elija una opcion: \n"
                                                + "[1] Camion de carga\n"
                                                + "[2] Bus");
                                        int aan = entrada.nextInt();
                                        switch (aan) {
                                            case 1:
                                                System.out.print("Ingrese volumen de carga: ");
                                                int vol = entrada.nextInt();
                                                System.out.print("Ingrese altura: ");
                                                int altura = entrada.nextInt();
                                                System.out.print("Tiene retroexcavadora [s/n]: ");
                                                char zx = entrada.next().charAt(0);
                                                boolean retro;
                                                switch (zx) {
                                                    case 's', 'S':
                                                        retro = true;
                                                        break;
                                                    default:
                                                        retro = false;
                                                        break;
                                                }
                                                c.getVehi().add(new Camion(vol, altura, retro, color, marca, modelo, anio, precio, llantas));
                                                break;

                                            case 2:
                                                int pasa;

                                                System.out.print("Ingrese la cantidad de pasajeros max: ");
                                                pasa = entrada.nextInt();
                                                String tipo = "";
                                                if (pasa > 50) {
                                                    tipo = "En ruta";
                                                } else if (pasa > 0) {
                                                    tipo = "Rapidito";
                                                }
                                                c.getVehi().add(new Bus(pasa, tipo, color, marca, modelo, anio, precio, llantas));
                                                break;

                                        }
                                    }

                                    break;

                                case 2:
                                    break;

                                case 3:
                                    break;
                            }
                        }
                        pos++;
                    }

                    break;

                case 4:
                    break;
            }

        } while (rep);

    } //kulo

}
