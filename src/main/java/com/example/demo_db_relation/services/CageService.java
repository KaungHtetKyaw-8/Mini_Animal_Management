package com.example.demo_db_relation.services;

import com.example.demo_db_relation.entities.Cage;
import com.example.demo_db_relation.repository.CageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CageService {

    @Autowired
    private CageRepository cageRepository;

    @Transactional
    public void setCage(Cage cage){
        cageRepository.save(cage);
    }
}
