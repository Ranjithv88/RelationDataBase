package com.SpringBoot.RelationDataBase.Repository;

import com.SpringBoot.RelationDataBase.Model.CartIterm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartItermRepository extends JpaRepository<CartIterm,Long> {
}
