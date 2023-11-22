package br.com.techfive.Caracterizacao.domain.produto;

import br.com.techfive.Caracterizacao.domain.familiaDeMaterial.FamiliaDeMaterial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, String> {
    @Query(value = "select * from produto p where p.familia_id = :id", nativeQuery = true)
    List<Produto> findAllByProdutosEntrada(String id);

    @Query(value = "select * from produto p where p.familia_id <> :id", nativeQuery = true)
    List<Produto> findAllByProdutosComposicao(String id);
}
