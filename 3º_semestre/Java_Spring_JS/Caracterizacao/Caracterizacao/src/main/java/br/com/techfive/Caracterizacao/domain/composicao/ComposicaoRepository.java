package br.com.techfive.Caracterizacao.domain.composicao;

import br.com.techfive.Caracterizacao.domain.componentes.Componentes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ComposicaoRepository extends JpaRepository<Composicao, Integer> {
    @Query(value = "select * from composicao where saldo_composicao > 0", nativeQuery = true)
    List<Composicao> buscaComposicoesPendentes();

    @Query(value =  "SELECT c FROM Componentes c " +
                    "JOIN FETCH c.idComposicao " +
                    "JOIN FETCH c.idUsuario " +
                    "JOIN FETCH c.codProduto " +
                    "WHERE c.idComposicao = :idComposicao")
    List<Componentes> pegarComponentesPorComposicao(Composicao idComposicao);
}