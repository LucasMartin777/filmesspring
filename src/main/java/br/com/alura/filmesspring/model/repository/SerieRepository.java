package br.com.alura.filmesspring.model.repository;

import br.com.alura.filmesspring.model.entity.Serie;
import br.com.alura.filmesspring.model.enums.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface SerieRepository extends JpaRepository<Serie, Long> {//esse long é referente ao tipo do atributo principal ou seja do ID, e no caso esse é long

    Optional<Serie> findByTituloContainingIgnoreCase(String nomeSerie);

    List<Serie> findByAtoresContainingIgnoreCaseAndAvaliacaoGreaterThanEqual(String nomeAtor, Double avaliacao);

    List<Serie> findTop5ByOrderByAvaliacaoDesc();

    List<Serie> findByGenero(Categoria categoria);

    List<Serie> findBytotalTemporadasLessThanEqualAndAvaliacaoGreaterThanEqual(Integer numeroTemporadas,Double avaliacao);
}
