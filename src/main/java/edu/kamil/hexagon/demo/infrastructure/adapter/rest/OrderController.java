package edu.kamil.hexagon.demo.infrastructure.adapter.rest;

import edu.kamil.hexagon.demo.application.port.in.CreateOrderUseCase;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kamil.worona@assecods.pl
 */
@RestController
@RequestMapping("/orders")
public class OrderController {
    private final CreateOrderUseCase createOrderUseCase;

    public OrderController(CreateOrderUseCase createOrderUseCase) {
        this.createOrderUseCase = createOrderUseCase;
    }

    @PostMapping
    public Long createOrder(@RequestParam String productName, @RequestParam int quantity) {
        return createOrderUseCase.createOrder(productName, quantity);
    }
}
