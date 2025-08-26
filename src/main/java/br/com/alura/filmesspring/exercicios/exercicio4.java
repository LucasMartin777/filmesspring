package br.com.alura.filmesspring.exercicios;

public class exercicio4 {
    @FunctionalInterface
    public interface Operacao {
        Boolean executar(String a);

    }

    public static void main(String[] args) {
        Operacao palindromo = str -> str.contentEquals(new StringBuilder(str).reverse());
        System.out.println(palindromo.executar("radar"));  // Resultado: true
        System.out.println(palindromo.executar("java"));   // Resultado: false
    }
}


