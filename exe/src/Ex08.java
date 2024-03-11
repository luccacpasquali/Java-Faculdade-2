import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[] a = {1,2,3,4,5};
        int[] b = {6,7,8,9,10};
        int[] c = new int[10];

        for (int i = 0; i < c.length; i++) {
            if (i <= 4){
                c[i] = a[i];
            }else {
                c[i] = b[i-5];
            }
        }

        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
    }

}

//Dados dois vetores A e B de 5 elementos cada, criar um vetor C que representa a concatenação de A e B,
// ou seja, C contém os elementos de A seguidos dos elementos de B.