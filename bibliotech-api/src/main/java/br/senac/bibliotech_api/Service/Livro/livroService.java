package br.senac.bibliotech_api.Service.Livro;

import org.springframework.stereotype.Service;

@Service
public class service {
    private final LivroRepositorioMemoria repository;

   
    public LivroService(LivroRepositorioMemoria repository) {
        this.repository = repository;
    }

    public List<Livro> listarLivros() {
        return repository.findAll();
    }
}






