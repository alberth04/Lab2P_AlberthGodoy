/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2p2_alberthgodoy;

import java.util.ArrayList;
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
                                System.out.println("Ingrese el sueldo a pagar por el auto: ");
                                double sueldoPagar = sc.nextDouble();
                                clientes.add(new Clientes(nombre, edad, nIdentidad, sueldoPagar));
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
                                            ((Clientes) clientes.get(p)).set;
                                        }
                                        break;
                                        case 3: {

                                        }
                                        default:
                                            System.out.println("Saliendo...");
                                    }//fin switch
                                } else {
                                    System.out.println("Algo salio mal...");
                                }

                            }
                            break;
                            case 3: {

                            }
                            break;
                            case 4: {

                            }
                            break;
                            case 5: {

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

                            }
                            break;
                            case 2: {

                            }
                            break;
                            case 3: {

                            }
                            break;
                            case 4: {

                            }
                            break;
                            case 5: {

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
                        System.out.println("=====SubMenu Cliente===========");
                        System.out.println("\t1.)Añadir Auto");
                        System.out.println("\t2.)Modificar Estado del Auto");
                        System.out.println("\t3.)Listar Auto");
                        System.out.println("\t4.)Salir");
                        opcionMenu4 = sc.nextInt();
                        switch (opcionMenu4) {
                            case 1: {

                            }

                            break;
                            case 2: {

                            }
                            break;
                            case 3: {

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
