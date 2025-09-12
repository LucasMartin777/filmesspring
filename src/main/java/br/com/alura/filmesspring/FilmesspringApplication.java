package br.com.alura.filmesspring;

import br.com.alura.filmesspring.model.repository.SerieRepository;
import br.com.alura.filmesspring.principal.ClassePrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FilmesspringApplication implements CommandLineRunner {

    @Autowired// anotacao para o spring fazer o gerenciamento da injecao.
    private SerieRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(FilmesspringApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        ClassePrincipal run = new ClassePrincipal(repository);
        run.exibeMenu();

    }
}
