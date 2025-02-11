public class Filme {
    String nome;
    int anoLancamento;
    boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalAvaliacoes;
    int duracaoEmMinutos;

    int getTotalDeAvaliacoes(){
        return totalAvaliacoes;
    }

    void exibeFichaTecnica() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoLancamento);
    }

    void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalAvaliacoes++;  
    }

    double pegaMedia(){
        return somaDasAvaliacoes / totalAvaliacoes;
    }
}