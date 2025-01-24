package edu.kamil.hexagon.demo.infrastructure.adapter.persistance;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author kamil.worona@assecods.pl
 */
public interface SpringDataJpaOrderRepository extends JpaRepository<OrderEntity, Long> {
}
