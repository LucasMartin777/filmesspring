package br.com.alura.filmesspring.exercicios.exercicios3;

import java.util.*;
import java.util.stream.Collectors;

public class Ex1 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(10, 20, 30, 40, 50);
        Optional<Integer> max = numeros.stream()
                .max(Integer::compareTo);
        max.ifPresent(System.out::println); // Esperado: 50
    }
//    public static void main(String[] args) {
//        List<Integer> numeros = Arrays.asList(90,10, 20, 30, 40, 50);
//
//        // código do agrupamento
//        List<Integer> numeroos2 = numeros.stream()
//                .toList();
//
//        IntSummaryStatistics est = numeroos2.stream()
//                .collect(Collectors.summarizingInt(Integer::intValue));
//
//        System.out.println(est.getMax());
//
//    }
}
