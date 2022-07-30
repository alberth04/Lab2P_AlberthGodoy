/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2p2_alberthgodoy;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author godoy
 */
public class Lab2P2_AlberthGodoy {

    public static void main(String[] args) {
        ArrayList clientes = new ArrayList();
        ArrayList empleados = new ArrayList();
        ArrayList autos = new ArrayList();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el usuario: ");
        String usuario = sc.next();

        System.out.println("Ingrese la contraseña: ");
        String contraseña = sc.next();

        while (!usuario.equals("admin") || !contraseña.equals("admin1234")) {
            System.out.println("Ingrese el usuario: ");
            usuario = sc.next();

            System.out.println("Ingrese la contraseña: ");
            contraseña = sc.next();

        }

        int opcionMenu = 0;
        while (opcionMenu != 4) {
            System.out.println("=========MENU==========");
            System.out.println("\t1.)Clientes");
            System.out.println("\t2.)Empleados");
            System.out.println("\t3.)Carros");
            System.out.println("\t4.)Salir");
            opcionMenu = sc.nextInt();
            switch (opcionMenu) {
                case 1: {
                    int opcionMenu2 = 0;
                    while (opcionMenu2 != 6) {
                        System.out.println("=====SubMenu Cliente===========");
                        System.out.println("\t1.)Crear cliente");
                        System.out.println("\t2.)Modificar Cliente");
                        System.out.println("\t3.)Eliminar Cliente");
                        System.out.println("\t4.)Listar Clientes");
                        System.out.println("\t5.)Listar Carros por Cliente");
                        System.out.println("\t6.)Salir");
                        opcionMenu2 = sc.nextInt();
                        switch (opcionMenu2) {
                            case 1: {
                                System.out.println("Ingrese su nombre: ");
                                sc = new Scanner(System.in);
                                String nombre = sc.nextLine();
                                System.out.println("Ingrese su edad: ");
                                sc = new Scanner(System.in);
                                int edad = sc.nextInt();
                                System.out.println("Ingrese su numero de identidad: ");
                                sc = new Scanner(System.in);
                                String nIdentidad = sc.nextLine();
                                sc = new Scanner(System.in);
                                System.out.println("Ingrese la cantidad inicial a pagar: ");
                                double saldo = sc.nextDouble();
                                System.out.println("Ingrese por donde pago: ");
                                System.out.println("1.)Banco y 2.)Local");
                                int metodoPago = sc.nextInt();
                                String metodoP = "";
                                if (metodoPago == 1) {
                                    metodoP = "Banco";
                                } else {
                                    metodoP = "Local";
                                }

                                clientes.add(new Clientes(nombre, edad, nIdentidad, saldo, metodoP));
                            }
                            break;
                            case 2: {
                                System.out.println("Ingrese la posicion: ");
                                int p = sc.nextInt();
                                if (p < clientes.size() && clientes.get(p) instanceof Clientes) {
                                    System.out.println("Que desea modificar: ");
                                    System.out.println("1.) El nombre: ");
                                    System.out.println("2.) El numero de identidad: ");
                                    System.out.println("3.) la edad");
                                    System.out.println("4.) sueldo a pagar");
                                    int opcionM = sc.nextInt();

                                    switch (opcionM) {
                                        case 1: {
                                            sc = new Scanner(System.in);
                                            System.out.println("Ingrese el nombre: ");
                                            String nombre = sc.nextLine();
                                            ((Clientes) clientes.get(p)).setNombre(nombre);
                                        }
                                        break;
                                        case 2: {
                                            sc = new Scanner(System.in);
                                            System.out.println("Ingrese el numero de identidad: ");
                                            String numId = sc.nextLine();
                                            ((Clientes) clientes.get(p)).setnIdentidad(numId);
                                        }
                                        break;
                                        case 3: {
                                            sc = new Scanner(System.in);
                                            System.out.println("Ingrese la edad: ");
                                            int edad = sc.nextInt();
                                            ((Clientes) clientes.get(p)).setEdad(edad);
                                        }
                                        break;
                                        case 4: {
                                            sc = new Scanner(System.in);
                                            System.out.println("Ingrese el sueldo a pagar: ");
                                            double sueldoP = sc.nextDouble();
                                            ((Clientes) clientes.get(p)).setSaldoPagar(sueldoP);
                                        }
                                        break;
                                        default:
                                            System.out.println("Saliendo...");
                                    }//fin switch
                                } else {
                                    System.out.println("Algo salio mal...");
                                }

                            }
                            break;
                            case 3: {
                                System.out.println("Ingrese la posicion de quien desea eliminar: ");
                                int p = sc.nextInt();
                                if (p < clientes.size() && clientes.get(p) instanceof Clientes) {
                                    clientes.remove(p);
                                    System.out.println("Cliente eliminado");
                                } else {
                                    System.out.println("Algo salio mal...");
                                }
                            }
                            break;
                            case 4: {
                                int cont = 0;
                                for (Object cliente : clientes) {
                                    System.out.printf("%d %s%n", cont++, cliente);
                                }
                            }
                            break;
                            case 5: {
                                if (autos.isEmpty()) {
                                    System.out.println("Aun no tiene un coche en el taller");
                                } else {
                                    System.out.println("Ingrese la posicion del cliente: ");
                                    int p = sc.nextInt();
                                    int cont = 0;
                                    for (int i = 0; i < autos.size(); i++) {
                                        if (((Clientes) clientes.get(p)).getnIdentidad().equals(((Carros) autos.get(i)).getRefD())) {
                                            System.out.printf("%d %s%n", cont++, autos.get(i));
                                        }
                                    }
                                }
                            }
                            break;
                            default:
                                System.out.println("Saliendo al menu");
                        }
                    }

                }//fin case 1
                break;
                case 2: {
                    int opcionMenu3 = 0;
                    while (opcionMenu3 != 6) {
                        System.out.println("=====SubMenu Empleado===========");
                        System.out.println("\t1.)Crear Empleado");
                        System.out.println("\t2.)Modificar Empleado");
                        System.out.println("\t3.)Eliminar Empleado");
                        System.out.println("\t4.)Listar Empleados");
                        System.out.println("\t5.)Estado Trabajo");
                        System.out.println("\t6.)Salir");
                        opcionMenu3 = sc.nextInt();
                        switch (opcionMenu3) {
                            case 1: {
                                sc = new Scanner(System.in);
                                System.out.println("Ingrese el nombre: ");
                                String nombre = sc.nextLine();
                                sc = new Scanner(System.in);
                                System.out.println("Ingrese la edad: ");
                                int edad = sc.nextInt();
                                sc = new Scanner(System.in);
                                System.out.println("Ingrese el sueldo: ");
                                double sueldo = sc.nextDouble();
                                empleados.add(new Empleados(nombre, edad, "Trabajando", sueldo));
                            }
                            break;
                            case 2: {
                                System.out.println("Ingrese la posicion que desea modificar: ");
                                int p = sc.nextInt();
                                if (p < empleados.size() && empleados.get(p) instanceof Empleados) {
                                    System.out.println("Que desea modificar: ");
                                    System.out.println("1.) El nombre: ");
                                    System.out.println("2.) la edad");
                                    System.out.println("3.) sueldo a pagar");
                                    int opcionE = sc.nextInt();
                                    switch (opcionE) {
                                        case 1: {
                                            sc = new Scanner(System.in);
                                            System.out.println("Ingrese el nombre: ");
                                            String nombre = sc.nextLine();
                                            ((Empleados) empleados.get(p)).setNombre(nombre);
                                        }
                                        break;
                                        case 2: {
                                            sc = new Scanner(System.in);
                                            System.out.println("Ingrese la edad: ");
                                            int edad = sc.nextInt();
                                            ((Empleados) empleados.get(p)).setEdad(edad);
                                        }
                                        break;
                                        case 3: {
                                            sc = new Scanner(System.in);
                                            System.out.println("Ingrese el sueldo: ");
                                            double sueldo = sc.nextDouble();
                                            ((Empleados) empleados.get(p)).setSueldo(sueldo);
                                        }
                                        break;
                                        default:
                                            System.out.println("Saliendo...");
                                    }//fin switch
                                } else {
                                    System.out.println("algo salio mal");
                                }
                            }
                            break;
                            case 3: {
                                System.out.println("Ingrese la posicion de el empleado que "
                                        + "desea eliminar: ");
                                int p = sc.nextInt();
                                if (p < empleados.size() && empleados.get(p) instanceof Empleados) {
                                    empleados.remove(p);
                                } else {
                                    System.out.println("Algo salio mal");
                                }
                            }
                            break;
                            case 4: {
                                int cont = 0;
                                for (Object empleado : empleados) {
                                    System.out.printf("%d %s%n", cont++, empleado);
                                }
                            }
                            break;
                            case 5: {
                                System.out.println("Ingrese la posicion del empleado: ");
                                int p = sc.nextInt();
                                if (p < empleados.size() && empleados.get(p) instanceof Empleados) {
                                    System.out.println("Ingrese el estado del trabajo: ");
                                    System.out.println("1.) Trabajando, 2.) FueradelTrabajo");
                                    int estadoTrabajo = sc.nextInt();
                                    if (estadoTrabajo == 2) {
                                        ((Empleados) empleados.get(p)).setEstadoTrabajo("Trabajando");
                                    }
                                } else {
                                    System.out.println("Algo salio mal");
                                }

                            }
                            break;
                            default:
                                System.out.println("Regresando al Menu");
                        }
                    }

                }
                break;

                case 3: {
                    int opcionMenu4 = 0;

                    while (opcionMenu4 != 4) {
                        System.out.println("=====SubMenu Auto===========");
                        System.out.println("\t1.)Añadir Auto");
                        System.out.println("\t2.)Modificar Estado del Auto");
                        System.out.println("\t3.)Listar Auto");
                        System.out.println("\t4.)Salir");
                        opcionMenu4 = sc.nextInt();
                        switch (opcionMenu4) {
                            case 1: {
                                if (clientes.isEmpty()) {
                                    System.out.println("No hay ningun cliente");
                                } else {
                                    sc = new Scanner(System.in);
                                    System.out.println("Ingrese la marca: ");
                                    String marca = sc.nextLine();
                                    sc = new Scanner(System.in);
                                    System.out.println("Ingrese el modelo: ");
                                    String modelo = sc.nextLine();
                                    sc = new Scanner(System.in);
                                    System.out.println("Ingrese el año de fabricacion: ");
                                    String fechaC = sc.nextLine();
                                    sc = new Scanner(System.in);
                                    System.out.println("Ingrese el costo de reparacion: ");
                                    double costoR = sc.nextDouble();
                                    sc = new Scanner(System.in);
                                    System.out.println("Ingrese numero de identidad del dueño: ");
                                    String numId = sc.nextLine();
                                    String refD = "";
                                    for (int i = 0; i < clientes.size(); i++) {
                                        if (((Clientes) clientes.get(i)).getnIdentidad().equals(numId)) {
                                            refD = ((Clientes) clientes.get(i)).getnIdentidad();
                                        }
                                    }
                                    autos.add(new Carros(marca, modelo, fechaC, new Date(), "En espera de entrar a reparación", costoR, refD));
                                }
                            }

                            break;
                            case 2: {
                                sc = new Scanner(System.in);
                                System.out.println("Ingrese la posicion del auto");
                                int poscarro = sc.nextInt();
                                sc = new Scanner(System.in);
                                System.out.println("Ingrese el numero de identidad del dueño del auto: ");
                                String numId = sc.nextLine();

                                for (int i = 0; i < clientes.size(); i++) {
                                    if (((Clientes) clientes.get(i)).getnIdentidad().equals(numId) && ((Carros) autos.get(poscarro)).getEstadoAuto().equals("En espera de entrar a reparación")) {
                                        ((Carros) autos.get(poscarro)).setEstadoAuto("En reparacion");

                                    } else if (((Clientes) clientes.get(i)).getnIdentidad().equals(numId) && ((Carros) autos.get(poscarro)).getEstadoAuto().equals("En reparacion")) {
                                        ((Carros) autos.get(poscarro)).setEstadoAuto("En espera de pago reparacion");
                                        if (((Clientes) clientes.get(i)).getSaldoPagar() < ((Carros) autos.get(poscarro)).getCostoReparacion()) {
                                            double costodebe = ((Clientes) clientes.get(i)).getSaldoPagar() - ((Carros) autos.get(poscarro)).getCostoReparacion();
                                            System.out.printf("Aun debe %2f de %2f%n", Math.abs(costodebe), ((Carros) autos.get(poscarro)).getCostoReparacion());
                                            System.out.println("Ingrese cantidad de dinero que dio el cliente: ");
                                            double sueldoExtra = sc.nextDouble();
                                            System.out.println("Ingrese por donde hizo el pago, 1)Banco y 2)Local");
                                            int metodopago = sc.nextInt();
                                            String metodoPago = "";
                                            if (metodopago == 1) {
                                                metodoPago = "Banco";
                                            } else {
                                                metodoPago = "Local";
                                            }
                                            ((Clientes) clientes.get(i)).setSaldoPagar(sueldoExtra);
                                            ((Clientes) clientes.get(i)).setMetodoPago(metodoPago);
                                        }
                                    } else if (((Clientes) clientes.get(i)).getnIdentidad().equals(numId) && ((Carros) autos.get(poscarro)).getEstadoAuto().equals("En espera de pago reparacion")) {
                                        if (((Clientes) clientes.get(i)).getSaldoPagar() >= ((Carros) autos.get(poscarro)).getCostoReparacion() && ((Clientes) clientes.get(i)).getMetodoPago().equals("Banco")) {
                                            ((Carros) autos.get(poscarro)).setEstadoAuto("Saldo pagado,pero no entregado");
                                        } else {
                                            ((Carros) autos.get(poscarro)).setEstadoAuto("Saldo pagado");
                                        }
                                    } else if (((Clientes) clientes.get(i)).getnIdentidad().equals(numId) && ((Carros) autos.get(poscarro)).getEstadoAuto().equals("Saldo pagado,pero no entregado")) {
                                        ((Carros) autos.get(poscarro)).setEstadoAuto("Pago recibido, en espera de ser entregado");
                                    } else if (((Clientes) clientes.get(i)).getnIdentidad().equals(numId) && ((Carros) autos.get(poscarro)).getEstadoAuto().equals("Saldo pagado")) {
                                        ((Carros) autos.get(poscarro)).setEstadoAuto("Auto entregado");
                                    } else if (((Clientes) clientes.get(i)).getnIdentidad().equals(numId) && ((Carros) autos.get(poscarro)).getEstadoAuto().equals("Pago recibido, en espera de ser entregado")) {
                                        ((Carros) autos.get(poscarro)).setEstadoAuto("Auto entregado");
                                    }
                                }
                            }
                            break;
                            case 3: {
                                int cont = 0;
                                for (int i = 0; i < autos.size(); i++) {
                                    if (((Carros) autos.get(i)).getEstadoAuto().equals("En espera de entrar a reparación")) {
                                        System.out.printf("%d %s%n", cont++, autos.get(i));
                                    }
                                }

                                for (int i = 0; i < autos.size(); i++) {
                                    if (((Carros) autos.get(i)).getEstadoAuto().equals("En reparacion")) {
                                        System.out.printf("%d %s%n", cont++, autos.get(i));
                                    }
                                }

                                for (int i = 0; i < autos.size(); i++) {
                                    if (((Carros) autos.get(i)).getEstadoAuto().equals("En espera de pago reparacion")) {
                                        System.out.printf("%d %s%n", cont++, autos.get(i));
                                    }
                                }

                                for (int i = 0; i < autos.size(); i++) {
                                    if (((Carros) autos.get(i)).getEstadoAuto().equals("Saldo pagado,pero no entregado")) {
                                        System.out.printf("%d %s%n", cont++, autos.get(i));
                                    }
                                }

                                for (int i = 0; i < autos.size(); i++) {
                                    if (((Carros) autos.get(i)).getEstadoAuto().equals("Saldo pagado")) {
                                        System.out.printf("%d %s%n", cont++, autos.get(i));
                                    }
                                }

                                for (int i = 0; i < autos.size(); i++) {
                                    if (((Carros) autos.get(i)).getEstadoAuto().equals("Pago recibido, en espera de ser entregado")) {
                                        System.out.printf("%d %s%n", cont++, autos.get(i));
                                    }

                                }
                                for (int i = 0; i < autos.size(); i++) {
                                    if (((Carros) autos.get(i)).getEstadoAuto().equals("Auto entregado")) {
                                        System.out.printf("%d %s%n", cont++, autos.get(i));
                                    }
                                }
                            }
                            break;

                            default:
                                System.out.println("Saliendo al menu");
                        }

                    }
                }
                break;
                default:
                    System.out.println("Programa salido exitosamente");
            }
        }

    }

}
