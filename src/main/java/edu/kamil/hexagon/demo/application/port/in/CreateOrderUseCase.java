package edu.kamil.hexagon.demo.application.port.in;

/**
 * @author kamil.worona@assecods.pl
 */
public interface CreateOrderUseCase {
    Long createOrder(String productName, int quantity);
}
