import java.util.Scanner;
public class Ex_Beecrowd_1176{
    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args){

        int tamanhoVetor = 61;
        long fib[] = new long[tamanhoVetor];

        int t = lerT();
        montarFib(fib);

        for (int i = 0; i < t; i++) {
            int n = lerN();
            imprimirFibN(fib, n);
        }
    }

    public static int lerT() {
        int t = LER.nextInt();
        
        return t;
    }

    public static int lerN() {
        int n = 0;
        
        do {
            n = LER.nextInt();
        } while (n < 0 || n > 60);
        
        return n;
    }

    public static void montarFib(long[] fib) {
        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i < fib.length; i++) {
            fib[i] = fib[i - 2] + fib[i - 1];
        }
    }

    public static void imprimirFibN(long[] fib, int n) {
        System.out.println("Fib(" + n + ") = " + fib[n]);
    }
}
