import javax.swing.JOptionPane;

public class PositivoNegativoZero {
    public static void main(String[] args) {
        // Solicitar o número ao usuário
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));

        // Verificar se o número é positivo negativo ou zero
        if (num > 0) {
            JOptionPane.showMessageDialog(null, "O número " + num + " é POSITIVO.");
        } else if (num < 0) {
            JOptionPane.showMessageDialog(null, "O número " + num + " é NEGATIVO.");
        } else {
            JOptionPane.showMessageDialog(null, "O número é ZERO.");
        }
    }
}
