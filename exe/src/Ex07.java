import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[] vet1 = new int[5];
        int[] vet2 = new int[5];
        boolean iguais = true;

        for (int i = 0; i < vet1.length; i++) {
            System.out.println("Digite o valor ["+(i+1)+"] do primeiro vetor");
            vet1[i] = leitor.nextInt();
            System.out.println("Digite o valor ["+(i+1)+"] do segundo vetor");
            vet2[i] = leitor.nextInt();
        }

        for (int i = 0; i < vet1.length; i++) {
            if (vet1[i] != vet2[i]) {
                iguais = false;
                break;
            }
        }

        if (iguais){
            System.out.println("Os vetores sao iguais");
        }else {
            System.out.println("Os vetores sao diferentes");
        }
    }
}

//7. Faça um programa que leia dois vetores de 5 elementos cada e verifique se eles são iguais ou não.
// Para serem iguais, todos os elementos dos dois vetores devem coincidir.