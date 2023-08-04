import java.util.Scanner;
public class Ex_Beecrowd_1180{
    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args){

        int tamanhoVetor = 0;

        tamanhoVetor = lerTamanhoVetor(tamanhoVetor);

        int vetor[] = new int[tamanhoVetor];
        int menorValor = Integer.MAX_VALUE;
        int posicao = 0;

        vetor = lerVetor(vetor);
        menorValor = calcularMenorValor(vetor, menorValor);
        posicao = calcularPosicao(vetor, menorValor);
        
        imprimirMenorValor_Posicao(menorValor, posicao);
    }

    public static int lerTamanhoVetor(int tamanhoVetor){

        do {
            tamanhoVetor = LER.nextInt();
        } while (tamanhoVetor <= 1 || tamanhoVetor >= 1000);

        return tamanhoVetor;
    }

    public static int[] lerVetor(int[] vetor){

        for (int i = 0; i < vetor.length; i++){
            vetor[i] = LER.nextInt();
        }

        return vetor;
    }

    public static int calcularMenorValor(int[] vetor, int menorValor){

        for (int i = 0; i < vetor.length; i++){
            if (vetor[i] < menorValor){
                menorValor = vetor[i];
            }
        }

        return menorValor;
    }

    public static int calcularPosicao(int[] vetor, int menorValor){
        int posicao = 0;

        for (int i = 0; i < vetor.length; i++){
            if (vetor[i] == menorValor){
                posicao = i;
                break; 
            }
        }

        return posicao;
    }

    public static void imprimirMenorValor_Posicao(int menorValor, int posicao){

        System.out.println("Menor valor: " + menorValor);
        System.out.println("Posicao: " + posicao);
    }
}