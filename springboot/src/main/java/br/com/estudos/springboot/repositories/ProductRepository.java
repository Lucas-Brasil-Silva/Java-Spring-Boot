package br.com.estudos.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.estudos.springboot.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
