
package com.mycompany.sistemacontroleprodutos;

import java.util.ArrayList; //biblioteca importada para permitir que uma lista sem tamanho pré determinado seja criada
import java.util.List; // biblioteca importada porquê contém funções de adicionar produtos na lista que serão úteis para o sistema

public class Estabelecimento { //classe que vai gerenciar todas as classes do sistema
    
    private List<Produto> produtos; // lista dos produtos sem tamanho pré determinado, utilizando a biblioteca importada
    private List<Funcionario> funcionarios; //lista dos funcionarios sem tamanho pré determinado, utilizando a biblioteca importada

    public Estabelecimento() {
        this.produtos = new ArrayList<>();
        this.funcionarios = new ArrayList<>();
    } // construtor feito para conseguir instanciar as listas vazias, para posterior adição de itens e funcionarios
    
    public void cadastrarProduto(Produto p) {
        this.produtos.add(p);
    } // metodo que adicona um item na lista (importado na biblioteca)
    
    public void cadastrarFuncionario(Funcionario f) {
        this.funcionarios.add(f);
    } // metodo que adicona um funcionario na lista (importado na biblioteca)
    
    public Produto buscarProduto (String nome) { // método que busca o produto pelo nome   
        for (int i = 0; i < produtos.size(); i++) { //for usando metodos da biblioteca para procurar o produto pelo nome   
            Produto p = produtos.get(i); //variável que guarda um item de cada vez que está sendo buscado
            if (p.getNome().equalsIgnoreCase(nome)) { // if para verificar se o nome do produto buscado pelo get é igual ao produto que o funcionário pesquisou
                return p; // retorna se os produtos forem iguais
            }
        }
        return null; // se n enocntrar o produto, retornar null
    }    
        
    public Produto buscarProduto(int codigo) { // método que busca o produto pelo código (sobrecarga aplicada, parâmetros diferentes, assinaturas diferentes). Semelhanmte ao anterior  
        for (int i = 0; i < produtos.size(); i++) {  
            Produto p = produtos.get(i);
            if (p.getCodigo() == codigo) { // if para verificar se o código do produto buscado pelo get é igual ao produto que o funcionário pesquisou
                return p; 
            }
        }
        return null; 
    }
        
   public void listarProdutos() { // método que vai exibir todos os produtos da lista
       System.out.println("LISTA DE PRODUTOS");
        for (int i = 0; i < produtos.size(); i++) {
            produtos.get(i).exibirDetalhes();
        } // for utilizado para pegar cada item da lista de Produtos e exibir os detlhes com o método exibirDetalhes
   }
    
    public void listarFuncionarios() { // método que vai exibir todos os funcionarios da lista
        System.out.println("LISTA DE FUNCIONARIOS");
        for (int i = 0; i < funcionarios.size(); i++) {
            funcionarios.get(i).exibirDetalhes();
        } // for utilizado para pegar cada funcionario da lista de Funcionarios e exibir os detlhes com o método exibirDetalhes
    }
    
    public boolean atualizarPreco(int codigo, double novoValor) {
        Produto p = buscarProduto(codigo); //usando método já criado nessa classe
        if (p != null) { //if verificando se o produto existe
            p.atualizarPrecoBase(novoValor); //se o produto existir, atualiza o preco
            return true; //se o produto existir, retorna true
        } //O polimorfismo garante que o preco correto seja mudado, caso o produto seja por quilo, já que cada produto tem seu método de atualizar preço
        return false; //se o produto não existir, retorna false
    } //mwtodo para atualizar o preco de um produto
    
}
