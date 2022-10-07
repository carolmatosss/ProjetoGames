package com.games.games.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.games.games.model.ProdutoModel;

//Interface vai extender o JPA 

public interface ProdutoRepository extends JpaRepository <ProdutoModel, Long> {
	public List<ProdutoModel> findAllByTituloContainingIgnoreCase(@Param ("titulo") String titulo); 
	public List<ProdutoModel> findAllByMarcaContainingIgnoreCase(@Param ("marca") String marca);
}
