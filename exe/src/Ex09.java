import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[] a = {1,2,3,4,5};
        int[] b = {6,7,8,9,10};
        int[] c = new int[10];
        int indiC = 0;


        for (int i = 0; i < 5; i++) {
           if(a[i] % 2 == 0){
               c[indiC] += a[i];
               indiC++;
           }
           if (b[i] % 2 == 1){
               c[indiC] += b[i];
               indiC++;
           }
        }

        for (int n = 0; n < c.length; n++){
            if (c[n] != 0){
                System.out.println(c[n]);
            }
        }
    }
}
//Elabore um programa que leia os vetores A e B de 5 elementos e gere um vetor C de acordo com as seguintes regras:
//a. Os elementos das posições pares de C são os elementos das posições pares de A;
//b. Os elementos das posições ímpares de C são os elementos das posições ímpares de B;