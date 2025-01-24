package edu.kamil.hexagon.demo.application.port.out;

import edu.kamil.hexagon.demo.domain.Order;

/**
 * @author kamil.worona@assecods.pl
 */
public interface OrderRepository {
    Order save(Order order);
}
