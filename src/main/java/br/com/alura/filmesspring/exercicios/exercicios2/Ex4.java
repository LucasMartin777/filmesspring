package br.com.alura.filmesspring.exercicios.exercicios2;

import java.util.Arrays;
import java.util.List;

public class Ex4 {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("apple", "banana", "apple", "orange", "banana");
        // código da filtragem
        palavras.stream()
                .distinct()
                .forEach(System.out::println);

    }
}
