package com.SpringBoot.RelationDataBase.Repository;

import com.SpringBoot.RelationDataBase.Model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address,Long> {
}

