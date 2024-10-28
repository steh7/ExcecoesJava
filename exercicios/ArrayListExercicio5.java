package exercicios;

import java.util.ArrayList; // Import ArrayList
public class ArrayListExercicio5 {
    public static int contarPares(ArrayList<Integer> numeros) {
        int contador = 0;
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(3);
        numeros.add(4);
        numeros.add(6);
        numeros.add(7);
        numeros.add(10);

        System.out.println("Quantidade de números pares: " + contarPares(numeros));
    }
}
