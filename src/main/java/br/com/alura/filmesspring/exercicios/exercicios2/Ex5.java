package br.com.alura.filmesspring.exercicios.exercicios2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ex5 {
    public static void main(String[] args) {
        List<List<Integer>> listaDeNumeros = Arrays.asList(
                Arrays.asList(1, 2, 3, 4),
                Arrays.asList(5, 6, 7, 8),
                Arrays.asList(9, 10, 11, 12)
        );

        listaDeNumeros.stream()
                .flatMap(List::stream)        // achata todas as listas
                .filter(Ex5::isPrimo)        // filtra apenas primos
                .sorted()                      // ordena
                .forEach(System.out::println);// imprime cada número
    }

    // Método para verificar se o número é primo
    public static boolean isPrimo(int n) {
        if (n <= 1) return false;
        return IntStream.rangeClosed(2, (int) Math.sqrt(n))
                .noneMatch(i -> n % i == 0);
    }
}
