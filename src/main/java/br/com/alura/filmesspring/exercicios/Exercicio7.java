package br.com.alura.filmesspring.exercicios;

public class Exercicio7 {


    interface Divisor {
        int dividir(int a, int b) throws ArithmeticException;
    }

    public class Main {
        public static void main(String[] args) {
            Divisor divisor = (a, b) -> {
                if (b == 0) throw new ArithmeticException("Divisão por zero");
                return a / b;
            };

            try {
                System.out.println(divisor.dividir(10, 2)); // Esperado: 5
                System.out.println(divisor.dividir(10, 0)); // Esperado: Exceção
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}



