import javax.swing.JOptionPane;

public class ParOuImpar {
    public static void main(String[] args) {
        // Solicitar a colocação do número ao usuário
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));

        // Verificação se o número é par ou ímpar
        if (num % 2 == 0) {
            JOptionPane.showMessageDialog(null, "O número " + num + " é par.");
        } else {
            JOptionPane.showMessageDialog(null, "O número " + num + " é ímpar.");
        }
    }
}
