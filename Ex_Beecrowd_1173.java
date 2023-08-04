import java.util.Scanner;
public class Ex_Beecrowd_1173{
    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args){

        int tamanhoVetor = 10;
        int valorQlqr = 0;
        int vetor[] = new int[tamanhoVetor];

        valorQlqr = lerValorQlqr(valorQlqr);
        vetor[0] = valorQlqr;
        vetor = calcularVetor(vetor);
        imprimirVetor(vetor);
    }

    public static int lerValorQlqr(int valorQlqr){

        do{
            valorQlqr = LER.nextInt();
        } while (valorQlqr > 50);

        return valorQlqr;
    }

    public static int[] calcularVetor(int[] vetor){

        for (int i = 1; i < vetor.length; i++) {
            vetor[i] = 2 * vetor[i - 1];
        }

        return vetor;
    }

    public static void imprimirVetor(int[] vetor){

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("N[" + i + "] = " + vetor[i]);
        }
    }
}