package estoquecontrole.api.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/entradas")
public class EntradaEstoqueController {

    private final EntradaEstoqueService entradaService;

    public EntradaEstoqueController(EntradaEstoqueService entradaService) {
        this.entradaService = entradaService;
    }

    @GetMapping
    public List<EntradaEstoque> listar() {
        return entradaService.listar();
    }

    @PostMapping
    public EntradaEstoque registrarEntrada(@RequestBody EntradaEstoque entrada) {
        return entradaService.registrar(entrada);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EntradaEstoque> buscar(@PathVariable Long id) {
        return entradaService.buscar(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}

