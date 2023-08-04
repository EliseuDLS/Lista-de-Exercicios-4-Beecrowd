import java.util.Scanner;
public class Ex_Beecrowd_1175{
    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args){

        int tamanhoVetor = 5;
        int vetorA[] = new int[tamanhoVetor];
        int vetorB[] = new int[tamanhoVetor];

        vetorA = lerVetorA(vetorA);
        vetorB = calcularVetores(vetorA, vetorB);
        imprimirVetorInvertido(vetorB);
    }

    public static int[] lerVetorA(int[] vetorA){

        for (int i = 0; i < vetorA.length; i++){
            vetorA[i] = LER.nextInt();
        }

        return vetorA;
    }


    public static int[] calcularVetores(int[] vetorA, int[] vetorB){
        
        int j = vetorA.length - 1;
        for (int i = 0; i < vetorA.length; i++) {
            vetorB[i] = vetorA[j];
            j--;
        }

        return vetorB;
    }

    public static void imprimirVetorInvertido(int[] vetorB){

        for (int i = 0; i < vetorB.length; i++) {
            System.out.println("N[" + i + "] = " + vetorB[i]);
        }
    }
}