package com.example.demo_db_relation.repository;

import com.example.demo_db_relation.entities.Cage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CageRepository extends JpaRepository<Cage,Integer> {
}
