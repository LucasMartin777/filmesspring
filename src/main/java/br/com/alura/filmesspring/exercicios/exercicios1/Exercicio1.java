package br.com.alura.filmesspring.exercicios.exercicios1;

public class Exercicio1 {
//    1 - Crie uma expressão lambda que multiplique dois números inteiros.
//    A expressão deve ser implementada dentro de uma interface funcional com o método multiplicacao(int a, int b).

    @FunctionalInterface
    public interface Operacao {
        int executar(int a, int b);  // Um método abstrato

    }

    public static void main(String[] args) {
        Operacao soma = (a, b) -> a * b;
        System.out.println(soma.executar(5, 3));  // Saída: 8
    }
}



