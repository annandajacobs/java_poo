import br.com.exemplo.proj.calculos.CalculadoraDeTempo;
import br.com.exemplo.proj.calculos.FiltroDeRecomendacao;
import br.com.exemplo.proj.modelos.Episodio;
import br.com.exemplo.proj.modelos.Filme;
import br.com.exemplo.proj.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O Poderoso Chefão");
        meuFilme.setAnoDeLancamento(1972);
        meuFilme.setDuracaoEmMinutos(180);

        Filme outroFilme = new Filme();
        outroFilme.setNome("Infiltrados");
        outroFilme.setAnoDeLancamento(1994);
        outroFilme.setDuracaoEmMinutos(100);

        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        Serie serie = new Serie();
        serie.setNome("Gilmore Girls"); 
        serie.setAnoDeLancamento(2000);
        serie.exibeFichaTecnica();
        serie.setTemporadas(7);
        serie.setEpisodiosPorTemporada(24);
        serie.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar a série: " + serie.getDuracaoEmMinutos());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(outroFilme);
        calculadora.inclui(meuFilme);
        calculadora.inclui(serie);
        System.out.println(calculadora.getTempoTotal());

        FiltroDeRecomendacao filtro = new FiltroDeRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(serie);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);
    }
}
   