
package com.mycompany.sistemacontroleprodutos;
//essa classe serve para os produtos que são vendidos pelo peso
public class ProdutoPesavel extends Produto {
    
    private double precoQuilo;

    public ProdutoPesavel(int codigo, String nome, double preco, String categoria, double precoQuilo) {
        super(codigo, nome, preco, categoria);
        this.precoQuilo = precoQuilo;
    } //metodo construtor referenciando a classe mãe e adicionando o atributo precoQuilo

    public double getPrecoQuilo() {
        return precoQuilo;
    } //getter para retornar o valor do quilo do produto

    public void setPrecoQuilo(double precoQuilo) {
        this.precoQuilo = precoQuilo;
    } //setter para que o gerente possa alterar o valor do quilo quando necessário

    @Override
    public void exibirDetalhes() {
        System.out.println("[" + getCodigo() + "] " + getNome() + " | " + getCategoria() + " | R$ " + String.format("%.2f", precoQuilo) + " (por kg)");
    } //sobescrevi o exibirdetalhes personalizando para esse método (retirei preço base e adicionei preço quilo)

    @Override
    public void atualizarPrecoBase(double novoValor) {
        this.precoQuilo = novoValor; // Ela ignora o preco comum e altera o quilo
    } //método sobrescrevendo o atualizar preco da classe produto, o preco atualizado será por quilo
    
}
