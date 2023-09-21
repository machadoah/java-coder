package com.example.exerciciossb.model.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.exerciciossb.model.entities.Produto;

@Repository
// 	Em generics é definido dois item, o tipo de objeto a ser lidado e o tipo do identificador deste objeto
public interface ProdutoRepository extends CrudRepository<Produto, Integer>{
	
	// Inteface responsável por abstrair os dados!
	
}
