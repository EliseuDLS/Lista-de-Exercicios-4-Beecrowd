import java.util.Scanner;
public class Ex_Beecrowd_1172{
    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args){

        int tamanhoVetor = 10;
        int vetor[] = new int[tamanhoVetor];

        vetor = lerVetor(vetor);
        vetor = substituirValorNulo(vetor);
        imprimirVetor(vetor);
    }

    public static int[] lerVetor(int[] vetor){

        for (int i = 0; i < vetor.length; i++){
            vetor[i] = LER.nextInt();
        }

        return vetor;
    }

    public static int[] substituirValorNulo(int[] vetor){

        for (int i = 0; i < vetor.length; i++){
            if (vetor[i] <= 0) {
                vetor[i] = 1;
            } 
        }

        return vetor;
    }

    public static void imprimirVetor(int[] vetor){

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("X[" + i + "] = " + vetor[i]);
        }
    }
}