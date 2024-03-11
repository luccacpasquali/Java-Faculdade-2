import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int[] vet = {8,4,10,1,5};
        int maiorIndex = 0 ;
        int ultimo = vet[4];

        //Imprimindo vetor ordem inicial
        for (int i = 0; i < vet.length; i++) {
            System.out.print(" -"+vet[i]);
        }

        for (int i = 1; i < vet.length; i++) {
            if (vet[i] > vet[maiorIndex]){
                maiorIndex = i;
            }
        }
        vet[4] = vet[maiorIndex];
        vet[maiorIndex] = ultimo;

        //Imprimindo vetor ordem Final
        System.out.println("");
        for (int i = 0; i < vet.length; i++) {
            System.out.print(" -"+vet[i]);
        }
    }
}

//14. Faça um programa que leia um vetor de 5 elementos e, após a leitura, posicione o maior elemento
// na última posição do vetor. Nenhum número do vetor pode ser apagado ou duplicado.
// Apresente o vetor atualizado na tela.