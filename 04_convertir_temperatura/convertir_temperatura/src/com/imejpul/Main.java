package com.imejpul;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    /**
     * @param celsius recoge la temperatura en grados celsius a convertir
     * @return devuelve la temperatura en grados Fahrenheit
     * @author Iván Mejía
     * Convierte la temperatura de grados celsius (ºC) a grados Fahrenheit (ºF)
     */
    public static double convertirTemperatura(double celsius) {
        return ((celsius * 1.8) + 32);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Introduce Tº en grados centigrados: ");
        double centigrados = Double.parseDouble(br.readLine());

        double fahrenheit = convertirTemperatura(centigrados);

        System.out.printf("%.2f grados Fahrenheit", fahrenheit);

    }
}
