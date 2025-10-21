package br.com.alura.filmesspring.dto;

import br.com.alura.filmesspring.model.enums.Categoria;

public record SerieDTO(Long id,
                       String titulo,
                       Integer totalTemporadas,
                       double avaliacao,
                       Categoria genero,
                       String atores,
                       String poster,
                       String sinopse) {
}
