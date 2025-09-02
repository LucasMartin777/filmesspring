package br.com.alura.filmesspring.exercicios.exercicios3;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
//Dada a lista de números inteiros abaixo,
// calcule a soma dos quadrados dos números pares.

public class Ex4 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);
        // código da filtragem e agrupamento dos dados

        int somaDosQuadrados = numeros.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .reduce(0, Integer::sum);
        System.out.println(somaDosQuadrados); // Esperado: 56 (4 + 16 + 36)


    }
}



