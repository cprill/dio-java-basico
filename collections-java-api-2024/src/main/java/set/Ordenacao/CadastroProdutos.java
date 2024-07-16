package main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
  // atributo
  private Set<Produto> produtoSet;

  public CadastroProdutos() {
    this.produtoSet = new HashSet<>();
  }

  public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
    produtoSet.add(new Produto(cod, nome, preco, quantidade));
  }

  public Set<Produto> exibirProdutosPorNome() {
    Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
    return produtosPorNome;
  }

  public Set<Produto> exibirProdutosPorPreco() {
    Set<Produto> produtodPorPreco = new TreeSet<>(new ComparatorPorPreco());
    produtodPorPreco.addAll(produtoSet);
    return produtodPorPreco;
  }

  public static void main(String[] args) {
    // Criando uma instância do CadastroProdutos
    CadastroProdutos cadastroProdutos = new CadastroProdutos();

    // Adicionando produtos ao cadastro
    cadastroProdutos.adicionarProduto(1L, "Produto 5", 15d, 5);
    cadastroProdutos.adicionarProduto(2L, "Produto 3", 20d, 10);
    cadastroProdutos.adicionarProduto(1L, "Produto 0", 10d, 2);
    cadastroProdutos.adicionarProduto(4L, "Produto 9", 2d, 2);

    // Exibindo todos os produtos no cadastro
    System.out.println("\n" + cadastroProdutos.produtoSet);

    // Exibindo produtos ordenados por nome
    System.out.println("\n" + "Produto Por Nome:\n" + cadastroProdutos.exibirProdutosPorNome());

    // Exibindo produtos ordenados por preço
    System.out.println("\n" + "Produto Por Preço:\n" + cadastroProdutos.exibirProdutosPorPreco());
  }

}