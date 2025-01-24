package edu.kamil.hexagon.demo.infrastructure.adapter.persistance;

import edu.kamil.hexagon.demo.application.port.out.OrderRepository;
import edu.kamil.hexagon.demo.domain.Order;
import org.springframework.stereotype.Component;

/**
 * @author kamil.worona@assecods.pl
 */
@Component
public class JpaOrderRepository implements OrderRepository {
    private final SpringDataJpaOrderRepository repository;

    public JpaOrderRepository(SpringDataJpaOrderRepository repository) {
        this.repository = repository;
    }

    @Override
    public Order save(Order order) {
        OrderEntity entity = new OrderEntity(null, order.getProductName(), order.getQuantity());
        OrderEntity savedEntity = repository.save(entity);
        order.setId(savedEntity.getId());
        return order;
    }
}
