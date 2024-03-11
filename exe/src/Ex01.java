import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {

        int[] vet = new int[5];
        float mediaVet = 0;

        Scanner leitor = new Scanner(System.in);

        for (int i = 0; i < vet.length; i++) {
            System.out.println("Digite o numero da posição " + (i + 1));
            vet[i] = leitor.nextInt();
            mediaVet += vet[i];
        }

        mediaVet /= vet.length;
        System.out.println("A media é: "+mediaVet);

        for (int i = 0; i < vet.length; i++) {

           if (vet[i] == mediaVet){
               System.out.println(vet[i]+" é igual a media");
            } else if (vet[i] > mediaVet){
               System.out.println(vet[i]+" é maior que a media");
           } else {
               System.out.println(vet[i]+" é menor que a media");
           }
        }

    }
}

// Construa um programa que leia em um vetor uma sequência de 5 números digitados pelo usuário,
// calcule a média destes valores em um outro vetor, e depois apresentena tela quais valores que são menores
// iguais ou superiores à média