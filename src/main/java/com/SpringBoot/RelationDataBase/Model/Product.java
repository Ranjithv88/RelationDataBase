package com.SpringBoot.RelationDataBase.Model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long productId;
    private String name;
    private String description;
    private double price;
    private long stack;
    private LocalDate CreatedOn;
    private String image;

    @ManyToMany(mappedBy = "products")
    private Set<CartIterm> cartIterms ;

    @ManyToOne
    @JoinColumn(name = "categoryId")
    private Category category;

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public long getStack() {
        return stack;
    }

    public void setStack(long stack) {
        this.stack = stack;
    }

    public LocalDate getCreatedOn() {
        return CreatedOn;
    }

    public void setCreatedOn(LocalDate createdOn) {
        CreatedOn = createdOn;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Set<CartIterm> getCartIterms() {
        return cartIterms;
    }

    public void setCartIterms(Set<CartIterm> cartIterms) {
        this.cartIterms = cartIterms;
    }

}

