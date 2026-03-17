package dev.java10x.CadastroDeNinjas.Ninjas.Controller.Service;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class NinjaController {

    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping("/boasvindas")
    public String boasVindas(){
        return "Essa é a minha primeira mensagem nessa rota";
    }

    // Adicionar ninja (CREATE)
    @PostMapping("/criar")
    public String criarNinja(){
        return "Ninja Criado";
    }

    // Mostrar todos os ninjas (READ)
    @GetMapping("/listar")
    public List<NinjaModel> listarNinjas(){
        return ninjaService.listarNinjas();
    }

    // Mostrar ninjas POR ID (READ)
    @GetMapping("/listarID")
    public String mostrarTodosOsNinjasPorId(){
        return "Mostrar Ninja Por ID";
    }

    // Alterar dados dos ninjas (UPDATE)
    @PutMapping("/alterarID")
    public String alterarNinjaPorId(){
        return "Alterar Ninja Por ID";
    }

    // Deletar Ninja (DELETE)
    @DeleteMapping("/deletarID")
    public String deletarNinjaPorId(){
        return "Ninja deletado por ID";
    }



}
