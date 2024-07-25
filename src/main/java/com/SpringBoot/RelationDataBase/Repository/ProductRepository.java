package com.SpringBoot.RelationDataBase.Repository;

import com.SpringBoot.RelationDataBase.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
}
