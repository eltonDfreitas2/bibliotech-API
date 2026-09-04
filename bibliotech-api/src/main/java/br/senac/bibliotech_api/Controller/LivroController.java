package br.senac.bibliotech_api.Controller;

import br.senac.bibliotech_api.Model.Livro;
import br.senac.bibliotech_api.Service.Livro.livroService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/livros")
public class LivroController {

    private final livroService service;


    public LivroController(livroService service) {
        this.service = service;
    }

    @GetMapping
    public List<Livro> obterTodos() {
        return service.listarLivros();
    }
}
