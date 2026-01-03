package br.com.estudos.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.estudos.springboot.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
