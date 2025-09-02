package br.com.alura.filmesspring.exercicios.exercicios3.ex6789;

import java.util.*;
import java.util.stream.Collectors;
//Você tem uma lista de objetos do tipo Produto, onde cada produto possui os atributos nome (String),
// preco (double) e categoria (String). Filtre todos os produtos da categoria "Eletrônicos" com preço menor que R$ 1000,
// ordene-os pelo preço em ordem crescente e colete o resultado em uma nova lista.

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

        // código usando streams

        List<Produto> listaFiltrada = produtos.stream()
                .filter(e -> e.getCategoria().equals("Eletrônicos") && e.getPreco() < 1000)
                .sorted(Comparator.comparing(Produto::getPreco).reversed())
                .toList();

        System.out.println(listaFiltrada);

//        6 - Dada a lista de produtos acima, agrupe-os por categoria em um Map<String, List<Produto>>.

        Map<String, List<Produto>> ex6 = produtos.stream()
                .collect(Collectors.groupingBy(Produto::getCategoria));

        System.out.println("EXERCICIO 6" + ex6);


//        7 - Dada a lista de produtos acima, conte quantos produtos há em cada categoria e armazene em um Map<String, Long>.
        Map<String, Long> ex7 = produtos.stream()
                .collect(Collectors.groupingBy(Produto::getCategoria,
                        Collectors.counting()));

        System.out.println(ex7);


        //8 - Dada a lista de produtos acima, encontre o produto mais caro de cada categoria
        // e armazene o resultado em um Map<String, Optional<Produto>>.

        Map<String, Optional<Produto>> produtoCaro = produtos.stream()
                .collect(Collectors.groupingBy(Produto::getCategoria,
                        Collectors.maxBy(Comparator.comparing(Produto::getPreco))));

        System.out.println(produtoCaro);


        //9-Dada a lista de produtos acima, calcule o total dos preços dos produtos em cada categoria
        // e armazene o resultado em um Map<String, Double>.

        Map<String, Double> somaPrecoPorCategoria = produtos.stream()
                .collect(Collectors.groupingBy(Produto::getCategoria,
                        Collectors.summingDouble(Produto::getPreco)));

        System.out.println(somaPrecoPorCategoria);




    }
}
