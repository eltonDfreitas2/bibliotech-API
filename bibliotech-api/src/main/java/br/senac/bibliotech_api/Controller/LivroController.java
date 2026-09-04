package br.senac.bibliotech_api.Controller;

import br.senac.bibliotech_api.Model.Livro;
import br.senac.bibliotech_api.Service.LivroService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@RestController
@RequestMapping("/api/livros")
public class LivroController {

    private final LivroService service;

    public LivroController(LivroService service) {
        this.service = service;
    }

    @GetMapping
    public List<Livro> obterTodos() {
        return service.listarLivro();
    }
    //add
    @PostMapping
    public Livro cadastrarLivro(@RequestBody Livro livro) {
        return service.salvarLivro(livro);
    }
}