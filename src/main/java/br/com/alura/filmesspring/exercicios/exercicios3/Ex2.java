package br.com.alura.filmesspring.exercicios.exercicios3;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex2 {

    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("java", "stream", "lambda", "code");

        // código do agrupamento

        // Resultado Esperado: {4=[java, code], 6=[stream, lambda]}
        Map<Integer, List<String>> ordenando = palavras.stream()

                .collect(Collectors.groupingBy(String::length));

        System.out.println(ordenando);


    }
}
