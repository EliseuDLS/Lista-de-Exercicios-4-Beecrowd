import java.util.Scanner;
public class Ex_Beecrowd_1174{
    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args){

        int tamanhoVetor = 5;
        float vetor[] = new float[tamanhoVetor];

        vetor = lerVetor(vetor);
        imprimirVetor(vetor);
    }

    public static float[] lerVetor(float[] vetor){

        for (int i = 0; i < vetor.length; i++){
            vetor[i] = LER.nextFloat();
        }

        return vetor;
    }

    public static void imprimirVetor(float[] vetor){

        for (int i = 0; i < vetor.length; i++){
            if(vetor[i] <= 10){
                System.out.println("A[" + i + "] = " + vetor[i]);
            }
        }
    }
}