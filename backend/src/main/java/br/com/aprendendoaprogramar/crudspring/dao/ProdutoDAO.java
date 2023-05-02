package br.com.aprendendoaprogramar.crudspring.dao;

import br.com.aprendendoaprogramar.crudspring.model.Produto;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface ProdutoDAO extends CrudRepository<Produto,Integer> {
    public ArrayList<Produto> findByNomeContaining(String palavraChave);
}
