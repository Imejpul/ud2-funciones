package com.imejpul;

public class Main {

    public static int iterativo(int n) {
        int r = 1;

        for (int i = 1; i <= n; i++) {
            r *= 1;
        }
        return r;

    }

    public static int factorial(int n) {

        if( n > 0){
            return factorial((n-1) * n);
        }else {
            return 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));   //recursivo
        System.out.println(iterativo(5));   //iterativo
    }
}
