import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[] a = {0, 5, 8, 1, -6, 4, -7, 9, 10, -14, 3, 12};
        int produtoPares = 1;


        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0 && a[i] > 0){
                produtoPares *= a[i];
                System.out.println(produtoPares);
            }
        }
        System.out.println("O produto escalar dos vetores é: "+ produtoPares);
    }
}

//12. Elabore um programa que leia um vetor de 12 elementos apresente na tela o produto dos elementos
// pares positivos (desconsiderar o zero). Exemplo: {0, 5, 8, 1, -6, 4, -7, 9, 10, -14, 3, 12} = 8 * 4 * 10 * 12 = 3840