package br.com.estudos.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.estudos.springboot.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
