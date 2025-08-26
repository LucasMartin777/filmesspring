package br.com.alura.filmesspring.exercicios;

public class exercicio2 {
//    - Implemente uma expressão lambda que verifique se um número é primo.

    @FunctionalInterface
    public interface Primo {
        Boolean executar(int a);

    }

    public static void main(String[] args) {
        Primo primo = n -> {
            if (n <= 1) return false;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) return false;
            }
            return true;
        };
        System.out.println(primo.executar(11));  // Resultado: true
        System.out.println(primo.executar(12));  // Resultado: false
    }
}
