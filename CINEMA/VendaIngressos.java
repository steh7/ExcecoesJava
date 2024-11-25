import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VendaIngressos {
    private final List<Sessao> sessoes;

    public VendaIngressos() {
        sessoes = new ArrayList<>();
        // Criando algumas sessões para simulação
        sessoes.add(new Sessao("Filme A", "Sala 1"));
        sessoes.add(new Sessao("Filme B", "Sala 2"));
    }

    public void iniciarVenda() {
        Scanner scanner = new Scanner(System.in);

        // Exibindo as sessões disponíveis
        System.out.println("Selecione uma sessão:");
        listarSessoes();

        int sessaoEscolhida = scanner.nextInt();
        Sessao sessao = sessoes.get(sessaoEscolhida - 1);

        System.out.println("Você escolheu a sessão: " + sessao.getTitulo() + " na " + sessao.getSala());
        listarAssentosDisponiveis(sessao);

        scanner.nextLine();  // Limpar o buffer de entrada
        System.out.println("Escolha o número do assento:");
        String assentoEscolhido = scanner.nextLine();

        if (sessao.reservarAssento(assentoEscolhido)) {
            System.out.println("Assento reservado com sucesso!");

            // Escolher tipo de ingresso
            System.out.println("Escolha o tipo de ingresso (1 - Inteiro, 2 - Meia-entrada):");
            int tipoIngresso = scanner.nextInt();
            String tipo = (tipoIngresso == 1) ? "Inteiro" : "Meia-entrada";
            System.out.println("Ingresso " + tipo + " reservado para o " + assentoEscolhido);

            System.out.println("Venda concluída!");
        } else {
            System.out.println("Assento não disponível. Tente novamente.");
        }
    }

    private void listarSessoes() {
        for (int i = 0; i < sessoes.size(); i++) {
            Sessao sessao = sessoes.get(i);
            System.out.println((i + 1) + ". " + sessao.getTitulo() + " - " + sessao.getSala());
        }
    }

    private void listarAssentosDisponiveis(Sessao sessao) {
        System.out.println("Assentos disponíveis para a sessão " + sessao.getTitulo() + ":");
        for (String assento : sessao.getAssentosDisponiveis()) {
            System.out.print(assento + " ");
        }
        System.out.println();
    }
}
