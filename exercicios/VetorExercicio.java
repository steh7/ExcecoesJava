package exercicios;
import java.util.Scanner;

public class VetorExercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int soma = 0;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        // Entrada de dados
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
            soma += numeros[i];
            if (numeros[i] > maior) maior = numeros[i];
            if (numeros[i] < menor) menor = numeros[i];
        }

        // Exibir soma, maior e menor valores
        System.out.println("Soma dos valores: " + soma);
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);

        // Exibir valores e destacar maior e menor
        System.out.println("Valores inseridos:");
        for (int num : numeros) {
            System.out.print(num);
            if (num == maior) System.out.print(" (maior)");
            if (num == menor) System.out.print(" (menor)");
            System.out.print("\n");
        }

        scanner.close();
    }
}
