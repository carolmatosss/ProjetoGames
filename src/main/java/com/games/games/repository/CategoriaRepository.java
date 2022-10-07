package com.games.games.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.games.games.model.CategoriaModel;

public interface CategoriaRepository extends JpaRepository<CategoriaModel , Long>{
	
	public List<CategoriaModel> findAllByTemaContainingIgnoreCase(@Param ("tema") String tema);
	public List<CategoriaModel> findAllByDescricaoContainingIgnoreCase(@Param ("descricao") String descricao);
}
