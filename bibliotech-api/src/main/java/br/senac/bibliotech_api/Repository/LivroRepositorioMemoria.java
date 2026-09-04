package br.senac.bibliotech_api.Repository;

import br.senac.bibliotech_api.Model.Livro;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class LivroRepositorioMemoria {

    private final List<Livro> livro = new ArrayList<>();


    public LivroRepositorioMemoria() {
        livro.add(new Livro(1L, "O Senhor dos Anéis", "J.R.R. Tolkien", 1954));
        livro.add(new Livro(2L, "Dom Casmurro", "Machado de Assis", 1899));
    }

    public List<Livro> findAll() {
        return this.livro;
    }
}
