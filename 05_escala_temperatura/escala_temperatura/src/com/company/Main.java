package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static double convertirTemperatura(double celsius, int escala){

        if (escala == 1){

            return ((celsius * 1.8) + 32);

        }else return (celsius + 273.15);


    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int opcion;
        double conversion = 0;

        do{

            System.out.println("\n=== Temperaturas ===");
            System.out.println("1. Convertir a Fahrenheit");
            System.out.println("2. Convertir a Kelvin");
            System.out.println("3. Salir");
            System.out.print("Opción: ");

            opcion = Integer.parseInt(br.readLine());


            if (opcion == 1 || opcion == 2){

                System.out.print("Introduce Tº en grados centigrados: ");
                double centigrados = Double.parseDouble(br.readLine());

                conversion = convertirTemperatura(centigrados, opcion);
            }

            if (opcion == 1){

                System.out.printf("\n%.2f grados Fahrenheit\n", conversion);

            }else if (opcion == 2){

                System.out.printf("\n%.2f grados Kelvin\n", conversion);
            }

        } while (opcion != 3);
        System.out.println("\n¡Hasta la próxima!");

    }
}
