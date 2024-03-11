import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[] a = {0,2,4,6,8};
        int[] b = {1,3,5,7,9};
        int produtoEscalar = 0;


        for (int i = 0; i < a.length; i++) {
            produtoEscalar += a[i]*b[i];
        }
        System.out.println("O produto escalar dos vetores é: "+produtoEscalar);
    }
}

//Elabore um algoritmo que calcule o produto escalar entre dois vetores de inteiros de tamanho igual a 5.
// Exemplo: {0, 2, 4, 6, 8}, {1, 3, 5, 7, 9} = 0*1 + 2*3 + 4*5 + 6*7 + 8*9 = 140