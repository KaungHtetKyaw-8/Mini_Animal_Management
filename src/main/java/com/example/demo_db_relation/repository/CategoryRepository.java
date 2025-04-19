package com.example.demo_db_relation.repository;

import com.example.demo_db_relation.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Integer> {

    @Query("Select c From Category c where c.categoryType=?1")
    Category findByCategoryType(String name);
}
