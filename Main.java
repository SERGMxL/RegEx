/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.regex;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.println("Ingrese un texto (o escriba 'salir' para terminar):");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("salir")) {
                break;
            }

            Interfaz interfaz = new Interfaz(input);

            if (interfaz.isEmail()) {
                System.out.println("El texto es un correo electronico.");
            } else if (interfaz.isPhoneNumber()) {
                System.out.println("El texto es un telefono.");
            } else if (interfaz.isURL()) {
                System.out.println("El texto es una direccion URL.");
            } else {
                System.out.println("La entrada no es reconocida o no esta escrita correctamente, intentalo de nuevo :) ");
            }
        }

        scanner.close();
    }
}