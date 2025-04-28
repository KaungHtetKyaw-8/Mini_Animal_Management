package com.example.demo_db_relation.services;

import com.example.demo_db_relation.entities.Supplier;
import com.example.demo_db_relation.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SupplierService {

    @Autowired
    private SupplierRepository supplierRepository;

    @Transactional
    public void setSupplier(Supplier supplier){
        supplierRepository.save(supplier);
    }

    @Transactional
    public Supplier getSupplierByName(String name){
        return supplierRepository.findBySupplierName(name);
    }

}
