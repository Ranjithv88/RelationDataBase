package com.SpringBoot.RelationDataBase.Service;

import com.SpringBoot.RelationDataBase.Model.Product;
import com.SpringBoot.RelationDataBase.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> ProductGetApi() {
        return productRepository.findAll();
    }

    public String ProductPostApi(Product product) {
        productRepository.save(product);
        return " Product Data Saved ! ";
    }

    public String ProductPutApi(Product product) {
        productRepository.save(product);
        return " Product Record Update ! ";
    }

    public String ProductDeleteApi(long productId) {
        productRepository.deleteById(productId);
        return " Delete Record Successfully !";
    }

    public String ProductDeleteListApi(List<Long> productId) {
        for(Long product :productId) {
            productRepository.deleteById(product);
        }
        return " List of ID Deleted Successfully !";
    }

}

