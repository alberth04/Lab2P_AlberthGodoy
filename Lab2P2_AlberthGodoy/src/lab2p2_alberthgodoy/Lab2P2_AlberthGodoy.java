/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2p2_alberthgodoy;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author godoy
 */
public class Lab2P2_AlberthGodoy {

    public static void main(String[] args) {
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

        System.out.println("=========MENU==========");
        System.out.println("\t1.)Clientes");
        System.out.println("\t2.)Empleados");
        System.out.println("\t3.)Carros");
        System.out.println("\t4.)Salir");
        int opcionMenu = sc.nextInt();
        while (opcionMenu != 4) {
            switch (opcionMenu) {
                case 1:{
                    
                }
                break;
                case 2: {
                    
                }
                    break;
                    
                case 3: {
                    
                }
                break;
                default:
                    throw new AssertionError();
            }
        }

    }

}
