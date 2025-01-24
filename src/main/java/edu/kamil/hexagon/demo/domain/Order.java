package edu.kamil.hexagon.demo.domain;

/**
 * @author kamil.worona@assecods.pl
 */
public class Order {
    private Long id;
    private String productName;
    private int quantity;

    public Order(String productName, int quantity) {
        this.productName = productName;
        this.quantity = quantity;
    }

    // Gettery i settery
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }
}
