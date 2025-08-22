package br.com.alura.filmesspring.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);


}
