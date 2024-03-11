import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {

        int vet[] = new int[3];
        int vetDobro[] = new int[3];

        Scanner leitor = new Scanner(System.in);

        for (int i = 0; i < vet.length; i++) {
            System.out.println("Digite o numero da posição "+(i+1));
            vet[i] = leitor.nextInt();
            vetDobro[i] = vet[i] * 2;
        }

        for (int i = 0; i < vetDobro.length; i++) {
            System.out.println("Posição ["+(i+1)+"]: "+vetDobro[i]);
        }
    }
}

//3. Faça um programa que leia em um vetor uma sequência finita de números digitadospelo usuário.
// Crie um segundo vetor que armazene o dobro de cada número doprimeiro vetor e depois apresente os valores deste vetor.