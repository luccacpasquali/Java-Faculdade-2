import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[] a = {1,2,3,4,5};
        int[] b = new int[5];
        int indiceN = 0;

        for (int i = 4; i >= 0 ; i--) {
            b[i] = a[indiceN];
            indiceN++;
        }

        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}

//10. Crie um programa que leia um vetor A de 5 posições e,
// ao final da leitura, copie os elementos de A em B de forma invertida.
// Ou seja, o primeiro elemento de A é o último elemento de B,
// o segundo elemento de A é o penúltimo elemento de B, e assim por diante.