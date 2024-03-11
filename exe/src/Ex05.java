import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

        int[] numUsu = new int[5];
        int n ;
        int vezesN = 0;

        Scanner leitor = new Scanner(System.in);

        for (int i = 0; i < numUsu.length; i++) {
            System.out.println("Digite o ["+(i+1)+"] numero: ");
            numUsu[i] = leitor.nextInt();
        }

        System.out.println("Agora digite o numero [n]");
        n = leitor.nextInt();

        for (int i = 0; i < numUsu.length; i++) {
            if(numUsu[i] == n){
                vezesN ++;
            }
        }
        System.out.println("O nuero [n] aparece "+vezesN+" vezes no vetor");
    }
}

//5. Elabore um programa que leia 5 números do teclado e os armazene em um vetor.
// Em seguida, leia um número n qualquer e apresente na tela a quantidade de vezes que o número n aparece no vetor.