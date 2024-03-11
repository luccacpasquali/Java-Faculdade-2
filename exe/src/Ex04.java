import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

        int[] numUsu = new int[5];
        int n ;

        Scanner leitor = new Scanner(System.in);

        for (int i = 0; i < numUsu.length; i++) {
            System.out.println("Digite o ["+(i+1)+"] numero: ");
            numUsu[i] = leitor.nextInt();
        }

        System.out.println("Agora digite o numero [n]");
        n = leitor.nextInt();

        for (int i = 0; i < numUsu.length; i++) {
            if(numUsu[i] < n){
                System.out.println("O numero do indicie["+(i+1)+"] é menor que o numeor [n]");
            }
        }

    }
}

//4. Elabore um programa que leia um vetor de 5 números digitados pelo usuário e uma variável de um número n qualquer,
// depois mostre na tela o índice dos elementos quesão inferiores a n