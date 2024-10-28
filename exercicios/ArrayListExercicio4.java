package exercicios;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExercicio4 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(2);
        numeros.add(8);
        numeros.add(1);
        numeros.add(4);

        Collections.sort(numeros);
        System.out.println("Lista ordenada: " + numeros);
    }
}
