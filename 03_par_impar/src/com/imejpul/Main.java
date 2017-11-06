package com.imejpul;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    /**
     * @param valor recoge un entero introducido por teclado
     * @return devuelve "true" si el valor es par y "false" si no lo es
     * @author Iván Mejía
     * <p>
     * Dice si el valor que recoge es par o no
     */
    public static boolean par(int valor) {
        return ((valor % 2) == 0);
    }

    /**
     * @param valor recoge un entero introducido por teclado
     * @return devuelve "true" si el valor es impar y "false" si no lo es
     * @author Iván Mejía
     * <p>
     * Dice si el valor que recoge es impar o no
     */
    public static boolean impar(int valor) {
        return ((valor % 2) != 0);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Introduce un valor: ");
        int valor = Integer.parseInt(br.readLine());

        if (par(valor) == true)
            System.out.println("El valor " + valor + " es par ");

        if (impar(valor) == true)
            System.out.println("El valor " + valor + " es impar ");

    }
}
