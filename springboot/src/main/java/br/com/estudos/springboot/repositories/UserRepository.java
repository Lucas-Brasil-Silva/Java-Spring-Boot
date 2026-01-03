package br.com.estudos.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.estudos.springboot.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
