package edu.kamil.hexagon.demo.application.service;

import edu.kamil.hexagon.demo.application.port.in.CreateOrderUseCase;
import edu.kamil.hexagon.demo.application.port.out.OrderRepository;
import edu.kamil.hexagon.demo.domain.Order;
import org.springframework.stereotype.Service;

/**
 * @author kamil.worona@assecods.pl
 */

@Service
public class OrderService implements CreateOrderUseCase {
    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public Long createOrder(String productName, int quantity) {
        Order order = new Order(productName, quantity);
        Order savedOrder = orderRepository.save(order);
        return savedOrder.getId();
    }
}