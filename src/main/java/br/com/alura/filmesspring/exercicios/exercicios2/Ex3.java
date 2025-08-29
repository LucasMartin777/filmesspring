package br.com.alura.filmesspring.exercicios.exercicios2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex3 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Integer> resultado = numeros.stream()
                .filter(n -> n % 2 != 0)    // só ímpares
                .map(n -> n * 2)            // multiplica por 2
                .collect(Collectors.toList()); // coleta em nova lista

        System.out.println(resultado);
    }

}
