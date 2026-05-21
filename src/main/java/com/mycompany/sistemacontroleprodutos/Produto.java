
package com.mycompany.sistemacontroleprodutos;

public class Produto implements Consultavel {
    
    private int codigo; //codigo único de cada produto
    private String nome; //nome de cada produto
    private double preco; //preco por unidade do produto
    private String categoria; //categoria do produto

    public Produto(int codigo, String nome, double preco, String categoria) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    } // método construtor

    //getters abaixo (setters não são necessários pois os produtos não mudam depois de cadastrados)
    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getCategoria() {
        return categoria;
    } 
    //getters acima

    @Override
    public void exibirDetalhes() {
        System.out.println("[" + codigo + "] " + nome + " | " + categoria + " | " + String.format("R$ %.2f", preco) + " | ");
    } // implementa a interface Consultavel e faz a sobreposição, mostrando os dados da classe Produto
    
    public void atualizarPrecoBase(double novoValor) {
        this.preco = novoValor;
    } //método para atualizar futuramente o preco do produto
    
}
