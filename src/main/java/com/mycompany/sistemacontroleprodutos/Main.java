
package com.mycompany.sistemacontroleprodutos;


public class Main {

    public static void main(String[] args) {

        // === INICIALIZAÇÃO DO SISTEMA ===
        Estabelecimento sistema = new Estabelecimento();

        // === CADASTRO DE PRODUTOS POR UNIDADE ===
        Produto refrigerante = new Produto(101, "Refrigerante Cola 2L", 7.50, "Bebida");
        Produto biscoito = new Produto(102, "Biscoito Recheado", 4.90, "Mercearia");
        Produto achocolatado = new Produto(103, "Achocolatado 200ml", 3.20, "Bebida");

        sistema.cadastrarProduto(refrigerante);
        sistema.cadastrarProduto(biscoito);
        sistema.cadastrarProduto(achocolatado);

        // === CADASTRO DE PRODUTOS POR PESO ===
        ProdutoPesavel paoFrances = new ProdutoPesavel(201, "Pao Frances", 0.0, "Padaria", 12.90);
        ProdutoPesavel queijo = new ProdutoPesavel(202, "Queijo Mussarela", 0.0, "Frios", 49.90);

        sistema.cadastrarProduto(paoFrances);
        sistema.cadastrarProduto(queijo);

        // === CADASTRO DE FUNCIONÁRIOS ===
        Funcionario carlos = new Funcionario(1, "Carlos Silva", "Atendente", 1234);
        Gerente ana = new Gerente(2, "Ana Souza", "Gerente", 5678);

        sistema.cadastrarFuncionario(carlos);
        sistema.cadastrarFuncionario(ana);

        // === LISTAGEM GERAL (exibirDetalhes — Polimorfismo por sobreposição) ===
        // exibirDetalhes() se comporta diferente para Produto e ProdutoPesavel
        System.out.println("\n===========================================");
        sistema.listarProdutos();

        // getTipo() retorna "Funcionario" ou "Gerente" automaticamente
        System.out.println("===========================================");
        sistema.listarFuncionarios();
        System.out.println("===========================================\n");

        // === BUSCA POR CÓDIGO (Polimorfismo por sobrecarga) ===
        System.out.println(">> Busca pelo codigo 101:");
        Produto encontrado = sistema.buscarProduto(101);
        if (encontrado != null) {
            encontrado.exibirDetalhes();
        }

        // === BUSCA POR NOME (mesmo método, parâmetro diferente) ===
        System.out.println("\n>> Busca pelo nome \"Queijo Mussarela\":");
        Produto encontradoPorNome = sistema.buscarProduto("Queijo Mussarela");
        if (encontradoPorNome != null) {
            encontradoPorNome.exibirDetalhes();
        }

        // === ATUALIZAÇÃO DE PREÇO ===
        // atualizarPrecoBase() é sobrescrito em ProdutoPesavel — atualiza precoQuilo
        // em Produto comum — atualiza preco por unidade
        System.out.println("\n>> Atualizando preco do Refrigerante (cod 101) para R$ 8,90...");
        sistema.atualizarPreco(101, 8.90);

        System.out.println(">> Atualizando preco do Pao Frances (cod 201) para R$ 14,50/kg...");
        sistema.atualizarPreco(201, 14.50);

        // === LISTAGEM APÓS ATUALIZAÇÃO ===
        System.out.println("\n=== PRODUTOS APOS ATUALIZACAO DE PRECOS ===");
        sistema.listarProdutos();
        System.out.println("===========================================");
    }
}
        
