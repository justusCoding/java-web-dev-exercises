package org.launchcode.java.demos.lsn1datatypes;

public class Message {

    public static String getMessage(String lang) {

        System.out.println("choose your language: sp, fr, en ");
        if (lang.equals("sp")) {
            return "¡Hola, Mundo!";
        } else if (lang.equals("fr")) {
            return "Bonjour, le monde!";
        }  else if (lang.equals("en")) {
            return "Hello, World!";
        } else {
            return "pick a damn language";
        }
    }
}
