package com.SpringBoot.RelationDataBase.Repository;

import com.SpringBoot.RelationDataBase.Model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends JpaRepository<Cart,Long> {
}
