package br.com.alura.filmesspring.exercicios.exercicios3;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex3 {

//    Dada a lista de nomes abaixo, concatene-os separados por vírgula.
//    No código a seguir, há um exemplo prático do resultado esperado.


    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Alice", "Bob", "Charlie");
        // código do agrupamento de dados

        // Resultado Esperado: "Alice, Bob, Charlie"

        String agrupamento = nomes.stream()
                .collect(Collectors.joining(", "));

        System.out.println(agrupamento);

    }
}
