import javax.swing.JOptionPane;

public class MediaAprovacao {
    public static void main(String[] args) {
        // Solicitar as notas ao usuário
        double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota:"));
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota:"));
        double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota:"));

        // Calcular a média
        double media = (nota1 + nota2 + nota3) / 3;

        // Exibir a mensagem de aprovação ou reprovação
        if (media >= 6) {
            JOptionPane.showMessageDialog(null, "A média é: " + media + "\nA(o) aluna(o) foi APROVADA(O)!");
        } else {
            JOptionPane.showMessageDialog(null, "A média é: " + media + "\nInfelizmente a(o) aluna(o) foi REPROVADA(O)!");
        }
    }
}
