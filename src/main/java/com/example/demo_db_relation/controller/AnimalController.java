package com.example.demo_db_relation.controller;

import com.example.demo_db_relation.component.AnimalData;
import com.example.demo_db_relation.entities.Category;
import com.example.demo_db_relation.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AnimalController {

    @Autowired
    CategoryService categoryService;

    @GetMapping("/category")
    public List<AnimalData> getCategoryByName(){
        AnimalData animalData = new AnimalData();
        Category category = categoryService.getCategoryByName("mammals");
        System.out.println(category.toString());
        animalData.setData(category);
        return List.of(animalData);
    }
}
