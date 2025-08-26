package br.com.alura.filmesspring.exercicios;

public class exercicio3 {
    @FunctionalInterface
    public interface Transformador {
        String executar(String a);
    }

    public static void main(String[] args) {
        Transformador transformador = a -> a.toUpperCase();

        System.out.println(transformador.executar("lucas"));

    }


}
