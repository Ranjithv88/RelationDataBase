package com.SpringBoot.RelationDataBase.Repository;

import com.SpringBoot.RelationDataBase.Model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdersRepository extends JpaRepository<Orders,Long> {
}
