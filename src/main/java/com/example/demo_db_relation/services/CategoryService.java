package com.example.demo_db_relation.services;

import com.example.demo_db_relation.entities.Category;
import com.example.demo_db_relation.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Transactional
    public void setCategory(Category category){
        categoryRepository.save(category);
    }

    @Transactional
    public Category getCategoryByName(String name){
        return categoryRepository.findByCategoryType(name);
    }

    @Transactional
    public List<Category> getAll(){
        return categoryRepository.findAll();
    }
}
