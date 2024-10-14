import java.util.Scanner;

public class ArrayExemplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do array: ");
        int tamanho = scanner.nextInt();
        int[] numeros = new int[tamanho];

        System.out.println("Digite " + tamanho + " números:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        int soma = 0;
        int maior = numeros[0];
        int menor = numeros[0];

        for (int numero : numeros) {
            soma += numero;

            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }

        double media = (double) soma / tamanho;

        System.out.println("Soma dos elementos: " + soma);
        System.out.println("Média dos elementos: " + media);
        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);

        scanner.close();
    }
}
