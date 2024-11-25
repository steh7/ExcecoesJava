import java.util.ArrayList;
import java.util.List;

public class Sessao {
    private final String titulo;
    private final String sala;
    private final List<String> assentosDisponiveis;

    public Sessao(String titulo, String sala) {
        this.titulo = titulo;
        this.sala = sala;
        this.assentosDisponiveis = new ArrayList<>();
        
        // Assumindo que cada sessão tem 10 assentos numerados de 1 a 10
        for (int i = 1; i <= 10; i++) {
            assentosDisponiveis.add("Assento " + i);
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public String getSala() {
        return sala;
    }

    public List<String> getAssentosDisponiveis() {
        return assentosDisponiveis;
    }

    public boolean reservarAssento(String assento) {
        if (assentosDisponiveis.contains(assento)) {
            assentosDisponiveis.remove(assento);
            return true;
        }
        return false;
    }
}
