package App6;

import java.util.Scanner;

public class App9 {

    public static String CadenaInvertida (String cadena) {
        if(cadena.isEmpty()){
            return cadena;
        } else {
            return CadenaInvertida(cadena.substring(1)) +cadena.charAt(0);
        }
}

    public static void main(String[] args){
        String cadena = "HOLA";
        System.out.println("Invertida: " + CadenaInvertida(cadena));
    }
}