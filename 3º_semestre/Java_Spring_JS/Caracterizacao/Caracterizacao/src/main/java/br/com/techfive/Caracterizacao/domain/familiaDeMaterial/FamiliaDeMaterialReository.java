package br.com.techfive.Caracterizacao.domain.familiaDeMaterial;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FamiliaDeMaterialReository extends JpaRepository<FamiliaDeMaterial, String> {
}
