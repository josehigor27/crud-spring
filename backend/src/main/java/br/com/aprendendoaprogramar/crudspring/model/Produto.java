package br.com.aprendendoaprogramar.crudspring.model;

import javax.persistence.*;

@Entity
@Table(name="tbl_produto")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_produto")
    private Integer id;
    @Column(name = "nome_produto", length = 100,nullable = false)
    private String nome;
    @Column(name = "detalhe_produto",length = 200,nullable = true)
    private String detalhe;
    @Column(name = "foto_produto",length = 255,nullable = false)
    private String linkFoto;
    @Column(name = "preco_produto",nullable = false)
    private Double preco;
    @Column(name = "disponivel_produto",length = 1)
    private Integer disponivel;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDetalhe() {
        return detalhe;
    }

    public void setDetalhe(String detalhe) {
        this.detalhe = detalhe;
    }

    public String getLinkFoto() {
        return linkFoto;
    }

    public void setLinkFoto(String linkFoto) {
        this.linkFoto = linkFoto;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(Integer disponivel) {
        this.disponivel = disponivel;
    }
}
