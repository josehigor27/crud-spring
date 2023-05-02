package br.com.aprendendoaprogramar.crudspring.services;

import br.com.aprendendoaprogramar.crudspring.model.Produto;

import java.util.ArrayList;

public interface IProdutoService {

    public Produto criarNovoProduto(Produto produto);
    public Produto atualizarProduto(Produto produto);
    public Produto deletarProduto(Produto produto);
    public ArrayList<Produto> verTodosProduto();
    public ArrayList<Produto> verPorPalavraChave(String palavraChave);
}
