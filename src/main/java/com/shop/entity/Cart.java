package com.shop.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "cart")
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cartId;
    private Integer productId;
    private String productName;
    private Integer quantity;
    private Double price;
    private Integer userrole;

    public Cart() {
        super();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getCartId() {
        return cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getUserrole() {
        return userrole;
    }

    public void setUserrole(Integer userrole) {
        this.userrole = userrole;
    }

    public Cart(Integer cartId, Integer productId, Integer quantity, Double price, Integer userrole) {
        this.cartId = cartId;
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
        this.userrole = userrole;

    }

    @Override
    public String toString() {
        return "Cart{" +
                "cartId=" + cartId +
                ", productId=" + productId +
                ", productName='" + productName + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", userrole=" + userrole +

                '}';
    }


}
