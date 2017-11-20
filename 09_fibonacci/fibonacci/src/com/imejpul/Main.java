package com.imejpul;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static int fibonacci_iterativo(int n) {

        int a = 0;
        int b = 1;
        int c;

        for (int i = 0; i < n; i++) {
            c = b + a;
            a = b;
            b = c;
        }

        return a;
    }

    public static int fibonacci_recursivo(int n) {

        if (n > 2) {
            return fibonacci_recursivo(n - 1) + fibonacci_recursivo(n - 2);

        } else {

            return n;
        }

    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //-----------------------------------MODO RECURSIVO----------------------------------------

        System.out.print("Introduce el número de termino de la sucesión de fibonacci a calcular: ");
        int termino = Integer.parseInt(br.readLine());
        int fibTermino = 0;

        for (int i = 0; i < termino; i++) {
            fibTermino = fibonacci_recursivo(i);
        }

        System.out.println(fibTermino);

        //----------------------------------MODO ITERATIVO-------------------------------------------

        System.out.println(fibonacci_iterativo(termino));

    }
}
