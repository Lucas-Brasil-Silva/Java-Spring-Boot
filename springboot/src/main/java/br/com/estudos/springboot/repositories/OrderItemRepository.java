package br.com.estudos.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.estudos.springboot.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
