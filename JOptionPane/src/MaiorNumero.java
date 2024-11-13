import javax.swing.JOptionPane;

public class MaiorNumero {
    public static void main(String[] args) {
        // Solicitar os numeros pra comparar
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));

        // Verificar o maior numero
        if (num1 > num2) {
            JOptionPane.showMessageDialog(null, "O maior número é: " + num1);
        } else if (num2 > num1) {
            JOptionPane.showMessageDialog(null, "O maior número é: " + num2);
        } else {
            JOptionPane.showMessageDialog(null, "Os números são iguais.");
        }
    }
}