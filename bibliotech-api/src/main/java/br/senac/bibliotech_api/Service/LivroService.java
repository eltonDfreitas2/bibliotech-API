package br.senac.bibliotech_api.Service;

import br.senac.bibliotech_api.Model.Livro;
import br.senac.bibliotech_api.Repository.LivroRepositorioMemoria;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {

    private final LivroRepositorioMemoria repository;

    public LivroService(LivroRepositorioMemoria repository) {
        this.repository = repository;
    }

    public List<Livro> listarLivro() {
        return repository.findAll();
    }
      //add
    public Livro salvarLivro(Livro livros) {
        return repository.salvar(livros);
    }
}