package com.example.demo_db_relation.entities;

import jakarta.persistence.*;

@Entity
public class Category {

    @Id
    @Column(name = "Category_Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer categoryId;

    @Column(name = "Category_Type")
    private String categoryType;

    @OneToMany(mappedBy = "category",cascade = CascadeType.PERSIST)
    private Animal animal;

    public Category() {
    }

    public Category(String categoryType) {
        this.categoryType = categoryType;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(String categoryType) {
        this.categoryType = categoryType;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
}
