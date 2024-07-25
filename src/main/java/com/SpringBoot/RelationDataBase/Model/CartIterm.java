package com.SpringBoot.RelationDataBase.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
public class CartIterm {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cartItermId;

    @ManyToMany
    @JoinTable(
            name = "product_cartIterm",
            joinColumns = @JoinColumn(name = "cartItemId"),
            inverseJoinColumns = @JoinColumn(name = "productId")
    )
    @JsonIgnoreProperties("CartItem")
    private Set<Product> products ;

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

    public Set<Product> getProduct() {
        return products;
    }

    public void setProduct(Set<Product> product) {
        this.products = product;
    }

}

