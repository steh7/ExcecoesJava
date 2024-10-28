package exercicios;

import java.util.ArrayList;

public class ArrayListExercicio3 {
    public static boolean buscarFruta(ArrayList<String> frutas, String fruta) {
        return frutas.contains(fruta);
    }

    public static void main(String[] args) {
        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Laranja");
        frutas.add("Manga");
        frutas.add("Uva");

        String frutaProcurada = "Banana";
        System.out.println("Fruta " + frutaProcurada + " encontrada: " + buscarFruta(frutas, frutaProcurada));
    }
}
