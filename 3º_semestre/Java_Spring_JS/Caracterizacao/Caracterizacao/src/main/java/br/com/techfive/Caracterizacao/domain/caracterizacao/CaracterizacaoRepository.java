package br.com.techfive.Caracterizacao.domain.caracterizacao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CaracterizacaoRepository extends JpaRepository<Caracterizacao, Integer> {
}
