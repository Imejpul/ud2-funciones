package com.imejpul;

public class Main {

    public static boolean esValido(String IBAN) {

        //Quitar espacios
        //REF: (String).replaceAll(): https://stackoverflow.com/questions/5455794/removing-whitespace-from-strings-in-java
        IBAN = IBAN.replaceAll("\\s+", "");

        //Separar 4 primeros caracteres
        //REF: https://stackoverflow.com/questions/42217815/extract-first-two-characters-of-a-string-in-java

        String cuatroPrimeros = IBAN.substring(0, 4);
        String restoCadena = IBAN.substring(4);

        //convertir letras a números usando tabla

        int numero1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".indexOf(cuatroPrimeros.charAt(0) + 10);
        int numero2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".indexOf(cuatroPrimeros.charAt(1) + 10);

        //Montar String final

        String nuevoIBAN = restoCadena + numero1 + numero2 + cuatroPrimeros.substring(2);

        //hacer division y comprobar

        long numero = Long.parseLong(nuevoIBAN);

        return numero % 97 == 1;
    }

    public static void main(String[] args) {

        if (esValido("BE88 3200 3471 3441")) {
            System.out.println("OK");

        } else {
            System.out.println("ERROR");
        }
    }
}
