import java.util.Scanner;
public class Ex_Beecrowd_1743 {
    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {

        int tamanhoVetor = 6;
        int[] vetorA = new int[tamanhoVetor];
        int[] vetorB = new int[tamanhoVetor];
        String resposta = "";

        vetorA = lerVetorA(vetorA);
        vetorB = lerVetorB(vetorB);

        compararVetor(vetorA, vetorB, resposta);
        imprimirResposta(resposta);
    }

    public static int[] lerVetorA(int[] vetorA) {
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = LER.nextInt();
        }

        return vetorA;
    }

    public static int[] lerVetorB(int[] vetorB) {
        for (int i = 0; i < vetorB.length; i++) {
            vetorB[i] = LER.nextInt();
        }
        
        return vetorB;
    }

    public static String compararVetor(int[] vetorA, int[] vetorB, String resposta) {
        for (int i = 0; i < 6; i++) {
            if (vetorA[i] != vetorB[i]) {
                resposta = "Y";
            } else if (vetorA[i] == vetorB[i]) {
                resposta = "N";
            }
        }

        return resposta;
    }

    public static void imprimirResposta(String resposta) {
        System.out.println(resposta);
    }
}