class CartaoInvalidoException extends Exception {
    public CartaoInvalidoException(String mensagem) {
        super(mensagem);
    }

    public static void verificarCartao(String numeroCartao) throws CartaoInvalidoException {
        if (numeroCartao == null || numeroCartao.length() != 16) {
            throw new CartaoInvalidoException("Número de cartão inválido: " + numeroCartao);
        }
    }
}
