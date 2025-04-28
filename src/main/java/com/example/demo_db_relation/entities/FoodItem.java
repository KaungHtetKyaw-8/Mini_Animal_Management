package com.example.demo_db_relation.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class FoodItem {

    @Id
    @Column(name = "Food_Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer foodId;

    @Column(name = "Food_Name")
    private String foodName;

    @ManyToOne
    @JoinColumn(name = "Supplier_Id")
    private Supplier supplier;

    @ManyToMany(mappedBy = "foodItem")
    private List<Animal> animal = new ArrayList<>();

    public FoodItem() {
    }

    public FoodItem(String foodName) {
        this.foodName = foodName;
    }

    public Integer getFoodId() {
        return foodId;
    }

    public void setFoodId(Integer foodId) {
        this.foodId = foodId;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public List<Animal> getAnimal() {
        return animal;
    }

    public void setAnimal(List<Animal> animal) {
        this.animal = animal;
    }

    @Override
    public String toString() {
        return "FoodItem{" +
                "foodId=" + foodId +
                ", foodName='" + foodName + '\'' +
                ", supplier=" + supplier +
                '}';
    }
}
