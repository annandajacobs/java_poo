package br.com.exemplo.proj.principal;

import java.util.ArrayList;
import java.util.Collections;

import br.com.exemplo.proj.modelos.Filme;
import br.com.exemplo.proj.modelos.Serie;
import br.com.exemplo.proj.modelos.Titulo;

public class principalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O Poderoso Chefão", 1972);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Infiltrados", 1994);
        outroFilme.avalia(6);
        var filmeDaJoana = new Filme("Barbie", 2003);
        filmeDaJoana.avalia(10);
        Serie serie = new Serie("Gilmore Girls", 2000);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDaJoana);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(serie);

        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }
        
        Collections.sort(lista);
        System.out.println(lista);

    }
}
