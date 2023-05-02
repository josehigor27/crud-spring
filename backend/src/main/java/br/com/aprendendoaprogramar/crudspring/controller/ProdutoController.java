package br.com.aprendendoaprogramar.crudspring.controller;

import br.com.aprendendoaprogramar.crudspring.model.Produto;
import br.com.aprendendoaprogramar.crudspring.services.IProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class ProdutoController {
    @Autowired
    private IProdutoService service;

    @PostMapping ("/produto")
    public ResponseEntity<Produto> criarNovoProduto(@RequestBody Produto produto){
        if (produto.getId()!=null){
            produto.setId(null);
        }
        Produto resultado = service.criarNovoProduto(produto);
        if(resultado!=null){
            return ResponseEntity.status(201).body(resultado);
        }

        return ResponseEntity.badRequest().build();
    }

    @PutMapping("/produto")
    public ResponseEntity<Produto> atualizarProduto(@RequestBody Produto produto){
        Produto resultado = service.atualizarProduto(produto);
        if(resultado != null){
            return ResponseEntity.status(200).body(resultado);
        }
        return ResponseEntity.badRequest().build();
    }

    @DeleteMapping("/produto")
    public ResponseEntity<Produto> deletarProduto(@RequestBody Produto produto){
        Produto resultado = service.deletarProduto(produto);
        if (resultado!=null){
            return ResponseEntity.status(200).body(resultado);
        }
        return ResponseEntity.badRequest().build();
    }

    @GetMapping("/produto")
    public ResponseEntity<ArrayList<Produto>> verTodosProduto(){
        return ResponseEntity.ok().body(service.verTodosProduto());
    }

    @GetMapping("/produto/search")
    public ResponseEntity<ArrayList<Produto>> verPorPalavraChave(@RequestParam(name = "key") String palavraChave){
        if(palavraChave!=null){
            return ResponseEntity.ok().body(service.verPorPalavraChave(palavraChave));
        }
        return ResponseEntity.badRequest().build();
    }
}
