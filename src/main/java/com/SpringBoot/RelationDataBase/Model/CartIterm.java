package com.SpringBoot.RelationDataBase.Model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class CartIterm {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cartItermId;
    @ManyToOne
    @JoinColumn(name = "cartId")
    private Cart cart;
    private LocalDate CreatedOn;

    public Long getCartId() {
        return cartItermId;
    }

    public void setCartId(Long cartId) {
        this.cartItermId = cartId;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public Long getCartItermId() {
        return cartItermId;
    }

    public void setCartItermId(Long cartItermId) {
        this.cartItermId = cartItermId;
    }

    public LocalDate getCreatedOn() {
        return CreatedOn;
    }

    public void setCreatedOn(LocalDate createdOn) {
        CreatedOn = createdOn;
    }
}

