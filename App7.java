package App6;

public class App7 {
    static int suma(int n) {
        int total;
        if(n <= 0){
            total = 0;
        }else{
            total = n + suma(n - 1);
        }return total;
    }

    public static void main(String[] args){
        int number = 5;
        int sumas = suma(number);
        System.out.print("El resultado es: " + sumas);
    }
}