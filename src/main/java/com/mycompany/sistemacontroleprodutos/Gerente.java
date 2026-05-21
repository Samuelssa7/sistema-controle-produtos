
package com.mycompany.sistemacontroleprodutos;

public class Gerente extends Funcionario {

    public Gerente(int id, String nome, String cargo, int senha) {
        super(id, nome, cargo, senha);
    } //metodo construtor dos atributos herdados de Funcionario

    @Override
    public String getTipo() {
        return "Gerente"; 
    } //sobrescrição do getTipo da classe Funcionario
     
}
