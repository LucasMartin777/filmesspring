package br.com.alura.filmesspring.model.repository;

import br.com.alura.filmesspring.model.entity.Serie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SerieRepository extends JpaRepository<Serie, Long> {//esse long é referente ao tipo do atributo principal ou seja do ID, e no caso esse é long

}
