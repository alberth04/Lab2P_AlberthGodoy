/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2p2_alberthgodoy;

import java.util.Scanner;

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
    }

}
