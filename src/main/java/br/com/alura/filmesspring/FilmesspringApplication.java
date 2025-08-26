package br.com.alura.filmesspring;

import br.com.alura.filmesspring.principal.ClassePrincipal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FilmesspringApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(FilmesspringApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        ClassePrincipal run = new ClassePrincipal();
        run.exibMenu();

    }
}
