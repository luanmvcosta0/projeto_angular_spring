package br.com.projeto.api.controle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Contole {

    @GetMapping("/teste")
    public String teste() {
        return "Teste concluido";
    }
    
}
