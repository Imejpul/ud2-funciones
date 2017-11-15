package com.imejpul;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static double longitud(double r) {

        return 2 * Math.PI * r;
    }

    public static double area(double r) {

        return Math.PI * Math.pow(r, 2);
    }

    public static double volumen(double r) {

        return 4 / 3 * Math.PI * Math.pow(r, 3);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char opcion;
        double radio = 0;

        do {

            System.out.print("\n=== Calculadora ===\n" +
                    "a) Longitud de la circunferencia\n" +
                    "b) Área del círculo\n" +
                    "c) Volumen de la esfera\n" +
                    "d) Salir\n" +
                    "Opción: ");

            opcion = br.readLine().charAt(0);

            if (opcion == 'a' || opcion == 'b' || opcion == 'c') {
                System.out.print("Escribe el radio: ");
                radio = Double.parseDouble(br.readLine());
            }

            // REF: funcion format(): https://docs.oracle.com/javase/tutorial/java/data/numberformat.html

            switch (opcion) {
                case 'a':
                    System.out.printf("La longitud de la circunferencia es: %.3f\n", longitud(radio));
                    break;
                case 'b':
                    System.out.printf("El área del círculo es: %.3f\n", area(radio));
                    break;
                case 'c':
                    System.out.printf("El volumen de la esfera es: %.3f\n", volumen(radio));
                    break;
                case 'd':
                    System.out.println("¡Hasta la próxima!");
                    break;
                default:
                    System.out.println("¡Error!");
                    break;
            }

        } while (opcion != 'd');

    }
}
