package main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    Set<Produto> produtoSet;
    public Set<Produto> exibirProdutoPorNome = new HashSet<>(produtoSet);

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(int cod, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(cod, nome, preco, quantidade));
    }

    public Set<Produto> ExibirProdutoPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutoPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPrecos());
        produtoSet.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
         CadastroProdutos cadastroProdutos = new CadastroProdutos();
         cadastroProdutos.adicionarProduto(1, "Teclado", 120.0d, 12);
         cadastroProdutos.adicionarProduto(2, "Monitor", 855.52d, 26);
         cadastroProdutos.adicionarProduto(1, "Notebook", 2682.25d, 8);
        System.out.println(cadastroProdutos.exibirProdutoPorNome);


    }
}


