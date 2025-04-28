package com.example.demo_db_relation.repository;

import com.example.demo_db_relation.entities.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier,Integer> {

    @Query("Select s From Supplier s where s.supplierName=?1")
    Supplier findBySupplierName(String name);
}
