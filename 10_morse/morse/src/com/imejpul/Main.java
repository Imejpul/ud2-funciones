package com.imejpul;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    /**
     * @param caracter El caracter que se necesita convertir a morse
     * @return devuelve el parámetro convertido a morse
     */
    public static String morse(char caracter) {
        String conversion = "";

        switch (caracter) {
            case ' ':
                conversion = "";
                break;
            case 'a':
                conversion = ".-";
                break;
            case 'b':
                conversion = "-...";
                break;
            case 'c':
                conversion = "-.-.";
                break;
            case 'd':
                conversion = "-..";
                break;
            case 'e':
                conversion = ".";
                break;
            case 'f':
                conversion = "..-.";
                break;
            case 'g':
                conversion = "--.";
                break;
            case 'h':
                conversion = "....";
                break;
            case 'i':
                conversion = "..";
                break;
            case 'j':
                conversion = ".---";
                break;
            case 'k':
                conversion = "-.-";
                break;
            case 'l':
                conversion = ".-..";
                break;
            case 'm':
                conversion = "--";
                break;
            case 'n':
                conversion = "-.";
                break;
            case 'o':
                conversion = "---";
                break;
            case 'p':
                conversion = ".--.";
                break;
            case 'q':
                conversion = "--.-";
                break;
            case 'r':
                conversion = ".-.";
                break;
            case 's':
                conversion = "...";
                break;
            case 't':
                conversion = "-";
                break;
            case 'u':
                conversion = "..-";
                break;
            case 'v':
                conversion = "...-";
                break;
            case 'w':
                conversion = ".--";
                break;
            case 'x':
                conversion = "-..-";
                break;
            case 'y':
                conversion = "-.--";
                break;
            case 'z':
                conversion = "--.";
                break;
            default:
                System.out.println("¡Error, ha introducido un caracter no registrado!");
        }

        return conversion;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String frase = "";

        do {

            System.out.print("\nEscriba frase a covertir a morse: ");
            frase = br.readLine().toLowerCase();

            if (!frase.equalsIgnoreCase("stop")) {
                int longitudFrase = frase.length();
                char caracter;

                for (int i = 0; i < longitudFrase; i++) {
                    caracter = frase.charAt(i);
                    System.out.print(morse(caracter) + " ");
                }
            }

        } while (!frase.equalsIgnoreCase("stop"));

    }
}
