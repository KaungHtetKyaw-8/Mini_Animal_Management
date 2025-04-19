package com.example.demo_db_relation;

import com.example.demo_db_relation.entities.Cage;
import com.example.demo_db_relation.entities.Category;
import com.example.demo_db_relation.services.CageService;
import com.example.demo_db_relation.services.CategoryService;

public class TestProcess {

    private CageService cageService;

    private CategoryService categoryService;

    public static void createData(){

        Category category1 = new Category("mammals");
        Category category2 = new Category("fish");
        Category category3 = new Category("birds");
        Category category4 = new Category("reptiles");
        Category category5 = new Category("amphibians");

        Cage cage1 = new Cage(101,"North");
        Cage cage2 = new Cage(102,"South");
        Cage cage3 = new Cage(103,"East");
        Cage cage4 = new Cage(104,"West");

    }
}
