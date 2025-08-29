package br.com.alura.filmesspring.exercicios.exercicios1;

import java.util.Arrays;
import java.util.List;

public class Exercicio5 {


    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        numeros.replaceAll(n -> n * 3);
        System.out.println(numeros);  // Resultado: [3, 6, 9, 12, 15]
    }
}



