import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {

        int vet[] = new int[5];
        Scanner leitor = new Scanner(System.in);

        //lendo entrada de valores para o vetor
        for (int i = 0; i < vet.length; i++){
            System.out.println("Digite o valor do indice ["+(i+1)+"]: ");
            vet[i] = leitor.nextInt();

            if(i > 0){
                if(vet[i] <= vet[i-1]){
                    i--;
                }
            }
        }
    }
}

//15. Elabore um algoritmo que leia 5 números do teclado e preencha um vetor de acordo com a seguinte regra:
// com exceção do 1º número, só é permitido armazenar um número se ele for maior que o anterior.
// Ex.: se o primeiro valor lido for 5, o próximo valor lido só poderá ser maior que 5.