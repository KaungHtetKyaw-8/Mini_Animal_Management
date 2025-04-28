package com.example.demo_db_relation.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Category {

    @Id
    @Column(name = "Category_Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer categoryId;

    @Column(name = "Category_Type")
    private String categoryType;

    @OneToMany(mappedBy = "category",cascade = CascadeType.PERSIST)
    private List<Animal> animal = new ArrayList<>();

    public Category() {
    }

    public Category(String categoryType) {
        this.categoryType = categoryType;
    }

    public void addAnimal(Animal animal){
        animal.setCategory(this);
        this.animal.add(animal);
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

    public List<Animal> getAnimal() {
        return animal;
    }

    public void setAnimal(List<Animal> animal) {
        this.animal = animal;
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryId=" + categoryId +
                ", categoryType='" + categoryType + '\'' +
                ", animal=" + animal +
                '}';
    }
}
