package br.com.alura.filmesspring.principal;

import br.com.alura.filmesspring.service.ConsumoApi;

import java.util.Scanner;

public class ClassePrincipal {

    private Scanner leitura = new Scanner(System.in);
    private ConsumoApi consumo = new ConsumoApi();

    private final String ENDERECO = "https://www.omdbapi.com/?t=";
    private final String API_KEY = "&apikey=6585022c";

    public void exibMenu() {
        System.out.println("Digite o nome da série para a busca");
        var nomeSerie = leitura.nextLine();
        var json = consumo.conexao(ENDERECO + nomeSerie.replace(" ", "+") + API_KEY);

        //"https://www.omdbapi.com/?t=gilmore+girls&apikey=6585022c"
    }

}

