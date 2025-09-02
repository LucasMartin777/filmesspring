package br.com.alura.filmesspring.exercicios.exercicios3;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex5 {
    // Dada uma lista de números inteiros,
    // separe os números pares dos ímpares.

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);
        // código do particionamento da lista

        Map<Boolean, List<Integer>> novaLista = numeros.stream()
                .collect(Collectors.groupingBy(e -> e % 2 == 0));

        System.out.println("Pares : " + novaLista.get(true));
        System.out.println("Impar : " + novaLista.get(false));


    }
}
