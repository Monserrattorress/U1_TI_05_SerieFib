package App6;

public class App6{
    static int fibonacci(int n){
        if (n <=1) return n;
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args) throws Exception {
        int n = 5;
        System.out.print("Fibonacci de 5 es: ");
        for(int i = 0;i < n;i++) {
            System.out.print(  " " + fibonacci(i));
        }
    }
}
