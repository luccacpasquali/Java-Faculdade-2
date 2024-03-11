import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        float[] notas = new float[5];
        float[] peso = new float[5];
        float mediaPonderada = 0;
        float totPeso = 0;


        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota ["+(i+1)+"]");
            notas[i] = leitor.nextFloat();
            System.out.println("Digite o peso ["+(i+1)+"]");
            peso[i] = leitor.nextFloat();

            mediaPonderada += (notas[i] * peso[i]);
            totPeso += peso[i];
        }

        mediaPonderada = mediaPonderada/totPeso;
        System.out.println("A media ponderada das notas é: "+ mediaPonderada);
    }
}
//Elabore um programa que leia um vetor com 5 notas de um aluno e um outro vetor com 5 pesos
// e calcule a média ponderada do aluno.