class LimiteExcedidoException extends Exception {
    public LimiteExcedidoException(String mensagem) {
        super(mensagem);
    }

    public static void verificarLimite(double limite, double valor) throws LimiteExcedidoException {
        if (valor > limite) {
            throw new LimiteExcedidoException("Limite de cartão excedido! Limite: " + limite + ", Tentativa: " + valor);
        }
    }
}
