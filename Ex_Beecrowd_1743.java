import java.util.Scanner;
public class Ex_Beecrowd_1743 {
    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {

        int tamanhoVetor = 5;
        int[] vetorA = new int[tamanhoVetor];
        int[] vetorB = new int[tamanhoVetor];
        String resposta = "";

        vetorA = lerVetorA(vetorA);
        vetorB = lerVetorB(vetorB);

        compararVetor(vetorA, vetorB, resposta);
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

    public static void compararVetor(int[] vetorA, int[] vetorB, String resposta) {
        int cont = 0;

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] != vetorB[i]) {
                resposta = "Y";
            } else {
                cont++;
            }
        }

        if (cont > 0) {
            resposta = "N";
        }

        imprimirResposta(resposta);
    }

    public static void imprimirResposta(String resposta) {
        System.out.println(resposta);
    }
}
