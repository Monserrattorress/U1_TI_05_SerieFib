package App6;

import java.util.Scanner;

public class App8 {
    static int potencia (int base, int exponente) {
        if (exponente == 0) {
            return 1;
        }
        return base * potencia(base, exponente - 1);
    }
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);
        System.out.println("Ingresa un numero: ");
        int numero1 = numeros.nextInt();
        System.out.println("Ingresa otro numero: ");
        int numero2 = numeros.nextInt();

        for (int i = 0; i<= numero2; i++){
            int resultado = potencia(numero1, i);
            System.out.println(numero1 + " ^ " + numero2 + " = " + resultado);
        }
    }
}
