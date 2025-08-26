package br.com.alura.filmesspring.exercicios;

import java.util.Arrays;
import java.util.List;

public class Exercicio6 {


    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Lucas", "Carlos", "Douglas", "Robson");
        nomes.stream()
                .sorted()
                .forEach(System.out::println);


//        nomes.sort(String::compareTo);// nomes.sort((a, b) -> a.compareTo(b));
        System.out.println(nomes);
    }
}



