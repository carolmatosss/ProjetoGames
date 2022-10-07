package com.games.games.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.games.games.model.ProdutoModel;

//Interface vai extender o JPA 
@Repository
public interface ProdutoRepository extends JpaRepository <ProdutoModel, Long> {
	public List<ProdutoModel> findAllByTituloContainingIgnoreCase(@Param ("titulo") String titulo); 
	public List<ProdutoModel> findAllByMarcaContainingIgnoreCase(@Param ("marca") String marca);
}
