import java.util.Scanner;
public class Ex_Beecrowd_1178{
    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args){

        int tamanhoVetor = 5;
        double valorQlqr = 0;
        double vetor[] = new double[tamanhoVetor];

        valorQlqr = lerValorQlqr(valorQlqr);
        vetor[0] = valorQlqr;
        vetor = calcularVetor(vetor);
        imprimirVetor(vetor);
    }

    public static double lerValorQlqr(double valorQlqr){

        valorQlqr = LER.nextDouble();

        return valorQlqr;
    }

    public static double[] calcularVetor(double[] vetor){

        for (int i = 1; i < vetor.length; i++){
            vetor[i] = vetor[i - 1] / 2.0;
        }

        return vetor;
    }

    public static void imprimirVetor(double[] vetor){

        for (int i = 0; i < vetor.length; i++){
            System.out.printf("N[%d] = %.4f%n", i, vetor[i]);
        }
    }
}