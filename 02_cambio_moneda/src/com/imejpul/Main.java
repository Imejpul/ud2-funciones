package com.imejpul;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    /**
     * @param e cantidad en euros € a convertir
     * @param m moneda elegida para realizar el cambio
     * @return devuelve el valor calculado a la moneda elegida
     * @author Iván Mejía
     * <p>
     * Realiza el cálculo de cambiar divisas en Euros (€) a:
     * -USD (Dolares americanos)
     * -GBP (Libras esterlinas)
     * -CNY (Yuanes)
     * -JPY (Yenes)
     */
    public static double calcularCambio(double e, String m) {

        double cambio = 0;

        //valores de cambios de divisas tomados a 06/11/2017

        switch (m.toLowerCase()){

            case "usd":
                // 1 euro = 1,16115 Dolares.
                cambio = e * 1.16115;
                break;

            case "gbp":
                // 1 euro = 0.88832 Libras esterlinas.
                cambio = e * 0.88832;
                break;

            case "cny":
                // 1 euro = 0.12994 Yuanes.
                cambio = e * 0.12994;
                break;

            case "jpy":
                // 1 euro = 132.7235 Yenes.
                cambio = e * 132.7235;
                break;

            default:
                System.out.println("¡Error!");
                break;
        }

        return cambio;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Introduzca un cantidad en euros(€): ");
        double euros = Double.parseDouble(br.readLine());

        System.out.print("Moneda a la que convertir (USD, GBP, CNY, JPY): ");
        String divisa = br.readLine();
        String moneda = "";


        switch(divisa.toLowerCase()){
            case "usd":
                moneda = "Dolares";
                break;

            case "gbp":
                moneda = "Libras esterlinas";
                break;

            case "cny":
                moneda = "Yuanes";
                break;

            case "jpy":
                moneda = "Yenes";
                break;

            default:
                System.out.println("¡Error!");
                break;

        }

        double cambio = calcularCambio(euros, divisa);

        System.out.printf("--- %.2f euros son %.2f %s ---", euros, cambio, moneda);

    }
}
