import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
         int num[] = new int[3];

        Scanner leitor = new Scanner(System.in);

        for (int i = 0; i < num.length; i++) {
            System.out.println("Digite o numero da posição "+(i+1));
            num[i] = leitor.nextInt();
        }

        for (int n = 0; n < num.length; n++) {
            System.out.println("Numero da posição ("+(n+1)+"): "+num[n]);
            if (num[n] > 0){
                System.out.println("Numero positivo\n");
            }else if(num[n] == 0){
                System.out.println("Numero igual a zero\n");
            }else {
                System.out.println("Numero negativo\n");
            }
        }
    }
}

//2.Escreva um algoritmo que leia em um vetor uma sequência finita de números digitados pelo usuário e,
// logo após, mostre o número de cada posição do vetor e se ele é positivo, negativo ou zero.