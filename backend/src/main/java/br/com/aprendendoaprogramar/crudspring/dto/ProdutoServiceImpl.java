package br.com.aprendendoaprogramar.crudspring.dto;

import br.com.aprendendoaprogramar.crudspring.dao.ProdutoDAO;
import br.com.aprendendoaprogramar.crudspring.model.Produto;
import br.com.aprendendoaprogramar.crudspring.services.IProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ProdutoServiceImpl implements IProdutoService {
    @Autowired
    private ProdutoDAO dao;
    @Override
    public Produto criarNovoProduto(Produto produto) {
        try{
            if(produto.getNome()!=null && produto.getNome().trim().length()>0){
                dao.save(produto);
                return produto;
            }
        }catch (IllegalArgumentException ex){
            System.out.println("DEBUG: " + ex.getMessage());
        }catch (Exception ex){
            System.out.println("DEBUG: " + ex.getMessage());
        }
        return null;
    }

    @Override
    public Produto atualizarProduto(Produto produto) {
        try{
            if(produto.getId()!=null && produto.getNome()!=null && produto.getNome().trim().length()>0){
                dao.save(produto);
                return produto;
            }
        }catch (IllegalArgumentException ex){
            System.out.println("DEBUG: " + ex.getMessage());
        }catch (Exception ex){
            System.out.println("DEBUG: " + ex.getMessage());
        }
        return null;
    }

    @Override
    public Produto deletarProduto(Produto produto){
        try{
            if(produto.getId()!=null){
                dao.delete(produto);
                return produto;
            }
        }catch (IllegalArgumentException ex){
            System.out.println("DEBUG: " + ex.getMessage());
        }catch (Exception ex){
            System.out.println("DEBUG: " + ex.getMessage());
        }
        return null;
    }

    @Override
    public ArrayList<Produto> verTodosProduto() {
        try{
            return (ArrayList<Produto>) dao.findAll();
        }catch(IllegalArgumentException ex){
            System.out.println("DEBUG: " + ex.getMessage());
        }catch(Exception ex){
            System.out.println("DEBUG: " + ex.getMessage());
        }
        return null;
    }

    @Override
    public ArrayList<Produto> verPorPalavraChave(String palavraChave) {
        try{
            if(palavraChave !=null){
                return dao.findByNomeContaining(palavraChave);
            }
        }catch(IllegalArgumentException ex){
            System.out.println("DEBUG: " + ex.getMessage());
        }catch (Exception ex){
            System.out.println("DEBUG: " + ex.getMessage());
        }
        return null;
    }
}
