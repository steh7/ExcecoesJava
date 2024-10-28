package exercicios;

import java.util.ArrayList;

public class ArrayListExercicio2 {
    public static void main(String[] args) {
        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Laranja");
        frutas.add("Manga");
        frutas.add("Uva");

        frutas.remove(2); // Remove a terceira fruta (índice 2)
        System.out.println("Lista de frutas após remoção: " + frutas);
    }
}
