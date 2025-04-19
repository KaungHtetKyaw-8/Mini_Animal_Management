package com.example.demo_db_relation.entities;

import jakarta.persistence.*;

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
    private Animal animal;

    public FoodItem() {
    }

    public FoodItem(String foodName, Supplier supplier) {
        this.foodName = foodName;
        this.supplier = supplier;
    }

    public void addSupplier(Supplier supplier){
        supplier.setFoodItem(this);
        this.supplier = supplier;
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
}
