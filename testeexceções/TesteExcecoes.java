public class TesteExcecoes {
    public static void main(String[] args) {
        // Teste para LimiteExcedidoException
        double limite = 5000.00;
        double valorTentativa = 6000.00;

        try {
            LimiteExcedidoException.verificarLimite(limite, valorTentativa);
        } catch (LimiteExcedidoException e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        }

        // Teste para CartaoInvalidoException
        String numeroCartao = "1234567891478965"; // Cartão inválido (menos de 16 dígitos)

        try {
            CartaoInvalidoException.verificarCartao(numeroCartao);
        } catch (CartaoInvalidoException e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        }
    }
}
