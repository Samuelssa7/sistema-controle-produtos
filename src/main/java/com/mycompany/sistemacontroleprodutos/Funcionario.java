
package com.mycompany.sistemacontroleprodutos;

public class Funcionario implements Consultavel{
    
    private int id; //id único de cada funcionário
    private String nome; //nome do funcionario
    private String cargo; //cargo desse funcionario
    private int senha; //senha para o funcionário cadastrar produtos

    public Funcionario(int id, String nome, String cargo, int senha) {
        this.id = id;
        this.nome = nome;
        this.cargo = cargo;
        this.senha = senha;
    } //construtor da classe funcionario

    //getters abaixo para o sistema conseguir ler os dados (sem set para não serem alterados)
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public int getSenha() {
        return senha;
    }
    //getters acima para o sistema conseguir ler os dados (sem set para não serem alterados)
    
    public String getTipo() {
        return "Funcionario";
    } // esse get em específico serve para mostrar o nível de acesso e ser sobescrito pela classe Gerente
    
    @Override
    public void exibirDetalhes() {
        System.out.println("[" + id + "] | " + nome + " | " + getTipo() + " | " + cargo + " |");
    } //método implementado da interface Consultavel para mostrar os dados do funcionário, comexceção da senha
    
}
