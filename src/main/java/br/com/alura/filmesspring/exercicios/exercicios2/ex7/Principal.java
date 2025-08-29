package br.com.alura.filmesspring.exercicios.exercicios2.ex7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//Você tem uma lista de objetos do tipo Produto, onde cada produto possui os atributos nome (String), preco (double) e categoria (String).
// Filtre todos os produtos da categoria "Eletrônicos" com preço menor que R$ 1000, ordene-os pelo preço em ordem crescente e colete o resultado em uma nova lista.

public class Principal {

    public static void main(String[] args) {
        List<Produto> produtos = Arrays.asList(
                new Produto("Smartphone", 800.0, "Eletrônicos"),
                new Produto("Notebook", 1500.0, "Eletrônicos"),
                new Produto("Teclado", 200.0, "Eletrônicos"),
                new Produto("Cadeira", 300.0, "Móveis"),
                new Produto("Monitor", 900.0, "Eletrônicos"),
                new Produto("Mesa", 700.0, "Móveis")
        );

        // código para filtrar os produtos

        List<Produto> listaNova = produtos.stream()
                .filter(n -> n.getPreco() < 1000 && n.getCategoria().equalsIgnoreCase("Eletrônicos"))
                .sorted(Comparator.comparingDouble(Produto::getPreco))
                .toList();

        System.out.println(listaNova);
    }
}