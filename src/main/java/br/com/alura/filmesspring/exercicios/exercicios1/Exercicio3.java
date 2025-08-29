package br.com.alura.filmesspring.exercicios.exercicios1;

public class Exercicio3 {
    @FunctionalInterface
    public interface Transformador {
        String executar(String a);
    }

    public static void main(String[] args) {
        Transformador transformador = a -> a.toUpperCase();

        System.out.println(transformador.executar("lucas"));

    }


}
