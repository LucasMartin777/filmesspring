package br.com.alura.filmesspring.exercicios.exercicios2.ex6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//Dado um objeto Pessoa com os campos nome e idade,
// filtre as pessoas com mais de 18 anos, extraia os nomes e imprima-os em ordem alfabética.
// A classe Pessoa está definida abaixo.

public class Principal {
    public static void main(String[] args) {
        List<Ex6> pessoas = Arrays.asList(
                new Ex6("Alice", 22),
                new Ex6("Bob", 17),
                new Ex6("Charlie", 19)
        );

        // código para filtrar pessoas

        pessoas.stream()
                .filter(n -> n.getIdade() >= 18)
                .map(Ex6::getNome)
                .sorted()
                .forEach(System.out::println);


    }


}

