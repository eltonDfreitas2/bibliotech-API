package br.senac.bibliotech_api.Repository;

import br.senac.bibliotech_api.Model.Livro;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class LivroRepositorioMemoria {

    private final List<Livro> livros = new ArrayList<>();


    public LivroRepositorioMemoria() {
        livros.add(new Livro(1L, "O Elton", "freitas", 1989));
        livros.add(new Livro(2L, "O recomeço", "Elton", 2025));
    }

    public List<Livro> findAll() {
        return this.livros;
    }

        //adicionei metodo salvar
        public Livro salvar(Livro livros) {
            this.livros.add(livros);
            return livros;

    }
}
