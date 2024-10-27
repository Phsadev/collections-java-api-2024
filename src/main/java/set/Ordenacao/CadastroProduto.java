package main.java.set.Ordenacao;


import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {

    private Set<Produto> produtoSet;

    public CadastroProduto() {
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
        CadastroProduto cadastroProduto = new CadastroProduto();
        cadastroProduto.adicionarProduto(1, "Teclado", 120.0d, 12);
        cadastroProduto.adicionarProduto(2, "Monitor", 855.52d, 26);
        cadastroProduto.adicionarProduto(1, "Notebook", 2682.25d, 8);
        cadastroProduto.adicionarProduto(7, "Nobreake", 112.22d, 3);
        cadastroProduto.adicionarProduto(5, "Mouse", 79.50d, 7);

        System.out.println(cadastroProduto.produtoSet);

    }
}


