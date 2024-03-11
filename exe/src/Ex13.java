import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int n;
        System.out.println("Digite um número");
        n = leitor.nextInt();

        int[] fiboN = new int[n];
        fiboN[0] = 1;
        fiboN[1] = 1;

        for (int i = 2; i < n; i++) {
            fiboN[i] = fiboN[i-1] + fiboN[i-2];
        }

        for (int i = 0; i < fiboN.length; i++) {
            System.out.print("-"+fiboN[i]);
        }
    }
}

//13. Elabore um algoritmo que receba um número n e retorne um vetor com os n
// primeiros termos da sequência de Fibonacci. Exemplo: n = 8, vetor = {1, 1, 2, 3, 5, 8, 13, 21}.