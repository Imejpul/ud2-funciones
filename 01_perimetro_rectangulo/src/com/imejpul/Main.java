package com.imejpul;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    /**
     * @param b es la base del triángulo
     * @param h es la altura del triángulo
     * @return devuelve el perímetro del triángulo de acuerdo a la formula: (base * 2) + (altura * 2)
     * @author Iván Mejía
     */
    public static double perimetroRectangulo(int b, int h) {
        return (b * 2) + (h * 2);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Introduce base: ");
        int base = Integer.parseInt(br.readLine());

        System.out.println("Introduce altura: ");
        int altura = Integer.parseInt(br.readLine());

        System.out.println("El perímetro es: " + perimetroRectangulo(base, altura));
    }
}
