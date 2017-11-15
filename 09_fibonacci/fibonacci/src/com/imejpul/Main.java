package com.imejpul;

public class Main {

    public static int fibonacci_iterativo(int n){
        return 0;
    }

    public static int fibonacci_recursivo(int n){

        if (n > 2){
            return fibonacci_recursivo(n - 1) + fibonacci_recursivo(n - 2);

        }else {

            return n;
        }

    }

    public static void main(String[] args) {

       // System.out.println(fibonacci_iterativo(7));

        for (int i = 0; i < 15; i++) {
            System.out.print(fibonacci_recursivo(i)+" ");

        }

    }
}
