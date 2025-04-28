package com.example.demo_db_relation.services;

import com.example.demo_db_relation.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TestProcess {

    @Autowired
    private CageService cageService;

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private SupplierService supplierService;

//    public TestProcess() {
//        this.supplierService = new SupplierService();
//        this.categoryService = new CategoryService();
//    }

    @Transactional
    public void createData(){

        FoodItem foodItem1 = new FoodItem("Insect");
        FoodItem foodItem2 = new FoodItem("Meet");
        FoodItem foodItem3 = new FoodItem("Vegetable");
        FoodItem foodItem4 = new FoodItem("Special Food");
        FoodItem foodItem5 = new FoodItem("Worm");
        FoodItem foodItem6 = new FoodItem("Sea Weeds");

        Supplier supplier1 = new Supplier("Supplier 1","111-111","Address 1");
        Supplier supplier2 = new Supplier("Supplier 2","222-222","Address 2");
        Supplier supplier3 = new Supplier("Supplier 3","333-333","Address 3");

        supplier1.addFoodItem(foodItem1);
        supplier1.addFoodItem(foodItem5);
        supplier2.addFoodItem(foodItem2);
        supplier2.addFoodItem(foodItem3);
        supplier3.addFoodItem(foodItem4);
        supplier3.addFoodItem(foodItem6);

        this.supplierService.setSupplier(supplier1);
        this.supplierService.setSupplier(supplier2);
        this.supplierService.setSupplier(supplier3);


        Cage cage1 = new Cage(101,"North");
        Cage cage2 = new Cage(102,"South");
        Cage cage3 = new Cage(103,"East");
        Cage cage4 = new Cage(104,"West");

        Animal animal1 = new Animal("Tiger",5);
        Animal animal2 = new Animal("Dove",20);
        Animal animal3 = new Animal("Lane Snapper",15);
        Animal animal4 = new Animal("Rabbit",6);

        Category category1 = new Category("mammals");
        Category category2 = new Category("fish");
        Category category3 = new Category("birds");
//        Category category4 = new Category("reptiles");
//        Category category5 = new Category("amphibians");

        animal1.addCage(cage2);
        animal2.addCage(cage1);
        animal3.addCage(cage3);
        animal4.addCage(cage4);

        animal1.addFoodItem(foodItem2);
        animal1.addFoodItem(foodItem4);

        animal2.addFoodItem(foodItem1);
        animal2.addFoodItem(foodItem5);

        animal3.addFoodItem(foodItem5);
        animal3.addFoodItem(foodItem6);

        animal4.addFoodItem(foodItem3);
        animal4.addFoodItem(foodItem4);


        category1.addAnimal(animal1);
        category1.addAnimal(animal4);
        category2.addAnimal(animal3);
        category3.addAnimal(animal2);

//        cageService.setCage(cage1);
//        cageService.setCage(cage2);
//        cageService.setCage(cage3);
//        cageService.setCage(cage4);

        this.categoryService.setCategory(category1);
        this.categoryService.setCategory(category2);
        this.categoryService.setCategory(category3);


        Category categoryResult = categoryService.getCategoryByName("mammals");

        System.out.println(categoryResult.toString());

    }
}
