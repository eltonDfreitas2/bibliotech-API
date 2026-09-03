package br.senac.bibliotech_api.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class StatusController {

    @GetMapping("/ping")
    public String ping(){
        return "Bibliotech API no ar";

    }

    @GetMapping("/versao")
    public Map<String, String> versao(){
        return Map.of( "versao","2.0","modulo","09");
    }

}
