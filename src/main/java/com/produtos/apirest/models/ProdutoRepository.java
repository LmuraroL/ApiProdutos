package com.produtos.apirest.models;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto,Long> {

	Produto findById (long id);
}
